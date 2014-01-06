package com.bdqn.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bdqn.cfg.ProductDataBase;
import com.bdqn.domain.Pan;
import com.bdqn.domain.Product;

public class ChaoShiSystem {
	public void sellModel(){
		Scanner input = new Scanner(System.in);
		ProductService ps = new ProductService();
		List<Product> cproduct = new ArrayList<Product>();
		while(true){
			System.out.println("�������Ʒ���ƣ�");
			String pname = input.next();
			Product pro = ps.findByProductName(pname);
			if(pro == null){
				System.out.println("�Բ��𣬲�Ʒ�����ڣ�");
				continue;
			}
			System.out.println("�������Ʒ�Ĺ�������:");
			int pnum = input.nextInt();
			boolean isOK = ps.sellProduct(pro, pnum);
			if(!isOK){
				System.out.println("�Բ��𣬹������Ʒʧ�ܣ�");
				continue;
			}
			cproduct.add(pro);
			System.out.println("�Ƿ��������(Y/N)");
			String yesOrNo = input.next();
			if(yesOrNo.equals("N")){
				break;
			}
		}
		System.out.println("��������嵥���£�");
		float sum = 0f;
		for (Product product : cproduct) {
			System.out.println("��Ʒ����:" + product.getProductName() + "   ��Ʒ����:" + product.getProductNum() + "  С��" + product.getProductNum()*product.getUnitPrice()+"Ԫ");
			sum = sum + product.getProductNum() * product.getUnitPrice();
		}
		System.out.println("���ƣ�" + sum + "Ԫ");
	}
	public void dbPanDian(){
		int sum = 0;
		for (Product product : ProductDataBase.DB_PRODUCT) {
			sum = sum + product.getProductNum();
		}
		Pan p = new Pan(sum);
		ProductDataBase.PAN_LOGS.add(p);
		if(ProductDataBase.PAN_LOGS.size() <=1){
			Pan pp = ProductDataBase.PAN_LOGS.get(0);
			System.out.println("�����̵㣺" + pp.getProductNum() + "  ʱ�䣺" + pp.getPtime());
		}else{
			int count = ProductDataBase.PAN_LOGS.size();
			Pan ppOld = ProductDataBase.PAN_LOGS.get(count - 2);
			System.out.println("�ϴ��̵㣺" + ppOld.getProductNum() + "  ʱ��:" + ppOld.getPtime());
			Pan ppNow = ProductDataBase.PAN_LOGS.get(count -1);
			System.out.println("�����̵㣺" + ppNow.getProductNum() + "   ʱ�䣺" + ppNow.getPtime());
		}
		
	}
	
	public void sellPanDian(){
		for (Product product : ProductDataBase.SELL_PRODUCT) {
			System.out.println(product.getProductName() + ":" + product.getProductNum());
		}
	}
	
	public void jinHuo(){
		
	}
}

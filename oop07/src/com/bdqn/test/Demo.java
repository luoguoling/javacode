package com.bdqn.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bdqn.cfg.ProductDataBase;
import com.bdqn.domain.Product;
import com.bdqn.service.ChaoShiSystem;
import com.bdqn.service.ProductService;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ProductService ps = new ProductService();
//		Product tt = ps.findByProductName("����");
//		System.out.println(tt.getProductNum());
//		System.out.println(ProductDataBase.DB_PRODUCT.get(0).getProductNum());
		System.out.println("��ӭ���볬��ϵͳ��");
		ChaoShiSystem css = new ChaoShiSystem();
		while(true){
			System.out.println("��ѡ���ܣ�");
			System.out.println("1.����ϵͳ");
			System.out.println("2.����̵�ϵͳ");
			System.out.println("3.�����̵�ϵͳ");
			System.out.println("4.����ϵͳ");
			System.out.println("5.�˳�");
			Scanner input = new Scanner(System.in);
			int sel = input.nextInt();
			switch (sel) {
			case 1:
				css.sellModel();
				break;
			case 2:
				css.dbPanDian();
				break;
			case 3:
				css.sellPanDian();
				break;
			case 4:
				css.jinHuo();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("�Բ����޴˹��ܣ�");
				break;
			}			
		}
	}

}

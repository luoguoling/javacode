package com.bdqn.test;

import java.util.Scanner;

import com.bdqn.domain.Product;
import com.bdqn.service.ShopService;

public class Demo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 1.����û���Ĳ�Ʒ�Լ���Ʒ����������Ʒ�����ƣ���Ʒ�ļ۸�������,�Լ�����
		 * 2.�����û����룬������ܼ۸�
		 * 3.��ʾ�����û���Ĳ�Ʒ��Ϣ���Լ��ܼ۸�
		 * 4.���ݻ�Ա���֣��õ���Ա�ĵȼ�(0-1000:C;1000-2000:B;2000+:A)
		 * 5.���ݻ�Ա�ȼ�������ۿۣ�A:7.5�ۣ�B��8�ۣ�C:9�ۣ�
		 * 6.����û������ƷС������ϸ�����ƶ��ټ���Ʒ,ԭ�ܼۣ���Ա���֣���Ա���𣬻�Ա�ۿ��Լ�ʵ���۸�
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("��ȷ�������Ʒ������������");
		int count = input.nextInt();
		Product[] products = new Product[count];
//		String[] productNames = new String[count];
//		float[] unitPrices = new float[count];
//		int[] productNums = new int[count];
//		float[] productTotals = new float[count];
		float sum = 0.00f;//��Ʒ�ܼ۸�
		float sumVip = 0.00f;//��Ʒ�ۿ�ʵ���۸�
		int productCount = 0;//��Ʒ�ܼ���
		int jf = 0;//��Ա����
		char vip;//��Ա�ȼ�
		float vipZK = 0.00f;//��Ա�ۿ�
		for (int i = 0; i < count; i++) {
			products[i] = new Product();
			System.out.println("�������Ʒ���ƣ�");
			products[i].setProductName(input.next());
			System.out.println("�������Ʒ����:");
			products[i].setUnitPrice(input.nextFloat());
			System.out.println("�������Ʒ������");
			products[i].setProductNum(input.nextInt());
		}
		
		System.out.println("���������Ļ�Ա���֣�");
		jf = input.nextInt();
		
		//����ҵ����ShopService
		
		ShopService ss = new ShopService();
		vip = ss.getLevel(jf);
		vipZK = ss.getZK(vip);
		//����ԭ�۸�,ͬʱ����С��,�ټ����Ʒ����
		
		for (int i = 0; i < count; i++) {
			Product myProduct = products[i];
			//productTotals[i] = unitPrices[i] * productNums[i];
			sum = sum + myProduct.getProductTotal();
			productCount = productCount + myProduct.getProductNum();
		}
		
		//����ʵ���۸�
		
		sumVip = sum * vipZK;
		
		//�����ʾ
		System.out.println("��ӡ����С�嵥");
		System.out.println("�����ƹ�����" + productCount + "����Ʒ");
		System.out.println("��ϸ���£�");
		for (int i = 0; i < count; i++) {
			Product myProduct = products[i];
			System.out.println(myProduct.getProductName() + "   " + myProduct.getUnitPrice() + "    " + myProduct.getProductNum() + "      " + myProduct.getProductTotal());
		}
		System.out.println("ԭ�۸񹲼ƣ�" + sum);
		System.out.println("��Ա���֣�" + jf);
		System.out.println("��Ա�ȼ���" + vip);
		System.out.println("�����ۿۣ�" + vipZK*10 + "��");
		System.out.println("ʵ���۸�" + sumVip);
		
		
		
	}

}

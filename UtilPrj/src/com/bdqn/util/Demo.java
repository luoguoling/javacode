package com.bdqn.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.bdqn.domain.Product;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 1.����
		 * 2.���
		 * 3.�޸�
		 * 4.ɾ��
		 * 5.���
		 * 6.����
		 */
		List<String> data = new ArrayList<String>();//����
		data.add("1");//���
		data.add("2");
//		data.set(1, "3");//�޸�
//		System.out.println(data);
//		data.remove("3");
//		System.out.println(data);
//		////////////
//		List<Product> data2 = new ArrayList<Product>();
//		Product myProduct = new Product(1,"java");
//		Product myProduct2 = new Product(2,"sqlserver");
//		data2.add(myProduct2);
//		data2.add(myProduct);
//		System.out.println(data2.size());
//		//ɾ��
//		Product myProduct3 = new Product(1,"java");
//		for (Product product : data2) {
//			if(product.getProdouctID() == myProduct3.getProdouctID()){
//				data2.remove(product);
//				break;
//			}
//		}
//		System.out.println(data2.size());
//		System.out.println(data2.get(0).getProdouctID());
//		Iterator<Product> it = data2.iterator();
//		//������������ʽ
//		while(it.hasNext()){
//			Product myPro = it.next();
//			System.out.println(myPro.getProductName());
//		}
		////
		LinkedList<String> data3 = new LinkedList<String>();
		data3.add("1");
		data3.add("2");
		data3.add("3");
		data3.add(1,"4");
		data3.addAll(data);
		System.out.println(data3);
//		Vector<String> vect = new Vector<String>();
	}
	

}

package com.bdqn.test;

import com.bdqn.domain.Product;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product myPro = new Product(1,"JAVA�������", 45.4f);
		Product myPro2 = new Product(1,"JAVA�������", 45.4f);
		if(myPro.equals(myPro2)){
			System.out.println("����һ����");
		}else{
			System.out.println("����������ͬ���飡");
		}
	}

}

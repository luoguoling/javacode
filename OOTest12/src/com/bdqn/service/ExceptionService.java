package com.bdqn.service;

import java.sql.SQLException;

public class ExceptionService {
	public void test(){
		try {
			System.out.println("���ԣ�");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	/**
	 * �ڷ������ڣ������쳣
	 * @param par
	 */
	public void test(int par){
		try {
			System.out.println(10/par);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void test(String par) throws ClassNotFoundException{
		System.out.println(par.length());
	}
	public void test2(String par) throws ClassNotFoundException,Exception{
		System.out.println(par.length());
	}
	public int getCount() throws Exception{
//	    System.out.println("���Ƕ��ϣ�����");
//		System.out.println("sdfsdfsd");
		throw new Exception("�Բ��𣬴˷�����Ϊ���!ע��!!!");
	}
}

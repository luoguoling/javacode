package com.bdqn.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.bdqn.domain.Users;
import com.bdqn.service.UsersService;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�������û�����");
		String uName = input.next();
		System.out.println("���������룺");
		String upwd = input.next();
		UsersService us = new UsersService();
		boolean isOk = us.register(uName,upwd);
		if(isOk){
			System.out.println("ע��ɹ���");
			System.out.println("��ʾ���е��û�");
			List<Users> data = us.findByAll();
			for (Users users : data) {
				System.out.println(users.getuName());
			}
		}else{
			System.out.println("ע��ʧ�ܣ�");
		}
	}

}

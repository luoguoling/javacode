package com.bdqn.ui;

import java.util.Scanner;

import com.bdqn.domain.Student;
import com.bdqn.service.StudentService;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ӭ��¼ϵͳ");
		System.out.println("�������û��������룺");
		Scanner input = new Scanner(System.in);
		String[] mess = input.next().split(",");
		StudentService ss = new StudentService();
		Student myStu = ss.login(mess[0],mess[1]);
		if(myStu != null){
			System.out.println("��¼�ɹ���");
		}else{
			System.out.println("��¼ʧ��!");
		}
	}

}

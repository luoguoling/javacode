package com.bdqn.test;

import java.util.Scanner;

import com.bdqn.domain.Users;
import com.bdqn.service.UsersServcie;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ӭ��¼��������ѧԱ����ϵͳ");
		Scanner input = new Scanner(System.in);
		System.out.println("�������û��������룬�ö��ŷָ�:");
		//��֣,qaz123
		String userInfo = input.next();
		String[] userArr = userInfo.split(",");
		//����ҵ���߼���ͷ���
		UsersServcie us = new UsersServcie();
		Users myUser = us.isLogin(userArr[0],userArr[1]);
		if(myUser != null){
			System.out.println("��ӭ����" + userArr[0] + "������ǰ�Ŀͻ�״̬Ϊ��" + myUser.getuState());
		}else{
			System.out.println("�Բ���ʧ���ˣ�");
		}
	}

}

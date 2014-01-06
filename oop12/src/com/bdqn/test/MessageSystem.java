package com.bdqn.test;

import java.util.List;
import java.util.Scanner;

import com.bdqn.domain.TBLMessage;
import com.bdqn.domain.TBLUsers;
import com.bdqn.service.MessageService;
import com.bdqn.service.UsersService;

public class MessageSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ӭ�������Ϣϵͳ");
		Scanner input = new Scanner(System.in);
		System.out.println("�������û�����");
		String uname = input.next();
		System.out.println("���������룺");
		String upwd = input.next();
		UsersService us = new UsersService();
		TBLUsers user = us.isLogin(uname, upwd);
		if(user != null){
			System.out.println("��ӭ��:" + user.getuName());
			System.out.println("��ѡ���ܣ�");
			System.out.println("1.����Ϣ");
			System.out.println("2.�鿴��Ϣ");
			int mysel = input.nextInt();
			if(mysel == 1){
				System.out.println("��������Ϣ��");
				String messagecontent = input.next();
				TBLMessage message = new TBLMessage(user.getuName(), messagecontent);
				MessageService ms = new MessageService();
				boolean isOK = ms.addMessage(user, message);
				if(isOK){
					System.out.println("���ͳɹ�@");
				}else{
					System.out.println("����ʧ�ܣ�");
				}
			}else{
				System.out.println("�������û�����");
				String unamex = input.next();
				MessageService ms = new MessageService();
				List<TBLMessage> data = ms.findByUName(unamex);
				for (TBLMessage tblMessage : data) {
					System.out.println(tblMessage.getMid() + "  " + tblMessage.getuName() + "   " + tblMessage.getMessageContent() + "  " + tblMessage.getPostTime());
				}
			}
		}else{
			System.out.println("�Բ����������");
		}
		
		
	}

}

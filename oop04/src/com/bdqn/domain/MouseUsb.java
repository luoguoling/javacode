package com.bdqn.domain;

import com.bdqn.inf.IUsb;

public class MouseUsb implements IUsb{
	public void click(){
		System.out.println("�������!");
	}
	
	@Override
	public void inputData() {
		// TODO Auto-generated method stub
		System.out.println("ͨ��������������������λ��!");
	}
	@Override
	public void outputData() {
		// TODO Auto-generated method stub
		System.out.println("�����ʾ���е�����������꣡");
	}
}

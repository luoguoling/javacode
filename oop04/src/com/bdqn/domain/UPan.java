package com.bdqn.domain;

import com.bdqn.inf.IUsb;

public class UPan implements IUsb{
	public void chongDian(){
		System.out.println("��չU�̳��Ĺ��ܣ�");
	}
	
	@Override
	public void inputData() {
		// TODO Auto-generated method stub
		System.out.println("�������ݵ��������!");
	}
	@Override
	public void outputData() {
		// TODO Auto-generated method stub
		System.out.println("�������ݵ�U���У�");
	}
}

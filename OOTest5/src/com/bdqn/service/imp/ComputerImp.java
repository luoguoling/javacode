package com.bdqn.service.imp;

import com.bdqn.service.inf.Computer;

public class ComputerImp implements Computer {
	private ComputerImp(){
	}
	public static Computer getInstance(){
		return new ComputerImp();
	}
	@Override
	public void cunchu() {
		// TODO Auto-generated method stub
		System.out.println("���Ǽ���������Ĵ洢!");
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		System.out.println("���Ǽ����������ʾ!");
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("���Ǽ�����������룡");
	}

}

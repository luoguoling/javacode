package com.bdqn.test;

public class Son extends Father{
	@Override
	public void speak() {
		System.out.println("���Ӳ���˵����");
	}
	
	public void speak(String str){
		System.out.println("���ӻ�ڶ��ַ�ʽ˵��" + str);
	}
}

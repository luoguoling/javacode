package com.bdqn.domain;

public class Student extends Person{
	private String stuno = "";
	
	
	public String getStuno() {
		return stuno;
	}
	public void setStuno(String stuno) {
		this.stuno = stuno;
	}
	public void xuexi(){
		System.out.println("ѧϰ");
	}
	public void jiaozuoye(){
		System.out.println("����ҵ");
	}
	
	public Student(){
		System.out.println("�������๹�췽����");
	}
	public Student(String stuno) {
		super();
		this.stuno = stuno;
	}
	public Student(String pname, String sex, String stuno) {
		super(pname, sex);
		this.stuno = stuno;
	}
	
	
	
	
}

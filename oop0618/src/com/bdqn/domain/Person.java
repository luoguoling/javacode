package com.bdqn.domain;

public class Person {
	private String pname = "";
	private String sex = "";
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Person(String pname, String sex) {
		super();
		this.pname = pname;
		this.sex = sex;
	}
	public Person() {
		System.out.println("���Ǹ��๹�췽����");
	}
	public void talk(){
		System.out.println("˵����");
	}
	
}

package com.bdqn.domain;

public class Student extends Users{
	private String stuCode = "";
	private String banji = "";
	public String getStuCode() {
		return stuCode;
	}
	public void setStuCode(String stuCode) {
		this.stuCode = stuCode;
	}
	public String getBanji() {
		return banji;
	}
	public void setBanji(String banji) {
		this.banji = banji;
	}
	public void jf(){
		System.out.println("��ѧ����Ǯ!");
	}
	public void naoshi(){
		System.out.println("��Ƥ������");
	}
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("ѧ��Ҫѧϰ!");
	}
	public Student(){
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student stu = null;
		if (obj instanceof Student) {
			stu = (Student) obj;	
		}else{
			return false;
		}
		if(this.getStuCode().equals(stu.getStuCode())){
			return true;
		}
		return false;
	}
}

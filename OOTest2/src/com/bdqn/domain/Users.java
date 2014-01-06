package com.bdqn.domain;

public abstract class Users {
	private String userName = "";
	private String passWord = "";
	private String sex = "";
	public String getSex() {
		return sex;
	}
	private void setSex(String sex) {
		this.sex = sex;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
//	public void work(){
//		System.out.println("�û����������!");
//	}
	public abstract void work();
	public void eat(){
		System.out.println("�û���Է���");
	}
	public Users(String userName, String passWord, String sex) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.sex = sex;
	}
	public Users() {
		super();
	}
}

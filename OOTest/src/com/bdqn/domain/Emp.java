package com.bdqn.domain;

/**
 * ����һ��Ա����ʵ����
 * @author hidba
 *
 */
public class Emp {
	//Ա���ı��(���Ŵ���+ְ�����+��λ������)
	private String empCode = "";
	//Ա�����û���
	private String empName = "";
	//Ա������ʵ��
	private String empTName = "";
	//Ա������
	private String empPwd = "";
	//Ա���Ա�(0��Ů;1:��)
	private int empSex = 0;
	//Ա��������
	private int age = 0;
	public String getEmpCode() {
		return empCode;
	}
	private void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpTName() {
		return empTName;
	}
	public void setEmpTName(String empTName) {
		this.empTName = empTName;
	}
	public String getEmpPwd() {
		return empPwd;
	}
	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}
	public int getAge() {
		return age;
	}
	private void setAge(int age) {
		this.age = age;
	}
	public int getEmpSex() {
		return empSex;
	}
	/**
	 * Ĭ�Ϲ��췽��
	 */
	public Emp(){
	}
	/**
	 * ȫ�������췽��
	 * @param empCode Ա��code
	 * @param empName
	 * @param empTName
	 * @param empPwd
	 * @param empSex
	 * @param age
	 */
	private Emp(String empCode, String empName, String empTName, String empPwd,
			int empSex, int age) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.empTName = empTName;
		this.empPwd = empPwd;
		this.empSex = empSex;
		this.age = age;
	}
//	private Emp(String empCode, String empName, String empTName, int empSex,
//			int age) {
//		super();
//		this.empCode = empCode;
//		this.empName = empName;
//		this.empTName = empTName;
//		this.empPwd = "888888";
//		this.empSex = empSex;
//		this.age = age;
//	}
	
	public Emp(String empName, String empTName, String empPwd, int empSex,
			int age) {
		super();
		this.setEmpCode(this.createEmpCode());
		this.empName = empName;
		this.empTName = empTName;
		this.empPwd = empPwd;
		this.empSex = empSex;
		this.age = age;
	}
	/**
	 * ����Ա������
	 * @return
	 */
	private String createEmpCode(){
		String temp = "JN" + "03" + "0005";
		return temp;
	}
}

package com.bdqn.domain;

public class SE extends Emp {
	private int jiaoXiaoMoney = 0;
	
	public int getJiaoXiaoMoney() {
		return jiaoXiaoMoney;
	}

	public void setJiaoXiaoMoney(int jiaoXiaoMoney) {
		this.jiaoXiaoMoney = jiaoXiaoMoney;
	}

	
	public SE() {
		super();
	}

	public SE(String empCode, String empName, int baseMoney, int jiaoXiaoMoney) {
		super(empCode, empName, baseMoney);
		this.jiaoXiaoMoney = jiaoXiaoMoney;
	}

	@Override
	public void gongZi() {
		// TODO Auto-generated method stub
		System.out.println("�������ʦ����Ϊ��" + (this.getBaseMoney() + this.jiaoXiaoMoney));
	}

}

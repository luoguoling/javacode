package com.bdqn.domain;

public abstract class QiChe {
	private int bands = 0;//Ʒ��
	private String cheCode = "";//���ƺ�
//	public abstract int zhuCheFeiYong(int parDay);
	public QiChe(int bands, String cheCode) {
		super();
		this.bands = bands;
		this.cheCode = cheCode;
	}
	public int getBands() {
		return bands;
	}
	public void setBands(int bands) {
		this.bands = bands;
	}
	public String getCheCode() {
		return cheCode;
	}
	public void setCheCode(String cheCode) {
		this.cheCode = cheCode;
	}
	
}

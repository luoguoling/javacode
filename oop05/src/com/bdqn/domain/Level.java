package com.bdqn.domain;

public class Level {
	//������
	private int levelNo = 0;
	//��ǰ���������ַ�������
	private int strLen = 0;
	//��ǰ�ؿ�ѭ������
	private int maxCiShu = 0;
	//��ǰ�ؿ�����޶�ʱ��
	private int maxTime = 0;
	//��ǰ�ؿ����ͨ�����û���
	private int levelJF = 0;
	public Level(int levelNo, int strLen, int maxCiShu, int maxTime, int levelJF) {
		super();
		this.levelNo = levelNo;
		this.strLen = strLen;
		this.maxCiShu = maxCiShu;
		this.maxTime = maxTime;
		this.levelJF = levelJF;
	}
	public int getLevelNo() {
		return levelNo;
	}
	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}
	public int getStrLen() {
		return strLen;
	}
	public void setStrLen(int strLen) {
		this.strLen = strLen;
	}
	public int getMaxCiShu() {
		return maxCiShu;
	}
	public void setMaxCiShu(int maxCiShu) {
		this.maxCiShu = maxCiShu;
	}
	public int getMaxTime() {
		return maxTime;
	}
	public void setMaxTime(int maxTime) {
		this.maxTime = maxTime;
	}
	public int getLevelJF() {
		return levelJF;
	}
	public void setLevelJF(int levelJF) {
		this.levelJF = levelJF;
	}
	
	
	
}

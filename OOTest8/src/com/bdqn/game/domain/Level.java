package com.bdqn.game.domain;

public class Level {
	//����
	private int level = 1;
	//��ǰ������Ҫ���ɵ��ַ�������
	private int strLen = 0;
	//�����ַ����������ʱ
	private int maxTime = 0;
	//��ǰ����Ҫѭ���Ĵ���
	private int randMax = 0;
	//��ǰ����������ȷ�󣬻�õĻ���
	private int levelJF = 0;
	
	public int getLevelJF() {
		return levelJF;
	}
	public void setLevelJF(int levelJF) {
		this.levelJF = levelJF;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getStrLen() {
		return strLen;
	}
	public void setStrLen(int strLen) {
		this.strLen = strLen;
	}
	public int getMaxTime() {
		return maxTime;
	}
	public void setMaxTime(int maxTime) {
		this.maxTime = maxTime;
	}
	public int getRandMax() {
		return randMax;
	}
	public void setRandMax(int randMax) {
		this.randMax = randMax;
	}
	public Level(int level, int strLen, int maxTime, int randMax, int levelJF) {
		super();
		this.level = level;
		this.strLen = strLen;
		this.maxTime = maxTime;
		this.randMax = randMax;
		this.levelJF = levelJF;
	}
}

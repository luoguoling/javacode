package com.bdqn.domain;

public class Player {
	//��Ҽ���
	private int level = 1;
	//��ҿ�ʼʱ��
	private long startTime = 0;
	//�����ĳһ�������õ���ʱ��
	private int timeTotal = 0;
	//��һ���
	private int jiFen = 0;
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public int getTimeTotal() {
		return timeTotal;
	}
	public void setTimeTotal(int timeTotal) {
		this.timeTotal = timeTotal;
	}
	public int getJiFen() {
		return jiFen;
	}
	public void setJiFen(int jiFen) {
		this.jiFen = jiFen;
	}
	public Player(int level, long startTime, int timeTotal, int jiFen) {
		super();
		this.level = level;
		this.startTime = startTime;
		this.timeTotal = timeTotal;
		this.jiFen = jiFen;
	}
	public Player() {
		super();
	}
	
	
}

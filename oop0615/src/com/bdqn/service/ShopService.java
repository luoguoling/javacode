package com.bdqn.service;

public class ShopService {
	//���ݻ�����ȼ�
	public char getLevel(int jf){
		char level = 'C';
		if(jf >= 1000 && jf < 2000){
			level = 'B';
		}
		if(jf >= 2000){
			level = 'A';
		}
		return level;
	}
	//���ݵȼ����ۿ�
	public float getZK(char level){
		float zk = 0.90f;
		switch (level) {
		case 'A':
			zk = 0.75f;
			break;
		case 'B':
			zk = 0.80f;
			break;
		default:
			break;
		}
		return zk;
	}
	
}

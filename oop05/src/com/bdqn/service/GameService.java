package com.bdqn.service;

import java.util.Random;
import java.util.Scanner;

import com.bdqn.domain.Level;
import com.bdqn.domain.LevelCfg;
import com.bdqn.domain.Player;

public class GameService {
	private Player player = null;
	private Level mLevel = null;
	
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Level getmLevel() {
		return mLevel;
	}

	public void setmLevel(Level mLevel) {
		this.mLevel = mLevel;
	}

	public GameService(Player player){
		this.player = player;
		this.mLevel = LevelCfg.LEVEL_CFG[this.player.getLevel() - 1];
	}
	
	//�˷���������������ַ���
	public String getRandStr(){
		String randStr = "";
		/**
		 * 1.�����������(0-5)
		 * 2.����swith��������ַ���
		 */
		for (int i = 0; i < mLevel.getStrLen(); i++) {
			Random random = new Random();
			int rand = random.nextInt(5);
			switch (rand) {
			case 0:
				randStr = randStr + ">";
				break;
			case 1:
				randStr = randStr +  "%";
				break;
			case 2:
				randStr = randStr +  "^";
				break;
			case 3:
				randStr = randStr +  "_";
				break;
			case 4:
				randStr = randStr +  "r";
				break;
			default:
				randStr = randStr +  "@";
				break;
			}			
		}
		return randStr;
	}
	/**
	 * 1.�Ƚ�ϵͳ���ɵ��ַ����Ƿ���ͻ������ַ������?
	 * 2.�����ʱ���Ƿ񳬹��޶�ʱ��
	 * 1,2����ͬʱ����,
	 * 1.���ۼƿͻ�����
	 * 2.���ۼƿͻ������ܺ�ʱ
	 * ���1��2��һ����������GAME OVER
	 * ����1���û�����Ĵ�
	 * ����2:ϵͳ���ɵĴ�
	 */
	public Player gameCore(String inputStr,String outStr){
		boolean isOK = false;
		if(inputStr.equals(outStr)){
			isOK = true;
		}
		if(isOK){
			//���ϵͳ��ǰ�ĺ�����
			long nowTime = System.currentTimeMillis();
			//�����ҿ�ʼ����ʱ��ǰ��ʱ��
			long startTiem = this.player.getStartTime();
			//�ͻ������ʱ
			int playerTime = (int)((nowTime - startTiem) / 1000);
			if(playerTime <= mLevel.getMaxTime()){
				//�ۼƻ���
				this.player.setJiFen(this.player.getJiFen() + mLevel.getLevelJF());
				//�ۼ��ܺ�ʱ
				this.player.setTimeTotal(this.player.getTimeTotal() + playerTime);
				return this.player;
			}			
		}
		return null;
	}
	
	/**
	 *	��Ϸ����
	 *   3.���������
	 *   4.���ܺ�ʱ���
	 *   1.�����µ�Level����
	 *   2.������Ҽ�������
	 */
	public void addLevel(){
		this.mLevel = LevelCfg.LEVEL_CFG[this.player.getLevel()];
		this.player.setLevel(this.mLevel.getLevelNo());
		this.player.setJiFen(0);
		this.player.setTimeTotal(0);
	}
	
	public void gameOver(){
		System.exit(0);
	}
	
	public void gameStart(){
		System.out.println("��ӭ���������Ϸϵͳ");
		while(true){
			for (int i = 0; i < mLevel.getMaxCiShu(); i++) {
				String outputStr = this.getRandStr();
				long startTime = System.currentTimeMillis();
				System.out.println(outputStr);
				Scanner input = new Scanner(System.in);
				String inputStr = input.next();
				if(inputStr.equals("exit")){
					this.gameOver();
				}
				this.player.setStartTime(startTime);//���ÿ�ʼʱ��
				this.player = this.gameCore(inputStr, outputStr);
				if(this.player == null){
					System.out.println("�Բ�����Ϸ������");
					this.gameOver();
				}
			}
			//�ж��Ƿ�ȫ��ͨ��
			if(this.player.getLevel() == LevelCfg.LEVEL_CFG.length){
				System.out.println("��ϲ�㣬��Ϸȫ��ͨ�أ�");
				this.gameOver();
			}
			//ͨ�ؽ���
			this.addLevel();			
		}
	}
	
	public static void main(String[] args) {
		GameService gs = new GameService(new Player());
		//System.out.println(gs.getRandStr());
		gs.gameStart();
	}
}

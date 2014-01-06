package com.bdqn.game.core;

import java.util.Random;
import java.util.Scanner;

import com.bdqn.game.cfg.LevelCfg;
import com.bdqn.game.domain.Level;
import com.bdqn.game.domain.Player;

public class GameService {
	private Player player = null;
	private Level myLevel = null;
	public GameService(Player player) {
		this.player = player;
		myLevel = LevelCfg.LEVELS[this.player.getLevel() - 1];
	}
	public String getRandStr(){
		Random random = new Random();
		String str = "";
		System.out.println(myLevel.getStrLen());
		for(int i = 0;i < myLevel.getStrLen();i++){
			int rand = random.nextInt(6);
			switch (rand) {
			case 0:
				str = str + "<";
				break;
			case 1:
				str = str + ">";
				break;
			case 2:
				str = str + "@";
				break;
			case 3:
				str = str + "^";
				break;
			case 4:
				str = str + "&";
				break;
			default:
				str = str + ")";
				break;			}
		}
		return str;
	}
	public Player gameCore(String inputStr,String randStr){
		boolean isOk = false;
		if(inputStr.equals(randStr)){
			isOk = true;
		}
		if(isOk){
			long nowTime = System.currentTimeMillis();
			int inputTime = (int)((nowTime - this.player.getStartTime()) / 1000);
			if(inputTime < myLevel.getMaxtime()){
				this.player.setJiFen(this.player.getJiFen() + myLevel.getLevelFen());
				this.player.setTotalTime(this.player.getTotalTime() + inputTime);
				return this.player;
			}
		}
		return null;
	}
	public void addLevel(){
		myLevel =  LevelCfg.LEVELS[myLevel.getLevelCode()];
		System.out.println(myLevel.getLevelCode());
		this.player.setLevel(this.player.getLevel() + 1);
		this.player.setJiFen(0);
		this.player.setTotalTime(0);
	}
	public void gameEnd(){
		System.exit(0);
	}
	public void gameStart(){
		System.out.println("��ӭ���������Ϸϵͳ");
		while(true){
		for(int i = 0;i < myLevel.getMaxRand();i++){
			String randStr = this.getRandStr();
			System.out.println(randStr);
			long startTime = System.currentTimeMillis();
			this.player.setStartTime(startTime);
			Scanner scan = new Scanner(System.in);
			String inputMess = scan.next();
			if(inputMess.equals("exit")){
				System.out.println("�˳���Ϸ");
				this.gameEnd();
			}
			this.player = this.gameCore(inputMess, randStr);
			if(this.player == null){
				System.out.println("�Բ������Ѿ����ˣ���Ϸ������");
				this.gameEnd();
			}
		}
		if(this.player.getLevel() == LevelCfg.LEVELS.length){
			System.out.println("��ϲ�㣬���Ѿ�ͨ���ˣ�");
			this.gameEnd();
		}
		System.out.println("��ϲ���Ѿ�ͨ��" + this.player.getLevel()+"��");
		this.addLevel();
		}
	}
}

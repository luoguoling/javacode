package com.bdqn.game.core;

import java.util.Random;
import java.util.Scanner;

import com.bdqn.game.cfg.LevelCfg;
import com.bdqn.game.domain.Level;
import com.bdqn.game.domain.Player;
import com.bdqn.game.inf.core.IGameService;

public class GameService implements IGameService{
	private Player player = null;
	private Level myLevel = null;
	public Player getPlayer() {
		return player;
	}
	public Level getMyLevel() {
		return myLevel;
	}
	public GameService(Player player) {
		this.player = player;
		myLevel = LevelCfg.LEVELS[this.player.getLevelCode() - 1];
	}
	/**
	 * ������Ҽ���ϵͳ�������һ������LEVEL������ĳ������(strLen)���ȵ��ַ���
	 * ����
	 *   ������Ӽ���strLen
	 * @return
	 */
	public String randStr(){
		String randStr = "";
		int strLen = this.myLevel.getStrLen();
		for(int i = 0;i < strLen;i++){
			Random random = new Random();
			int rand = random.nextInt(strLen);
		switch (rand) {
		case 0:
			randStr = randStr + "<";
			break;
		case 1:
			randStr = randStr + "@";
			break;
		case 2:
			randStr = randStr + "^";
			break;
		case 3:
			randStr = randStr + ")";
			break;
		case 4:
			randStr = randStr + "&";
			break;
		case 5:
			randStr = randStr + "!";
			break;
		default:
			randStr = randStr + "%";
			break;
		}			
	    }		
		return randStr;
	}
	/**
	 * �Ƚ��û�������ַ�����ϵͳ��������ַ������Ƿ����
	 * �����ȣ���Ҫ�ж���������ʱ�䣬�Ƿ��ǵ�ǰ����Ҫ����ʱʱ�䣬
	 * ����ǣ�����ǰ��������ۼӸ����,ͬʱ���ۼ�����ʱ��
	 * ������ǣ�ʧ��
	 * @param inputStr ���������ַ���
	 * @param outputStr ϵͳ��������ַ���
	 * @return ����play�������ʧ�ܣ��򷵻�NULL
	 */
	public Player gameCore(String inputStr,String outputStr){
		boolean isOK = false;
		if(inputStr.endsWith(outputStr)){
			isOK = true;
		}
		if(isOK){
			//��ȡ�������ʵ��
			long endTime = System.currentTimeMillis();
			//������õ�ʱ��
			int yongTime = (int)((endTime - this.player.getStartTime()) / 1000);
			if(yongTime < this.myLevel.getMaxTime()){//�ɹ�
				//�ӻ���
				this.player.setJiFen(this.player.getJiFen() + this.addJF());
				//��ʱ��
				this.player.setTotalTime(this.player.getTotalTime() + yongTime);
				return this.player;
			}
		}
		return null;
	}
	/**
	 * ��������
	 * 1.��Ҽ�������
	 * 2.����µļ�����
	 * 3.�������(jiFen)
	 * 4.�ۼƺ�ʱʱ�����(totalTime)
	 */
	public void addLevel(){
		this.player.setLevelCode(this.player.getLevelCode() + 1);
		this.myLevel = LevelCfg.LEVELS[this.player.getLevelCode() - 1];
		this.player.setJiFen(0);
		this.player.setTotalTime(0);
	}
	public int addJF(){
		int addjf = this.myLevel.getLevelJF();
		return addjf;
	}
	public void gameStart(){
		System.out.println("��ӭ������֣������Ϸϵͳ");
		while(true){
			for (int i = 0; i < this.myLevel.getRandMax(); i++) {
				String randStr = this.randStr();
				System.out.println(randStr);
				this.player.setStartTime(System.currentTimeMillis());
				Scanner scanner = new Scanner(System.in);
				String inputStr = scanner.next();
				this.player = this.gameCore(inputStr, randStr);
				if(this.player == null){
					System.out.println("��̫���ˣ���ȥ����������Ϸ�����ˣ�");
					this.gameOver();
				}			
			}
			//����
			if(this.myLevel.getLevel() == LevelCfg.LEVELS.length){//��ǰ�����Ѿ����
				System.out.println("��̫ţ�ˣ�ͨ�أ�");
				this.gameOver();
			}
			this.addLevel();			
		}
	}
	public void gameOver(){
		System.exit(0);//ǿ�ƽ�����������
	}
	@Override
	public void setPlayer(Player parPlayer) {
		// TODO Auto-generated method stub
		this.player = parPlayer;
	}
}

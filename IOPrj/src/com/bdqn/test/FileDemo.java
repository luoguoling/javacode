package com.bdqn.test;

import java.io.File;

public class FileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File myFile = new File("log.txt");
		if(myFile.exists()){//����
			System.out.println(myFile.delete());
			return;
		}else{//������
			System.out.println(myFile.createNewFile());
		}
		System.out.println(myFile.getAbsolutePath());//��ȡ�ļ�����·��
		
	}

}

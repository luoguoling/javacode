package com.bdqn.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReaderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File myFile = new File("log.txt");
		//���ļ�
		FileReader fr = new FileReader(myFile);
		//׼����ʼ��
		BufferedReader br = new BufferedReader(fr);
		//��
		String temp;//��ʱ�洢һ������
		while((temp = br.readLine()) != null){
			System.out.println(temp);
		}
		//�ر�
		br.close();
		fr.close();
	}

}

package com.bdqn.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

public class WriterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File myFile = new File("log.txt");
		//���ļ�
		FileWriter fw = new FileWriter(myFile,true);
		//׼����ʼд
		BufferedWriter bw = new BufferedWriter(fw);
		//д
		PrintWriter out = new PrintWriter(bw);
		out.println("����һ��" + new Date());
		out.println("��������֣");
		//����
		out.close();
		bw.close();
		fw.close();

	}

}

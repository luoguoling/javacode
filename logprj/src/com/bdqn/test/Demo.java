package com.bdqn.test;

import org.apache.log4j.Logger;

public class Demo {
	private Logger log = Logger.getLogger(Demo.class.getName());
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log = Logger.getLogger(Demo.class.getName());
		log.fatal("��һ��������Ϣ����fatal!");
		log.error("�ڶ���������Ϣ����error!");
		log.warn("������������Ϣ����warn!");
		log.info("���ĸ�������Ϣ����debug!");
		log.debug("�����������Ϣ����info!");
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			// TODO: handle exception
			log.error("�Ա��𣬳�������ˣ�");
		}
	}

}

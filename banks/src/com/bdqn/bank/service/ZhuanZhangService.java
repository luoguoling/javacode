package com.bdqn.bank.service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
  * ������ҵ���߼���
 * 5.ת��ҵ�����
 * @author hidba
 *
 */
public class ZhuanZhangService {
	/**
	 * 1.��ת���˺�������
	 * 2.��ת���˺�������
	 * 3.��������ҵ����ˮ
	 *   3.1 ת��ҵ����ˮ
	 *   3.2 ת��ҵ����ˮ
	 * 4.������
	 * @param parAccCodeOut ת���˺�
	 * @param parAccCodeIn  ת���˺�
	 * @param parMoney      ת�˽��
	 * @return �ɹ����
	 */
	public boolean zzService(String parAccCodeOut,String parAccCodeIn,float parMoney){
		return false;
	}
	/**
	 * ����ҵ����ˮ
	 * ҵ�����������+8λ�����
	 * ���磺2013030212153424342984
	 * @return
	 */
	private String createSerCode(){
		SimpleDateFormat sfd = new SimpleDateFormat("yyyyMMddHHmmss");
		Date nowDate = new Date();
		System.out.println(sfd.format(nowDate));
		return "";
	}
	public static void main(String[] args) {
		new ZhuanZhangService().createSerCode();
	}
}

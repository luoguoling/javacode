package com.bdqn.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hm = new HashMap<String, String>();
		hm.put("1", "����");
		hm.put("2", "������");
		hm.put("3", "ɯɯ");
		System.out.println(hm);
		//hm.remove("3");
		//System.out.println(hm);
		System.out.println(hm.get("3"));
		//����MAP
		Set<String> keys = hm.keySet();//key����
		//������
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			System.out.println(hm.get(it.next()));
		}
	}

}

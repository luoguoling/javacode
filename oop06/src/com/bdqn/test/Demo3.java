package com.bdqn.test;

import java.util.ArrayList;
import java.util.List;

import com.bdqn.domain.Cat;
import com.bdqn.domain.Dog;
import com.bdqn.domain.DongWu;
import com.bdqn.domain.HaiTun;
import com.bdqn.domain.Hospital;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DongWu cat = new Cat("�ӷ�è","����",4);
		DongWu dog = new Dog("ʷŬ��","����",4);
		DongWu haitun = new HaiTun("����","����");
		List<DongWu> dongwus = new ArrayList<DongWu>();
		dongwus.add(cat);
		dongwus.add(dog);
		dongwus.add(haitun);
		Hospital hp = new Hospital();
		hp.aiZhou(dongwus);
		hp.liu(dongwus);
		hp.xieTui(dongwus);
		
	}

}

package com.bdqn.test;

import com.bdqn.domain.Animal;
import com.bdqn.domain.Cat;
import com.bdqn.domain.Dog;
import com.bdqn.domain.Dolphin;
import com.bdqn.service.Inferno;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animals = new Animal[3];
		animals[0] = new Cat("�ӷ�è",4);
		animals[1] = new Dog("ʷŬ��",3);
		animals[2] = new Dolphin("����",0);
		Inferno myInferno = new Inferno();
		myInferno.aiZhou(animals);
		myInferno.xieTui(animals);
	}

}

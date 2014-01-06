package com.bdqn.service;

import com.bdqn.domain.Animal;
import com.bdqn.inf.Terrestrial;

public class Inferno {
	public void aiZhou(Animal[] animals){
		for (Animal animal : animals) {
			System.out.print(animal.getName() + "-------");
			animal.shout();
		}
	}
	public void xieTui(Animal[] animals){
		for (Animal animal : animals) {
			if(animal instanceof Terrestrial){
				int legnum = ((Terrestrial)animal).getLegnum();
				System.out.println("ж��" + animal.getName() + ":" + legnum + "����");
			}else{
				System.out.println("�Բ����������" + animal.getName() +":�Ѿ�������үȫж���ˣ�");
			}
		}
	}
}

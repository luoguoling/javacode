package com.bdqn.test;

import java.util.ArrayList;
import java.util.List;

import com.bdqn.domain.Bus;
import com.bdqn.domain.Car;
import com.bdqn.domain.CheBands;
import com.bdqn.domain.CheType;
import com.bdqn.domain.Custom;
import com.bdqn.domain.QiChe;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Custom myCustom = new Custom("JN004321", "��֣");
		QiChe car1 = new Car(CheBands.BMW, "³AZ001B", CheType.BMW_550I);
		QiChe bus = new Bus(CheBands.JINBEI, "³AN001B",CheType.JINBEI_16);
		List<QiChe> myList = new ArrayList<QiChe>();
		myList.add(car1);
		myList.add(bus);
		System.out.println("�ͻ�ID" + myCustom.getCid()+";�ͻ�������" + myCustom.getcName());
		System.out.println("�������������ܷ���:" + myCustom.zuChe(myList,2));

	}

}

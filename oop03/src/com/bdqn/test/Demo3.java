package com.bdqn.test;

import java.util.ArrayList;

import com.bdqn.domain.Bus;
import com.bdqn.domain.Car;
import com.bdqn.domain.Che;
import com.bdqn.domain.Customer;
import com.bdqn.domain.KaChe;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Che che1 = new Car("����","³A8888","550i");
		Che che2 = new Car("���","³A6666","GL8");
		Che che3 = new Car("���","³A7777","���");
		Che bus = new Bus("��","³A5555",17);
		Che kache = new KaChe("˹̩��", "³A4444",200);
		
		
		ArrayList<Che> ches = new ArrayList<Che>();
		ches.add(che1);
		ches.add(che2);
		ches.add(che3);
		ches.add(bus);
		ches.add(kache);
		
		Customer mycustomer = new Customer("��֣","sdfsdf");
		
		mycustomer.zuChe(ches, 30);
		
	}

}

package com.bdqn.test;

import com.bdqn.domain.Student;
import com.bdqn.domain.Teacher;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student myStu = new Student();
		myStu.setStuCode("S111111");
		Student myStu2 = new Student();
		myStu2.setStuCode("S111111");
		Teacher myTech = new Teacher("dsfsd", "sdfsdfsd");
//		if(myStu == myStu2){
//			System.out.println("��ͬһ����");
//		}else{
//			System.out.println("����ͬһ����!");
//		}
		if(myStu.equals(myTech)){
			System.out.println("��ͬһ����");
		}else{
			System.out.println("����ͬһ����!");
		}
	}

}

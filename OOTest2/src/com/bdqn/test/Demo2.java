package com.bdqn.test;

import com.bdqn.domain.Student;
import com.bdqn.domain.Teacher;
import com.bdqn.domain.Users;

public class Demo2 {
	public static void main(String[] args) {
		Teacher myTeacher = new Teacher("��֣","qaz123","��","ѧ����","JN030004");
//		myTeacher.setUserName("��֣");
//		myTeacher.setPassWord("qaz123");
//		myTeacher.setBumen("ѧ����");
//		myTeacher.setTeacherCode("JN030004");
		System.out.println(myTeacher.getSex());
		myTeacher.work();
		myTeacher.eat();
		myTeacher.jineng();
		myTeacher.ks();
		System.out.println("--------------------------");
		Student myStu = new Student();
		myStu.setUserName("����");
		myStu.setPassWord("123456");
		myStu.setBanji("ST02");
		myStu.setStuCode("ST020001");
		myStu.work();
		myStu.eat();
		myStu.jf();
		myStu.naoshi();
		//Users myUser = new Users();
	}
}

package com.bdqn.test;

import java.util.List;
import java.util.Scanner;

import com.bdqn.domain.Emp;
import com.bdqn.service.EmpServcie;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������Ҫ�鿴���ҳ�룺");
		Scanner input = new Scanner(System.in);
		int nowPage = input.nextInt();
		EmpServcie es = new EmpServcie();
		int pageCount = es.getPageTotal();//������ҳ��
		if(nowPage > pageCount){
			System.out.println("�������ҳ����󣬱��ι���" + pageCount + "ҳ�����������ʾ���һҳ���ݣ�");
			nowPage = pageCount;
		}
		if(nowPage <= 0){
			System.out.println("�������ҳ��Ϊ�������ָ�����ʾ��һҳ��");
			nowPage = 1;
		}
		List<Emp> data = es.fenYe(nowPage);
		for (Emp emp : data) {
			System.out.println(emp.getEmpNo() + " , " + emp.geteName());
		}
	}

}

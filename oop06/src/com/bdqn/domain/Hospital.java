package com.bdqn.domain;

import java.util.List;

import com.bdqn.inf.IPlayAble;
import com.bdqn.inf.IRun;

public class Hospital {
	public void aiZhou(DongWu dongwu){
		dongwu.jiao();
	}
	public void aiZhou(List<DongWu> dongwus){
		for (DongWu dongWu : dongwus) {
			dongWu.jiao();
		}
	}
	
	public void liu(DongWu dongwu){
		if(dongwu instanceof IPlayAble){
			((IPlayAble)dongwu).play();
		}
	}
	public void liu(List<DongWu> dongwus){
		for (DongWu dongWu : dongwus) {
			if(dongWu instanceof IPlayAble){
				((IPlayAble)dongWu).play();
			}			
		}
	}
	
	public void xieTui(DongWu dongwu){
		if(dongwu instanceof IRun){
			System.out.println(dongwu.getdName() + "��ж��" + ((IRun)dongwu).getTuiNum() + "�ȣ�");
		}else{
			System.out.println("�Բ���" + dongwu.getdName() + "�����Ѿ����ϵ۶�ж���ˣ�");
		}
	}
	
	public void xieTui(List<DongWu> dongwus){
		for (DongWu dongwu : dongwus) {
			if(dongwu instanceof IRun){
				System.out.println(dongwu.getdName() + "��ж��" + ((IRun)dongwu).getTuiNum() + "�ȣ�");
			}else{
				System.out.println("�Բ���" + dongwu.getdName() + "�����Ѿ����ϵ۶�ж���ˣ�");
			}			
		}
	}
	
}

package com.bdqn.domain;

import java.util.ArrayList;

public class Customer {
	private String cname = "";
	private String cid = "";//���պ�
	public Customer(String cname, String cid) {
		super();
		this.cname = cname;
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	
	public void zuChe(Che che,int day){
		System.out.println("����Ҫ������:" + che.culPrice(day));
	}
	
	public void zuChe(ArrayList<Che> ches,int day){
		int sum = 0;
		System.out.println(this.cname + "���⳵�ɷ���ϸ:");
		for (Che che : ches) {
			if(che instanceof Car){
				System.out.println("Ʒ�ƣ�" + che.getBrand() + "  �ͺţ�" + ((Car)che).getBrandType() + "  ����" + day + "  С�ƣ�" + che.culPrice(day));
			}else{
				if(che instanceof Bus){
					System.out.println("Ʒ�ƣ�" + che.getBrand() + "  ��λ����" + ((Bus)che).getSeatNum() + "  ����" + day + "  С�ƣ�" + che.culPrice(day));					
				}else{
					System.out.println("Ʒ�ƣ�" + che.getBrand() + "  ��λ����" + ((KaChe)che).getDun() + "  ����" + day + "  С�ƣ�" + che.culPrice(day));
				}
			}
			sum = sum + che.culPrice(day);			
		}
		System.out.println("������������" + ches.size() + "��,��𹲼ƣ�" + sum);
	}
	
}

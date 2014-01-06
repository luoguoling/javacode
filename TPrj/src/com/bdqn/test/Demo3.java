package com.bdqn.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		CallableStatement cstmt = null;  //���ô洢����ר��
		ResultSet rs = null;
		String sql = "";
		String url = "jdbc:sqlserver://192.168.240.129:1433;DatabaseName=MySchool";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url,"sa","qaz123");
			//���ô洢����֮ǰ��׼��sql��� ,��ʽ��{call �洢������(?,?)}
			sql = "{call proc_stu_ffy2(?,?,?)}";
			cstmt = conn.prepareCall(sql);
			//���ò���ֵ��ע����ʼ������1
			cstmt.setInt(1,5);
			cstmt.setInt(2,5);
			//�����������ע�ᣨ������
			cstmt.registerOutParameter(3,java.sql.Types.INTEGER);
			//ִ�д洢����
			rs = cstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("stuid"));
				System.out.println(rs.getString("studentno"));
				System.out.println(rs.getString("studentname"));
			}
			/**
			 * ע�⣺��������������Ĵ洢����ʱ��һ�����Ƚ������������ȡ�������ֵ
			 */
			System.out.println(cstmt.getInt(3));
			rs.close();
			cstmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

package com.bdqn.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ProcDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		CallableStatement cstmt = null;//���ô洢���̵��¶���
		ResultSet rs = null;
		String sql = "";
		String url = "jdbc:sqlserver://192.168.240.129:1433;DatabaseName=MySchool";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url, "sa", "qaz123");
			sql = "{call proc_findByGradeName(?)}";//{call �洢������(����)}
			//sql = "{call proc_stu}";//�޲δ洢����
			cstmt = conn.prepareCall(sql);
			//���ò���ֵ,��������������1Ϊ��ʼ
			cstmt.setString(1,"s1");
			//ִ�д洢����
			rs = cstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("gradeid"));
				System.out.println(rs.getString("gradename"));
			}
			rs.close();
			cstmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

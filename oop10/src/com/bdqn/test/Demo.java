package com.bdqn.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;//���Ӷ���
		Statement stmt = null;//���ݴ������
		//java:sqlserver://���ݿ�IP:�˿ں�;DatabaseName=���ݿ���
		//localhost  127.0.0.1
		//String url = "jdbc:sqlserver://localhost:1433;DatabaseName=MySchool";
		//String url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=MySchool";
		String url = "jdbc:sqlserver://192.168.240.129:1433;DatabaseName=Myschool";//���Ӵ�
		String dbuser = "sa";
		String dbpwd = "qaz123";
		try {
			//1.�������ݿ�������
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//2.��������(Connection)
			conn = DriverManager.getConnection(url, dbuser, dbpwd);
			//3.�������ݴ���ͨ������(Statement)
			stmt = conn.createStatement();
			//4.�������ݿ�
			String sql = "insert into grade(gradename)values('�����꼶')";
			//ִ��SQL
			int flag = stmt.executeUpdate(sql);
			if(flag > 0){
				System.out.println("����ɹ���");
			}else{
				System.out.println("����ʧ�ܣ�");
			}
			stmt.close();//�ر�
			conn.close();//�ر�
			
			System.out.println("OK");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

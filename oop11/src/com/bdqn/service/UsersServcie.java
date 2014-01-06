package com.bdqn.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bdqn.domain.Users;
import com.bdqn.inf.IUsersDAO;

public class UsersServcie implements IUsersDAO{
	private Connection conn = null;
	private Statement stmt = null;
	//����Ԥ�������
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private String url = "jdbc:sqlserver://192.168.240.129:1433;DatabaseName=Myschool";
	private String sql = "";
	
	
	public boolean register(Users myUser){
		sql = "insert into Users(uname,upwd)values(?,?)";//Ԥ����sql
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url,"sa","qaz123");
			pstmt = conn.prepareStatement(sql);
			//���濪ʼ��ռλ����ֵ
			pstmt.setString(1,myUser.getuName());
			pstmt.setString(2,myUser.getuPwd());
			//ִ��SQL
			int flag = pstmt.executeUpdate();
			
			if(flag > 0){
				return true;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				pstmt.close();
				conn.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return false;
	}
	/**
	 * �û�ע��
	 * @param uName �û���
	 * @param uPwd  ����
	 * @return true �ɹ�
	 */
	public boolean register(String uName,String uPwd){
		sql = "insert into Users(uname,upwd)values('"+ uName +"','"+ uPwd +"')";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url, "sa", "qaz123");
			stmt = conn.createStatement();
			int flag = stmt.executeUpdate(sql);
			if(flag > 0){
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return false;
	}

	
	public Users isLogin(String uName,String uPwd){
		sql = "select * from Users where uname = '" + uName + "'";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url,"sa","qaz123");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()){
				String dbupwd = rs.getString("upwd");
				int uState = rs.getInt("ustate");
				if(uPwd.equals(dbupwd)){
					return new Users(uName, uPwd, uState);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * �����û�״̬
	 * @param uName
	 * @return
	 */
	public boolean updateUState(String uName){
		sql = "update Users set ustate = 1 where uname = '"+ uName +"'";
		return false;
	}
	
	public List<Users> findByUName(String uName){
		sql = "select * from Users where uname like '%"+ uName +"%'";
		List<Users> data = new ArrayList<Users>();
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url,"sa","qaz123");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				int uid = rs.getInt("uid");
				String uname = rs.getString("uname");
				String upwd = rs.getString("upwd");
				int ustate = rs.getInt("ustate");
				Users myUser = new Users(uid, uname, upwd, ustate);
				data.add(myUser);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return data;
	}
	
}

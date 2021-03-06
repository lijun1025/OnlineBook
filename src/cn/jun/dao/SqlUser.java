package cn.jun.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import cn.jun.bean.User;

public class SqlUser {
	public static Connection getCon() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=(Connection) 
				DriverManager.getConnection("jdbc:mysql://localhost:3306/mydt","root","123456");
		return con;
	}
	
	public static void add(User user){
		try {
			PreparedStatement ps=null;
			Connection con=getCon();
			String sql="insert into user(username,password,email,nickname) value(?,?,?,?)";
			ps=(PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getNickname());
			ps.execute();
			if(ps!=null){
				ps.close();
			}
			if(con!=null){
				con.close();
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	public static boolean contains(User use){
		Statement sta=null;
		ResultSet rs=null;
		Connection con=null;
		try {
			 con=getCon();
			String sql="select * from user";
			sta=(Statement) con.createStatement();
			 rs=sta.executeQuery(sql);
			//username,password,email,nickname
			while(rs.next()){
				if(rs.getString(1).equals(use.getUsername()))
					rs.close();
					con.close();
					return true;
				}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rs.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return false;
	}
}

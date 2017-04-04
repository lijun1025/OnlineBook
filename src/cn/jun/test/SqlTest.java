package cn.test;

import java.sql.ResultSet;

import org.junit.Test;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import cn.jun.bean.User;
import cn.jun.dao.SqlUser;

public class SqlTest {
	@Test
	public void testAdd() {
		User user=new User("lijun","123456","shuaige","1025@qq.com");
		SqlUser.add(user);
	
	
	}
	//username,password,email,nickname
	@Test
	public void testResultSet(){
		Statement sta=null;
		try {
			Connection con=SqlUser.getCon();
			String sql="select * from user";
			sta=(Statement) con.createStatement();
			ResultSet rs=sta.executeQuery(sql);
			while(rs.next()){
				System.out.println("name="+rs.getString(1)+"password="
						+rs.getString(2)+"email="+rs.getString(3)+
						"nickname="+rs.getString(4));				
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testContain(){
		User use=new User("lijun","123456","1025@qq.com","shuaige");
		User use1=new User("lijun1","123456","111","shuaige");
		System.out.println(SqlUser.contains(use1));
	}

}

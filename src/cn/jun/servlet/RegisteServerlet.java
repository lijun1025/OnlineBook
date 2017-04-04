package cn.jun.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

import cn.jun.bean.User;
import cn.jun.dao.SqlUser;

public class RegisteServerlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String username=(String) request.getAttribute("username");
		String password=(String) request.getAttribute("password");
		String nickname=(String) request.getAttribute("nickname");
		String email=(String) request.getAttribute("email");
		User use=new User(username,password,email,nickname);
		response.getWriter().write(username);
		if(SqlUser.contains(use)){
			response.getWriter().write("用户已存在");
		}else{
			boolean bl=SqlUser.contains(use);
			String bl1=bl ? "true":"false";
			response.getWriter().write(bl1);
			SqlUser.add(use);
			response.getWriter().write("恭喜你注册成功");
		}
		
		}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}

}

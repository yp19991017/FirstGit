package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;
import service.UserService;
import service.impl.UserServiceImpl;
/**
 * 操作用户信息的servlet
 * @author 杨攀
 *
 */
@WebServlet("/Add")
public class UserServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置一个请求数据的编码
		req.setCharacterEncoding("UTF-8");
		// 在servlet中去访问service中的数据
		UserService us = new UserServiceImpl();
		User user = new User();
		//获得页面上的数据
		String name =req.getParameter("name");
		//页面上获得的所有数据都是String类型，而年龄是int类型
		//所以这里我们需要对数据进行强制转换（包装类）
		int age = Integer.parseInt(req.getParameter("age"));
		user.setName(name);
		//调用实体类中的set方法为私有的属性赋值
		user.setAge(age);
		us.save(user);
	}

}

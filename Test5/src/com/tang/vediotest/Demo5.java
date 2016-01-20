package com.tang.vediotest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.RepaintManager;

/**
 * Servlet implementation class Demo5
 */
@WebServlet("/Demo5")
public class Demo5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//通知浏览器3秒后转到目标页面
		//response.setHeader("refresh", "3;url=http://localhost:8080/Test5/test.jsp");
		//服务端控制浏览器禁止缓存当前的页面
		response.setHeader("expires", "-1");
		response.setHeader("cache-control", "no-cache");
		response.setHeader("pragma", "no-cache");
		
		//向浏览器输出内容 以字符的方式向浏览器传值
		response.getWriter().write("hahah");
	}

}

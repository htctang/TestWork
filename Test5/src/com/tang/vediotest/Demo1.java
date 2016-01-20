package com.tang.vediotest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.RepaintManager;

public class Demo1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setStatus(302);//服务端通知客户端重定向
		//服务端通知客户端重定向的目标资源
		resp.setHeader("location", "/Test5/WEB-INF/test.jsp");
	}
	}

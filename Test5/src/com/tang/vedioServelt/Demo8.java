package com.tang.vedioServelt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//测试Servlet声明周期
public class Demo8 extends HttpServlet{

	public Demo8() {
		System.out.println("Demo8"+this.hashCode());
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doGet"+this.hashCode());
	}

	@Override
	public void destroy() {
		System.out.println("destroy");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init()"+this.hashCode());
	}
	
}

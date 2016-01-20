package com.tang.vedioServelt;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//扩展GenericServlet实现Servlet程序
public class Demo7 extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		//服务端通知浏览器以指定的编码方式显示不然就乱码
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().write("欢迎学习java");
	}

}

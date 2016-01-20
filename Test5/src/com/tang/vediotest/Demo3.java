package com.tang.vediotest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo3
 */
@WebServlet("/Demo3")
public class Demo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("content-type", "image/jpeg");//服务端发送的数据的类型
		InputStream is = new FileInputStream(new File("E:/abc.jpg"));
		OutputStream os = response.getOutputStream();
		byte[] buf = new byte[1024];
		int len=0;
		while((len=is.read(buf))>0){
			os.write(buf,0,len);
		}
		is.close();
		os.close();
	}



}

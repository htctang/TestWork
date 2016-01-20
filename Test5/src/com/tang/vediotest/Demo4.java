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


public class Demo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//通知浏览器以下载的方式发开图片 这一系列的头设置就是HTTP协议的内容
		response.setHeader("content-disposition", "attachment;filename=d1.jpg");
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

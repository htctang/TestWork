package com.tang.vediotest;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//将String用GZIP压缩到byte[]中
		String data = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		System.out.println("压缩前"+data.length());
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		GZIPOutputStream Gout = new GZIPOutputStream(bout);
		Gout.write(data.getBytes());
		Gout.flush();
		Gout.close();
		//输出压缩后的数据
		byte[] buf = bout.toByteArray();
		System.out.println("压缩后"+buf.length);
		//将压缩后的数据输出到浏览器
		resp.setHeader("content-encoding", "gzip");//告诉浏览器你的压缩方式
		resp.setHeader("content-length", buf.length+"");//告诉浏览器你压缩后的长度 两个都是缺一不可
		
		//服务器以字节方式输出
		resp.getOutputStream().write(buf);
		
	}
}

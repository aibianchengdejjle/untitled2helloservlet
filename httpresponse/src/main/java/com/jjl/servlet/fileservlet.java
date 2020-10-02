package com.jjl.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

public class fileservlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取下载文件的路径
        String realPath = "E:\\untitled5maven\\untitled2helloservlet\\httpresponse\\src\\main\\resources\\1.jpg";
        System.out.println("下载的文件路劲"+realPath);
        //下载的文件名是什么
        String substring = realPath.substring(realPath.lastIndexOf("\\")+1);
        //设置办法让浏览器下载我们需要的东西给了这个请求体浏览器就会自动弹出下载   并且通过substring来获得其相应的文件名
        resp.setHeader("Content-Disposition","attachment;substring="+ URLEncoder.encode(substring,"utf-8"));
        //获取下载文件的输入刘
        FileInputStream fis=new FileInputStream(realPath);
        int len=0;
        byte[]buffer=new byte[1024];
        //获取outputstream
        ServletOutputStream out=resp.getOutputStream();
        while((len=fis.read(buffer))>0)
        {
            out.write(buffer,0,len);
        }
        fis.close();
        out.close();

    }

}

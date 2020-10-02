package com.jjl.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class helloservlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //代表了当前的web应用
        ServletContext servletContext = this.getServletContext();
        //System.out.println("hello"); 在控制台输出hello
        resp.setCharacterEncoding("utf-8");
        String username="ljj";
        servletContext.setAttribute("username",username);//讲一个数据存入到context中
    }
}

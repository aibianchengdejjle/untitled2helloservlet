package com.jjl.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // System.out.println("这里进入请求了");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username+"   "+password);
        resp.sendRedirect("/httpresponse_war/success.jsp");

    }
}

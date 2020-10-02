package com.jjl.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //后台接受中文乱码问题
        String[] hobbies = req.getParameterValues("hobby");
        System.out.println(username+"   "+password);
        for (String s: hobbies
             ) {
            System.out.println(s);
        }
        //resp.sendRedirect("/requset_war/success1.jsp");
        req.getRequestDispatcher("/success1.jsp").forward(req,resp);
    }
}

package com.jjl.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class imageservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //让浏览器3秒一刷新
        resp.setHeader("refresh","3");
        //在内存中创建一个图片
        BufferedImage bufferedImage=new BufferedImage(80,20,BufferedImage.TYPE_INT_RGB);
        //得到图片
        Graphics2D graphics = (Graphics2D) bufferedImage.getGraphics();
        //设置图片的背景颜色
        graphics.setColor(Color.white);
        graphics.fillRect(0,0,80,20);
        graphics.setColor(Color.black);
        //写数字
        graphics.drawString(randon(),0,20);
        //告诉浏览器这个请求用图片形式打开
        resp.setContentType("image/jpg");
        //网站存在缓存 不让他缓存
        resp.setDateHeader("exprise",-1);
        resp.setHeader("Cache-Control","no-cache");
       // resp.setHeader("Pragma","no-cache");
        //把图片卸载浏览器
        ImageIO.write(bufferedImage,"jpg",resp.getOutputStream());
    }
    //生成随机数
    private  String  randon(){
        Random random = new Random();
        String  s;
        s=random.nextInt(9999)+"";
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i <4-s.length() ; i++) {
            sb.append("0");
        }
        //必定是4位不是的话就用0填充
        s=sb.toString()+s;
        return s;

    }
}

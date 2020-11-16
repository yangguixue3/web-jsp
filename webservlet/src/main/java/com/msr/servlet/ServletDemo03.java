package com.msr.servlet;

import com.sun.javafx.binding.StringFormatter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;


public class ServletDemo03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取servlet的配置信息
        ServletConfig servletConfig = getServletConfig();
        System.out.println("通过获取servlet在获取该servlet在web.xml配置信息==>"+servletConfig.getInitParameter("myName"));
        // 获取上下文中名为db的配置信息
        String db = getServletContext().getInitParameter("db");
        System.out.println("getServletContext().getInitParameter(\"db\")=>"+db);
        // 获取上下文所有配置信息
        Enumeration<String> initParameterNames = getServletContext().getInitParameterNames();
        System.out.println("---------------------------------------");
        System.out.println("getServletContext().getInitParameterNames()获取所有配置信息");
        while (initParameterNames.hasMoreElements()){
            String name = initParameterNames.nextElement();
            String value = getServletContext().getInitParameter(name);
            System.out.println("connText的配置信息=>"+name+":"+value);
        }
        System.out.println("---------------------------------------");
        String realPath = getServletContext().getRealPath("aaa/静态文件从Webapp下开始.txt");
        System.out.println("获取文件在服务器的地址"+realPath);
        System.out.println("---------------------------------------");
        InputStream resourceAsStream = getServletContext().getResourceAsStream("/aaa/静态文件从Webapp下开始.txt");
        System.out.println("获取文件内容"+resourceAsStream);
        System.out.println("---------------------------------------");
        String mimeType = getServletContext().getMimeType("/bbb.jpg");
        System.out.println("获取文件类型"+resourceAsStream);



    }

}

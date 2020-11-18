package com.msr.ajaxdemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo01")
public class ServletDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("接收到ajax-post请求");
        response.setContentType("text/html;charset=UTF-8");

        System.out.println(request.getParameter("name")+":"+request.getParameter("password"));
        response.getWriter().print(request.getParameter("name")+":"+request.getParameter("password")+"你好");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("接收到ajax-get请求");
        response.setContentType("text/html;charset=UTF-8");
        System.out.println(request.getParameter("name")+":"+request.getParameter("password"));
        response.getWriter().print(request.getParameter("name")+":"+request.getParameter("password")+"你好");
    }
}

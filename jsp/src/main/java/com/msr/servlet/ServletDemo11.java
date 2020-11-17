package com.msr.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletDemo11")
public class ServletDemo11 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        设置指定时间跳转到指定页面
//        response.setHeader("refresh", "3;URL=http://www.baidu.com/");
        response.setHeader("refresh", "3;URL=index3.jsp");
    }
}

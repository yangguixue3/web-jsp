package com.msr.ajaxdemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo02")
public class ServletDemo02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("接收到ajax-post请求");
        response.setContentType("text/html;charset=UTF-8");

        System.out.println(request.getParameter("name")+":"+request.getParameter("password"));
        String name = "dd";
        response.getWriter().print("{\"name\":\"   "+request.getParameter("name")+"  \",\"password\":\""+request.getParameter("password")+"\"}");

//        response.getWriter().print("{\"name\":\"yang\"}");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

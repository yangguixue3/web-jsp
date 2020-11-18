package com.msr.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * FilterConfig(了解)
 * 	获取filter的名称
 * 	获取filter的初始化参数
 * 	获取filter所有初始化名称
 * 	获取上下文管理者
 */
@WebServlet("/demo06")
public class ServletDemo06 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Demo05接收到D页面的请求");
        try {
            System.out.println(10/0);

        } catch (Exception e) {
            request.setAttribute("msg",e);
            request.getRequestDispatcher("/404.jsp").forward(request,response);
            e.printStackTrace();
        }
    }
}

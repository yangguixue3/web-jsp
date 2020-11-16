package com.msr.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 *
 */
public class ServletDemo01 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        //初始化
        System.out.println("hello初始化");
    }

    @Override
    public ServletConfig getServletConfig() {
        //获取servlet的配置信息
        System.out.println("hell咯servlet的配置信息");
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //接受请求的方法
        System.out.println("接收到了hello请求");
    }

    @Override
    public String getServletInfo() {
        //获取servlet的信息
        return null;
    }

    @Override
    public void destroy() {
        //销毁
    }
}

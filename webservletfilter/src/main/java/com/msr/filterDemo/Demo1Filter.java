package com.msr.filterDemo;

import javax.servlet.*;
import java.io.IOException;

/**
 *  web.xml 配置
 */
public class Demo1Filter implements Filter {
    Demo1Filter(){
        System.out.println("Filter 空参数构造...");
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init_初始化...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("拦截请求...");
        //放行
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("拦截响应...");
    }

    @Override
    public void destroy() {
        System.out.println("过滤_destroy...");
    }
}

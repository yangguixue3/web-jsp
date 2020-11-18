package com.msr.filterDemo;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 *   @WebFilter(value = "/demo01")
 *  只拦截 demo01
 */
@WebFilter(value = "/demo01")
//@WebFilter(value = "/demo02")
//@WebFilter("/demo02")
//@WebFilter(urlPatterns = "/demo02")
public class Demo4FilterAno implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("------------------------------------");
        System.out.println("Demo4FilterAno 只拦截 servletdemo1请求");
        chain.doFilter(req, resp);
        System.out.println("Demo4FilterAno 拦截响应");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}

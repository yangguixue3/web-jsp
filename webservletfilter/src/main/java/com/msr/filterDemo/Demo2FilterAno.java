package com.msr.filterDemo;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 注解 拦截 先后顺序 按照过滤class名自然排序
 */
@WebFilter("/demo02")
//@WebFilter("/*")
public class Demo2FilterAno implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("Demo2FilterAno 拦截请求");
        chain.doFilter(req, resp);
        System.out.println("Demo3FilterAno 拦截响应 ");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}

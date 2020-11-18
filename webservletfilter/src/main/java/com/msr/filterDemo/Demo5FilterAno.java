package com.msr.filterDemo;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 *
 *  只拦截 servlet的转发请求
 */
@WebFilter(value = "/*" ,dispatcherTypes = DispatcherType.FORWARD)

public class Demo5FilterAno implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("------------------------------------");
        System.out.println("Demo5FilterAno拦截到了 转发请求");
        chain.doFilter(req, resp);
        System.out.println("Demo4FilterAno 拦截响应");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}

package com.msr.filterDemo;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;
import java.util.Enumeration;

/**
 * 获取过滤器相关 初始化参数，过滤器名
 * FilterConfig(了解)
 * 	获取filter的名称
 * 	获取filter的初始化参数 跟sevlet一样
 * 	获取filter所有初始化名称
 * 	获取上下文管理者
 */
@WebFilter(value = "/demo06" ,initParams = {@WebInitParam(name = "db",value = "mysql"),@WebInitParam(name = "code",value = "utf-8")})

public class Demo6FilterAno implements Filter {
    FilterConfig filterConfig;
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("------------------------------------");
        String filterName = filterConfig.getFilterName();
        System.out.println("filterName="+filterName);

//      获取过滤器初始参数
        Enumeration<String> initParameterNames = filterConfig.getInitParameterNames();
        while (initParameterNames.hasMoreElements()){
            String paramName = initParameterNames.nextElement();
            String paramValue = filterConfig.getInitParameter("paramName");
            System.out.println(paramName+"**"+paramValue);
        }
    }

    public void init(FilterConfig config) throws ServletException {
        filterConfig = config;
    }

}

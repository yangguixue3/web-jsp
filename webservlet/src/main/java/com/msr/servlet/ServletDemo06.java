package com.msr.servlet;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 表单大量数据获取方法，2种
 * 1. request.getParameterMap()
 * 2. BeanUtils 实体类 工具类populate()
 *      导入依赖，commons-beanutils
 */
@WebServlet("/ServletDemo06")
public class ServletDemo06 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //1. 获取表单数据 大量request.getParameterMap()
        Map<String, String[]> parameterMap = request.getParameterMap();
        //遍历1
        parameterMap.forEach((k,v)-> System.out.println(
                k+":"+ Arrays.toString(v)
        ));
        //遍历2
        Set<Map.Entry<String, String[]>> entries = parameterMap.entrySet();
        for (Iterator<Map.Entry<String, String[]>> iterator = entries.iterator();iterator.hasNext();) {
            Map.Entry<String, String[]> entry = iterator.next();
            String key = entry.getKey();
            String[] value = entry.getValue();
            System.out.println(key+":"+value);
        }
        //2. BeanUtils 实体类 工具类populte()
        System.out.println("---------------2---------------");
        User user = new User();
        try {
            BeanUtils.populate(user,parameterMap);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String getMethod():获取请求的方式
        System.out.println("request.getMethod()=>"+request.getMethod());
//        String getContextPath():获取项目动态路径
        System.out.println("request.getContextPath()=>"+request.getContextPath());
//        String getRemoteAddr()获取请求者的ip
        System.out.println("request.getRemoteAddr()=>"+request.getRemoteAddr());
//        String getQueryString():获取的get请求参数
        System.out.println("request.getQueryString()=>"+request.getQueryString());
//        String getRequestURI():获取的是请求的资源(不带get请求的参数)   /day15/1.html
        System.out.println("request.getRequestURI()=>"+request.getRequestURI());
//        String getProtocol():获取协议和版本
        System.out.println("request.getProtocol()=>"+request.getProtocol());
//        String getHeader(String name):获取的一个请求头(返回值为string)
        System.out.println("request.getHeader=>"+request.getHeader("user-agent"));


    }
}

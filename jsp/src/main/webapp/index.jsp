<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2020/11/16
  Time: 上午 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.io.Writer"%>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" session="true" isErrorPage="true" buffer="8kb" autoFlush="true" %>
<html>
<head>
    <title>jsp演示代码块</title>
</head>
<body>
    <p>java程序片段</p>
    <%
        Integer a=100;
        System.out.println("a");
        %>
    <p>后台输出 System.out.println</p>
    <HR >
    <p>输出表达式</p>
    <%=
        "次数为输出表达式"
    %>
    <HR >
    <p>声明成员变量</p>
    <%!
        String name = "name";

    %>
    <%=
        "此处为"+name
    %>
    <HR >

    <p>声明成员变量</p>

</body>
</html>

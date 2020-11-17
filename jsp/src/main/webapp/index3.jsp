<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2020/11/16
  Time: 上午 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"   isELIgnored="false" session="true" isErrorPage="true" %>
<html>
<head>
    <title>jsp中四个域对象</title>
</head>
<body>
    <h1>jsp中四个域</h1>
    <h3>pageContext:当前页面<br>request:当前请求<br>session:当前会话<br>application:当前项目</h3>
    <hr>
    <%
        Integer a=100;
        System.out.println("a");
        request.setAttribute("name","张叔叔request");
        pageContext.setAttribute("name","张叔叔pageContext");
        session.setAttribute("name","张叔叔session");
        application.setAttribute("name","张叔叔application");
    %>

    <%=request.getAttribute("name")%><br>
    <%=pageContext.getAttribute("name")%><br>
    <%=session.getAttribute("name")%><br>
    <%=application.getAttribute("name")%><br>
<hr>
    <p>findAttribute(String name):依次从pageContext,request,session,applicaton中查找指定的name属性</p>
    <%=pageContext.findAttribute("name")%><br>

    <h1>jsp中内置的9个隐藏对象</h1>
    application:<%=(String)application.getInitParameter("servletName")%><br>




</body>
</html>

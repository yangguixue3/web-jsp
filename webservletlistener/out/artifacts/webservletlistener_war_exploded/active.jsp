<%@ page import="com.msr.listenter.Person" %><%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2020/11/18
  Time: 上午 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>removeAttribute</h1>
<h1>创建对象，关闭服务器，钝化。<br>重启服务器，活化</h1>
<%
    Person person = new Person("张张","22");
    session.setAttribute("person",person);
%>

</body>
</html>

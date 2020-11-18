<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2020/11/17
  Time: 下午 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>context</h1>
    <a href="${pageContext.request.contextPath}/add.jsp">add参数</a>
    <a href="${pageContext.request.contextPath}/update.jsp">update参数</a>
    <a href="${pageContext.request.contextPath}/remove.jsp">remove参数</a>
<br>
    <a href="${pageContext.request.contextPath}/bound.jsp">bound绑定bean</a>
    <a href="${pageContext.request.contextPath}/unbound.jsp">unbound解绑定 bean</a>
<br>
    <a href="${pageContext.request.contextPath}/active.jsp">1.person对象存入sesson，测试钝化</a>
<br>
    <a href="${pageContext.request.contextPath}/active01.jsp">2.获取person活化后的对象</a>
</body>
</html>

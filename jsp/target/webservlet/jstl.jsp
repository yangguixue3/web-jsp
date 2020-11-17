<%@ page import="com.msr.servlet.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2020/11/17
  Time: 上午 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
<head>
    <title>JSTL</title>
</head>
<body>
<h1>JSTL</h1>
<%
    request.setAttribute("name","旺旺");
%>
<h3>c:out</h3>
<c:out value="${name}" default="您要的数据找不着" escapeXml=""></c:out>
<c:out value="${name1}" default="数据找不着" escapeXml=""></c:out>
<h3>c:if</h3>
<c:if test="${empty name1}" var="v" scope="page">
    ${v}
</c:if>
<h3>c:forEach
    基础用法
    高级用法
    遍历list
    遍历map</h3>

<c:forEach begin="0" end="10" step="1" var="v">
    ${v}
</c:forEach>
<h4>遍历List</h4>

<%
    List list = new ArrayList<>();
    list.add("zhongfucheng");
    list.add("ouzicheng");
    list.add("xiaoming");

    request.setAttribute("list00", list);
%>

<c:forEach  var="v" items="${list00}" >
    ${v}<br>
</c:forEach>

<h4>遍历List</h4>


<%
    Map map = new HashMap();
    map.put("1", "zhongfucheng");
    map.put("2", "xiaohong");
    map.put("3", "xiaoming");

    request.setAttribute("map",map);
%>

<c:forEach  var="me" items="${map}" >

    ${me.key}  ${me.value}<br>

</c:forEach>






</body>
</html>

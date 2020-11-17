<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2020/11/16
  Time: 下午 04:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("delMe","2");
    List list = new ArrayList();
%>
${delMe}

</body>
</html>

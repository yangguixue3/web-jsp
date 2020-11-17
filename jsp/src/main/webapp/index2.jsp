<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2020/11/16
  Time: 上午 11:12
  To change this template use File | Settings | File Templates.

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>文件的静态引用</title>
</head>
<body>
<p>静态引用文件，先拷贝过来，在编译，变量名不能重复</p>
    <%@include file="/jsp/head.jsp"%>
    <%@include file="/jsp/body.jsp"%>
    <%@include file="/jsp/foot.jsp"%>
<hr >
<p>动态引用文件，先拷贝过来，在编译，变量名可以重复重复<br> body body1 属性name 一样，也可以编译<br>这里就引用到了name的值</p>

<jsp:include page="/jsp/body2.jsp" flush="true"></jsp:include>



</body>
</html>

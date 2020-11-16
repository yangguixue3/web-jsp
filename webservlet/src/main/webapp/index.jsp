<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2020/11/13
  Time: 上午 12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="http://localhost:8080/servlet01">hello,Servlet生命周期</a><br>
<a href="http://localhost:8080/servlet02">hello,HttpServlet doGet doPost</a><br>
<a href="${pageContext.request.contextPath}/servlet02">...</a><br>
<a href="${pageContext.request.contextPath}/servlet03">servlet的配置信息 context的配置信息</a><br>
<a href="${pageContext.request.contextPath}/ServletDemo04?money=1000">把参数给ServletDemo04，设置到servletContext中</a><br>
<a href="${pageContext.request.contextPath}/ServletDemo05">获取设置到servletContext中的值</a><br>

<form method="post" action="${pageContext.request.contextPath}/ServletDemo06">
    <input type="hidden" name="method" value="register">
    账号:<input type="text" name="username" value=""><br>
    密码:<input type="password" name="password" value=""><br>
    性别:男<input type="radio" name="sex" value="1">
        女<input type="radio" name="sex" value="2">
        不详<input type="radio" name="sex" value="3">
    <br>
    爱好:篮球<input type="checkbox" name="hobby" value="篮球">
        足球<input type="checkbox" name="hobby" value="足球">
        羽毛<input type="checkbox" name="hobby" value="羽毛">
        橄榄球<input type="checkbox" name="hobby" value="橄榄球">
    <br>
    <input type="submit" value="提交注册">
</form>
<hr>
<form method="get" action="${pageContext.request.contextPath}/ServletDemo06">
    账号:<input type="text" name="username" value=""><br>
    密码:<input type="password" name="password" value=""><br>
    <input type="submit" value="提交注册">

</form>


</body>
</html>

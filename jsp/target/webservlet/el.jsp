<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.msr.servlet.User" %>
<%@ page import="java.lang.reflect.Array" %><%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2020/11/16
  Time: 下午 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>El表达式</title>
</head>
<body>

<h1>获取域中数据</h1>
<h4>pageScope|requestScope|sessionScope|applicationScope</h4>

<%
    List<String> list = new ArrayList();
    list.add("AAA");
    list.add("BBB");
    request.setAttribute("list",list);
    Map map = new HashMap();
    map.put("map1","map1");
    map.put("map2","map2");
    map.put("ma-p-3","ma-p-3");
    pageContext.setAttribute("map",map);
%>
<h3>list</h3>
${list}<br>
${list[0]}<br>
<hr>
<h3>map</h3>
${map}}<br>
${map.AAA}}<br>
${map["ma-p-3"]}<br>
<hr>
<h2>not empty 三目</h2>
<%
    Integer a = null;
    pageContext.setAttribute("a",a);
%>
${empty a} ${not empty a}
${a==nul ? true :false}
<hr>
<h2>javabean</h2>
<%
    User user = new User("丽丽","123456","25",new String[]{"篮球","足球"});
    request.setAttribute("user",user);
    List<User> lists = new ArrayList<>();
    lists.add(user);
    lists.add(new User("莉莉","123456","25",new String[]{"篮球","足球"}));
    request.setAttribute("lists",lists);

%>
${user}<br>
${requestScope.user.username}<br>
${requestScope.lists[1].username}
<hr>
<h2>EL表达式中11个隐式对象</h2>
<h4>pageContext</h4>
${pageContext.request.contextPath}:服务的的名称<br>
${pageContext.request.requestURL}:取得请求的URL<br>
${pageContext.request.queryString}:取得请求的参数字符串<br>
${pageContext.request.method}:取得HTTP的方法(GET、POST)<br>
${pageContext.request.protocol}:取得使用的协议(HTTP/1.1、HTTP/1.0)<br>
${pageContext.request.remoteUser}:取得用户名称<br>
${pageContext.request.remoteAddr}:取得用户的IP地址<br>
<%--${pageContext.session.new}判断session是否为新的，所谓新的session，表示刚由server产生而client尚未使用<br>--%>
${pageContext.session.id}:取得session的ID<br>
${pageContext.servletContext.serverInfo}:取得主机端的服务信息<br>
<hr>
<h4>param和paramValues</h4>
<%--request.getParameter(String name)--%>
<%--request.getParameterValues(String name)--%>
${param.name}
${paramValues.name}
<hr>
<h4>initParam</h4>
<%--String userid = (String)application.getInitParameter("userid");--%>
${initParam.servletName}
<hr>
<h4>header和headerValues</h4>
${header["User-Agent"]}
${header["User-Agent"]}

<hr>
<h4>cookie</h4>
<%--假若我们在cookie中设定一个名称为userCountry的值，那么可以使用${cookie.userCountry}来取得它--%>
${cookie.userCountry}








</body>
</html>

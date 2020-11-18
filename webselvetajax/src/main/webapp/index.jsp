<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2020/11/18
  Time: 上午 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>ajax</title>
</head>
<body>
<div id="myDiv"><h2>get请求响应</h2></div>
<button onclick="js_get()">get请求</button>
<div id="myDiv1"><h2>get请求响应</h2></div>
<button onclick="js_post()">post请求</button><span id="span01">post请求</span>
<script>
    function js_get() {
        //1.获取浏览器对象
        var xmlhttp;

        if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari

            xmlhttp=new XMLHttpRequest();

        }else {// code for IE6, IE5

            xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");

        }
        //2.open(请求的方式,请求的路径,[是否异步]) 确定请求的方式和路径
        xmlhttp.open("GET","${pageContext.request.contextPath}/demo01?name=Bill&password=123456",true);
        //3. send 发送请求
        xmlhttp.send();
        //4.回调函数
        xmlhttp.onreadystatechange=function()
        {
            console.log(xmlhttp.readyState);
            console.log(xmlhttp.status);
            console.log(xmlhttp.response);

            if (xmlhttp.readyState==4 && xmlhttp.status==200)
            {
                document.getElementById("myDiv").innerHTML=xmlhttp.responseText;
            }
        }
    }
    function js_post() {
        //1.获取浏览器对象
        var xmlhttp1;

        if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari

            xmlhttp1=new XMLHttpRequest();

        }else {// code for IE6, IE5

            xmlhttp1=new ActiveXObject("Microsoft.XMLHTTP");

        }
        //2.open(请求的方式,请求的路径,[是否异步]) 确定请求的方式和路径
        xmlhttp1.open("POST","${pageContext.request.contextPath}/demo01",true);
        //3. send 发送请求
            //post 请求必须
        xmlhttp1.setRequestHeader("content-type", "application/x-www-form-urlencoded");
        xmlhttp1.send("name=亚麻布post&password=123456");
        //4.回调函数
        //4.回调函数
        xmlhttp1.onreadystatechange=function()
        {
            if (xmlhttp1.readyState==4 && xmlhttp1.status==200)
            {
                document.getElementById("myDiv1").innerHTML=xmlhttp1.responseText;
                var span = document.getElementById("span01");
                span.innerText=xmlhttp1.responseText;
            }
        }
    }

</script>
</body>
</html>

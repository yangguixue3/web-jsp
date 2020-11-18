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

<button onclick="jquery_get()">get请求</button><span id="span0">jQueryGet请求</span><br>
<button onclick="jquery_post()">post请求</button><span id="span01">jQueryPost请求</span><br>
<button onclick="jquery_ajax()">post请求</button><span id="span02">jQueryAjaxPost请求</span><br>
<button onclick="jquery_ajax_json()">post请求</button><span id="span03">jQueryAjaxPost_json请求</span><span id="span04">name</span><br>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script>
    function jquery_get() {
        $.get("${pageContext.request.contextPath}/demo01","name=Bill&password=123456",function (obj) {
            console.log(obj)
            $("#span0").text(obj);
        });
    }
    function jquery_post() {
        $.post("${pageContext.request.contextPath}/demo01","name=山本post&password=123456",function (obj) {
            console.log(obj)
            $("#span01").text(obj);
        });
    }
    function jquery_ajax() {
        // url:请求路径
        // type:请求方式 默认get
        // data:请求参数
        // success:成功之后的回调  值为 function(obj){}
        // error:错误之后的回调 值为function(){}
        // dataType:返回数据的格式
        // 常用的值 : 默认值 或者 "json"
        // async:是否异步 默认异步 true
        $.ajax({
            url:"${pageContext.request.contextPath}/demo01",
            type:"POST",
            data:"name=山本ajax.post&password=123456",
            async:true,
            success:function (obj) {
                console.log(obj)
                $("#span02").text(obj);
            }

        })

    }
    /*
        json 格式
     */
    function jquery_ajax_json() {
        // url:请求路径
        // type:请求方式 默认get
        // data:请求参数
        // success:成功之后的回调  值为 function(obj){}
        // error:错误之后的回调 值为function(){}
        // dataType:返回数据的格式
        // 常用的值 : 默认值 或者 "json"
        // async:是否异步 默认异步 true
        $.ajax({
            url:"${pageContext.request.contextPath}/demo02",
            type:"POST",
            data:"name=山本&password=123456",
            async:true,
            dataType:"json",
            success:function (obj) {
                console.log(obj)
                $("#span03").text(JSON.stringify(obj));
                $("#span04").text(obj.name+":"+obj.password);
            }

        })

    }

</script>
</body>
</html>

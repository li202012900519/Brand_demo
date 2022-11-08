<%--
  Created by IntelliJ IDEA.
  User: 28962
  Date: 2022/10/26
  Time: 23:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/Brand_demo/changePasswordServlet" method="get">
    <input type="password" id = "password1" name="password" onblur="Check()">
    <input type="submit" id = "change" value="修改密码" >
    <div id="errorMsg">${change_msg}</div>
</form>
<script type="text/javascript">

        function Check(){
        var password1 = document.getElementById("password1").value;
        if (password1 == "" || password1.value == null ) {
            alert("请输入内容");
        }
    }

</script>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 28962
  Date: 2022/10/27
  Time: 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>


<div style="width: 100%;height: 8%">
    <h1>${user.username},欢迎您</h1><a href="/Brand_demo/login.jsp" style="color: black;margin-left: 90%;float: left">退出系统</a>
</div>
<iframe style="width: 25%;height: 80%;border: none;margin: 0px" src="zhongzuo.jsp"  >

</iframe>
<iframe style="width: 70%;height: 80%;border: none;margin: 0px" src="welcome.jsp" name="major"></iframe>



</body>
</html>

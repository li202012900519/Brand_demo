<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<html lang="zh">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>话费查询系统</title>



</head>
<body>

<div style="width: 100%;height: 8%">
    <h1>${user.username},欢迎您</h1>
    <a href="/Brand_demo/login.jsp"  style="margin-left: 90%">退出系统</a>
</div>
<iframe style="width: 25%;height: 80%;border: none" src="zuobu.jsp" ></iframe>
<iframe style="width: 70%;height: 80%;border: none;" src="welcome.jsp" name="major1"></iframe>
</body>
</html>
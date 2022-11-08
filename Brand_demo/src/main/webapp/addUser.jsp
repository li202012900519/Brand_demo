<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>添加用户</title>
</head>
<body>
<h3>添加用户</h3>
<form action="/Brand_demo/addUserServlet" method="post">
    用户名：<input name="username" value=""><br>
    密码：<input name="password" value=""><br>
    身份证：<input name="identify" value=""><br>
    电话号码：<input name="tel" value=""><br>


    <input type="submit" value="提交">
</form>
</body>
</html>
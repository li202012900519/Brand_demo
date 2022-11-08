<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>管理用户</title>
</head>
<body>
<h3>修改用户信息</h3>
<form action="/Brand_demo/updateUserServlet" method="post">
    用户名：<input name="username" value="${users.username}"><br>
    密码：<input name="password" value="${users.password}"><br>
    身份证：<input name="identify" value="${users.identify}" readonly="readonly"><br>
    电话：<input name="tel" value="${users.tel}"><br>

    <input type="submit" value="提交">
</form>
<th>${input_msg}</th>
</body>
</html>
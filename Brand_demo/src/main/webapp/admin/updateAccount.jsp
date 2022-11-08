<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>修改账户数据</title>
</head>
<body>
<h3>修改账户余额</h3>
<form action="/Brand_demo/updateAccountServlet" method="post">
    身份证：<input name="identify" value="${account.identify}" readonly="readonly" ><br>
    用户名：<input name="username" value="${account.username}" readonly="readonly" ><br>
    电话：<input name="tel" value="${account.tel}"  readonly="readonly"><br>
    余额：<input name="money" value="${account.money}"><br>

    <input type="submit" value="提交">
</form>
</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>修改流量使用情况</h3>
<form action="/Brand_demo/updateNetServlet" method="post">
    用户名：
    <input type="text"  name="username" value="${net.username}">
    <br>
    身份证:
    <input type="text" name="identify" value="${net.identify}">
    <br>
    电话
    <input type="text" name="tel" value="${net.tel}">
    <br>
    使用流量情况
    <input type="text" name= "nets" value="${net.net}"><br>

    <input type="submit" value="提交">
</form>
</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>修改通话记录</h3>
<form action="/Brand_demo/updateTimeServlet" method="post">
    用户名：
    <input type="text"  name="username" value="${times.username}">
    <br>
    身份证:
    <input type="text" name="identify" value="${times.identify}">
    <br>
    通话日期
    <input type="text" name="teltime" value="${times.teltime}">
    <br>
    通话时长
    <input type="text" name="continuetime" value="${times.continuetime}"><br>
    电话号码：
    <input type="text"  name="tel" value="${times.tel}">
    <br>
<input type="submit" value="提交">
</form>
</body>
</html>

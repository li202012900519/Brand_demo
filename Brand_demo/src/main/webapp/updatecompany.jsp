<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>修改电话公司</h3>
<form action="/Brand_demo/updateCompanyServlet" method="post">
    用户名：
    <input type="text"  name="username" value="${company.username}">
    <br>
    身份证:
    <input type="text" name="identify" value="${company.identify}">
    <br>
    电话
    <input type="text" name="tel" value="${company.tel}">
    <br>
    所属公司
    <input type="text" name= "companys" value="${company.company}"><br>

    <input type="submit" value="提交">
</form>
</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>查看余额</title>
</head>
<body>
<h1>${user.username},欢迎您</h1>

<table border="1" cellspacing="0" width="80%">
    <tr>
        <th>身份证</th>
        <th>用户名</th>
        <th>电话</th>
        <th>余额</th>
        <th>操作</th>

    </tr>


    <c:forEach items="${accounts}" var="accounts">
        <tr align="center">
            <td>${accounts.identify}</td>
            <td>${accounts.username}</td>
            <td>${accounts.tel}</td>
            <td>${accounts.money}</td>
            <td><a href="/Brand_demo/selectByIdentifyServlet?identify=${accounts.identify}">修改</a>
        </tr>
    </c:forEach>

</table>
</body>
</html>
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
        <th>电话流量使用情况(G)</th>
    </tr>

    <tr align="center">
        <%--<td>${brand.id}</td>--%>
        <td>${nets.identify}</td>
        <td>${nets.username}</td>
        <td>${nets.tel}</td>
        <td>${nets.net}</td>
    </tr>

</table>
</body>
</html>
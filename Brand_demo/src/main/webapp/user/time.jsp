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
        <th>用户名</th>
        <th>身份证</th>
        <th>通话时间</th>
        <th>通话时长(min)</th>

    </tr>


    <c:forEach items="${times}" var="times">
        <tr align="center">
                <%--<td>${brand.id}</td>--%>
            <td>${times.username}</td>
            <td>${times.identify}</td>
            <td>${times.teltime}</td>
            <td>${times.continuetime}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
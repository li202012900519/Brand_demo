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
        <th>电话号</th>
        <th>通话时间</th>
        <th>通话时长(min)</th>
        <th>操作</th>

    </tr>


    <c:forEach items="${times1}" var="times1">
        <tr align="center">
                <%--<td>${brand.id}</td>--%>
            <td>${times1.username}</td>
            <td>${times1.identify}</td>
            <td>${times1.tel}</td>
            <td>${times1.teltime}</td>
            <td>${times1.continuetime}</td>
                    <td><a href="/Brand_demo/selectTimeByIdServlet?identify=${times1.identify}">修改</a></td>
        </tr>

    </c:forEach>

</table>
</body>
</html>
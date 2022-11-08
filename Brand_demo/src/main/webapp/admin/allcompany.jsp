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
        <th>电话所属公司</th>
        <th>操作</th>

    </tr>


    <c:forEach items="${companys}" var="companys">
        <tr align="center">
                <%--<td>${brand.id}</td>--%>
            <td>${companys.identify}</td>
            <td>${companys.username}</td>
            <td>${companys.tel}</td>
            <td>${companys.company}</td>
            <td><a href="/Brand_demo/selectCompanyByIdServlet?identify=${companys.identify}">修改</a>

        </tr>
    </c:forEach>

</table>
</body>
</html>
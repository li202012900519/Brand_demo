<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        body{

        }

    </style>
</head>
<body>

<input type="button" value="新增" id="addUser" onclick="window.location.href='addUser.jsp'"><br>

<form action="/Brand_demo/secletByConditionServlet">
    用户名:<input type="text" id = "username" name="username">
    身份证:<input type="text" id = "identify" name="identify">
    <input type="submit" value="查询">
    <a href="/Brand_demo/secletUserServlet">刷新</a>
</form>



<table border="1" cellspacing="0" width="80%">
    <tr>
        <th>用户名</th>
        <th>密码</th>
        <th>身份证</th>
        <th>电话</th>
        <th>操作</th>

    </tr>

    <c:forEach items="${users}" var="users">
        <tr align="center">
                <%--<td>${brand.id}</td>--%>
            <td>${users.username}</td>
            <td>${users.password}</td>
            <td>${users.identify}</td>
            <td>${users.tel}</td>

            <td><a href="/Brand_demo/selectUserByIdentifyServlet?identify=${users.identify}">修改</a>
                <a href="javascript:if(confirm('是否删除'))location.href='/Brand_demo/deleteUserServlet?identify=${users.identify}'">删除</a></td>
        </tr>

    </c:forEach>

</table>
</body>
</html>
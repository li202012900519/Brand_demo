<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>login</title>
    <link href="css/login.css" rel="stylesheet">
</head>

<body>
<div id="loginDiv" style="height: 400px">
    <form action="/Brand_demo/loginServlet" id="form" method="post">
        <h1 id="loginMsg">LOGIN IN</h1>
        <div id="errorMsg">${login_msg} ${register_msg}</div>
        <p>Username:<input id="username" name="username" type="text" value="${cookie.username.value}"></p>
        <p>身&nbsp;份&nbsp;证&nbsp;&nbsp;&nbsp;&nbsp;:<input id="identify" name="identify" type="text" value="${cookie.identify.value}"></p>
        <p>Password&nbsp;:<input id="password" name="password" type="password" value="${cookie.password.value}"></p>
        <p>Remember:<input id="remember" name="remember" value="1" type="checkbox" checked></p>
        <p>管理员:<input type="radio"  id = "user" name="user" value="1"  checked />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;用户:<input type="radio" id = "user1" name="user" value="2"/></p>
        <div id="subDiv">
            <input type="submit" class="button" value="login up">
            <input type="reset" class="button" value="reset">&nbsp;&nbsp;&nbsp;
            <a href="/Brand_demo/register.jsp">没有账号？</a>
        </div>
    </form>
</div>

</body>
</html>
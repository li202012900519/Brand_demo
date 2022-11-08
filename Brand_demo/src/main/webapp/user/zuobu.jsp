<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<style type="text/css">
    .bs-docs-sidenav {
        background-color: #fff;
        border-radius: 6px;
        box-shadow: 0 1px 4px rgba(0, 0, 0, 0.067);
        padding: 0;
        width: 200px;
    }

    .bs-docs-sidenav > li > a {
        border: 1px solid #e5e5e5;
        display: block;
        padding: 8px 14px;
        margin: 0 0 -1px;
    }
    .bs-docs-sidenav > li:first-child > a {
        border-radius: 6px 6px 0 0;
    }
    .bs-docs-sidenav > li:last-child > a {
        border-radius: 0 0 6px 6px;
    }
    .bs-docs-sidenav > .active > a {
        border: 0 none;
        box-shadow: 1px 0 0 rgba(0, 0, 0, 0.1) inset, -1px 0 0 rgba(0, 0, 0, 0.1) inset;
        padding: 9px 15px;
        position: relative;
        text-shadow: 0 1px 0 rgba(0, 0, 0, 0.15);
        z-index: 2;
    }
    .bs-docs-sidenav .icon-chevron-right {
        float: right;

        margin-top: 2px;
        opacity: 0.25;
    }
    .bs-docs-sidenav > li > a:hover {
        background-color: #f5f5f5;
    }
    .bs-docs-sidenav a:hover .icon-chevron-right {
        opacity: 0.5;
    }

</style>
<body>

<div class="container-fluid">
    <div class="row-fluid">
        <div class="span2 bs-docs-sidebar" >
            <ul class="nav nav-list bs-docs-sidenav">
                <li><a href="welcome.jsp" target="major1"><i class="icon-chevron-right"></i>首页</a></li>
                <li><a href="/Brand_demo/SecletAccountServlet" target="major1"><i class="icon-chevron-right" ></i>查询余额</a></li>
                <li><a href="/Brand_demo/selectTimeServlet"target="major1"><i class="icon-chevron-right"></i>通话记录查询</a></li>
                <li><a href="/Brand_demo/selectUserCompanyServlet"target="major1"><i class="icon-chevron-right"></i>电话所属公司</a></li>
                <li><a href="/Brand_demo/selectUserNetServlet"target="major1"><i class="icon-chevron-right"></i>流量使用情况</a></li>
                <li><a href="/Brand_demo/user/changePassword.jsp" target="major1"><i class="icon-chevron-right"></i>修改密码</a></li>
                <li></li>
            </ul>
        </div>
    </div>
</div>


</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="app">
    <div >
        <el-menu
                default-active="2"
                class="el-menu-vertical-demo"
                @open="handleOpen"
                @close="handleClose"
                background-color="#545c64"
                text-color="#fff"
                active-text-color="#ffd04b">
            <el-submenu index="1">
                <template slot="title">
                    <i class="el-icon-location"></i>
                    <span>导航一</span>
                </template>
                <el-menu-item-group>
                    <el-menu-item index="1-1"><a href="welcome.jsp" target="major" >首页 </a></el-menu-item>
                    <el-menu-item index="1-1"><a href="/Brand_demo/secletAllAccountServlet" target="major">查询所有账户余额</a></el-menu-item>
                    <el-menu-item index="1-1"><a href="/Brand_demo/secletUserServlet" target="major" >管理账户信息</a></el-menu-item>
                    <el-menu-item index="1-3"><a href="/Brand_demo/selectAllTimeServlet" target="major"><i class="icon-chevron-right" ></i>查询所有通话记录</a></el-menu-item>
                    <el-menu-item index="1-4"><a href="/Brand_demo/selectCompanyServlet" target="major">查询所有账户公司</a></el-menu-item>
                    <el-menu-item index="1-4"><a href="/Brand_demo/selectNetServlet" target="major">查询所有账户网络使用情况</a></el-menu-item>
                </el-menu-item-group>

            </el-submenu>
            <el-menu-item index="3" >
                <i class="el-icon-document"></i>
                <a href="/Brand_demo/user/changePassword.jsp" target="major" style="color: white"><i class="icon-chevron-right"></i>修改密码</a>
            </el-menu-item>
        </el-menu>
        </el-col>
        </el-row>
    </div>
</div>



<script src = "../js/vue.js"></script>
<script src = "../element-ui/lib/index.js"></script>
<link rel = "stylesheet" href="../element-ui/lib/theme-chalk/index.css">

<script>
    new Vue({
        el:"#app",
        methods: {
            handleOpen(key, keyPath) {
                console.log(key, keyPath);
            },
            handleClose(key, keyPath) {
                console.log(key, keyPath);
            }
        }
    })
</script>

</body>
</html>

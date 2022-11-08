package com.lqw.web;


import com.lqw.pojo.User;
import com.lqw.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    UserService service = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");


        //读取输入的验证码
        String checkCode = request.getParameter("checkCode");


        //获取图片验证码
        HttpSession session = request.getSession();
        String checkCodeGen = (String) session.getAttribute("checkCodeGen");


        User user = new User();
        user.setUsername(username);
        user.setPassword(password);


        if(!( checkCodeGen).equalsIgnoreCase(checkCode)){
            request.setAttribute("register_msg","验证码错误");
            request.getRequestDispatcher("/register.jsp").forward(request,response);
            return;
        }


        //读取数据库的用户，返回true或false
        boolean flag = service.register(user);

        if(flag){
            request.setAttribute("register_msg","注册成功请登录");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
        else{
            request.setAttribute("register_msg","用户名已存在，请重新注册");
            request.getRequestDispatcher("/register.jsp").forward(request,response);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        this.doGet(request,response);
    }
}

package com.lqw.web;

import com.lqw.pojo.Account;
import com.lqw.pojo.User;
import com.lqw.service.AccountService;
import com.lqw.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/updateUserServlet")
public class UpdateUserServlet extends HttpServlet {

    UserService service  = new UserService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException,NumberFormatException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String identify = request.getParameter("identify");
        String tel = request.getParameter("tel");

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setIdentify(Integer.parseInt(identify));
        user.setTel(Integer.parseInt(tel));
        service.updateUser(user);
        request.getRequestDispatcher("/secletUserServlet").forward(request,response);
        }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}

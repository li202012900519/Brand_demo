package com.lqw.web;

import com.lqw.pojo.User;
import com.lqw.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/changePasswordServlet")
public class ChangePasswordServlet extends HttpServlet {
    UserService service = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session1 = request.getSession();
        String username = (String) session1.getAttribute("username");
        String password = request.getParameter("password");
        service.changePassword(username, password);
        request.getRequestDispatcher("/user/main.jsp").forward(request,response);

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}

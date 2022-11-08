package com.lqw.web;

import com.lqw.pojo.User;
import com.lqw.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectUsernameByIdentifyServlet")
public class SelectUsernameByIdentifyServlet extends HttpServlet {

    UserService service = new UserService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> users = service.selectAll();
        request.setAttribute("users",users);
        System.out.println(users);
        request.getRequestDispatcher("/updatetime.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}

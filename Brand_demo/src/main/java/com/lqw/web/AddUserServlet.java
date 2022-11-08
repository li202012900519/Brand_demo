package com.lqw.web;

import com.lqw.pojo.User;
import com.lqw.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addUserServlet")
public class AddUserServlet extends HttpServlet {
    UserService service = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Integer identify = Integer.parseInt(request.getParameter("identify"));
        Integer tel = Integer.parseInt(request.getParameter("tel"));


        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setIdentify(identify);
        user.setTel(tel);

        service.add1(user);


        request.getRequestDispatcher("/secletUserServlet").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        this.doGet(request,response);
    }

}

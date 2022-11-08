package com.lqw.web;

import com.lqw.pojo.Account;
import com.lqw.pojo.User;
import com.lqw.service.AccountService;
import com.lqw.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/selectUserByIdentifyServlet")
public class SelectUserByIdentifyServlet extends HttpServlet {
    UserService service =new UserService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String identify = request.getParameter("identify");
        System.out.println(identify);
        User users = service.selectUserByIdentify(Integer.parseInt(identify));
        request.setAttribute("users",users);
        request.getRequestDispatcher("/admin/updateUser.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}

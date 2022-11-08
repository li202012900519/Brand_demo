package com.lqw.web;

import com.lqw.pojo.Account;
import com.lqw.service.AccountService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/SecletAccountServlet")
public class SecletAccountServlet extends HttpServlet {

    AccountService service = new AccountService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session1 = request.getSession();
        String username = (String) session1.getAttribute("username");
        List<Account> accounts = service.selectByUsername(username);
        request.setAttribute("accounts",accounts);
        System.out.println(accounts);
        request.getRequestDispatcher("/user/updateAccount.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}

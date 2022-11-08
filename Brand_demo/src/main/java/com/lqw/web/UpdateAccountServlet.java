package com.lqw.web;

import com.lqw.pojo.Account;
import com.lqw.service.AccountService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/updateAccountServlet")
public class UpdateAccountServlet extends HttpServlet {
    AccountService service  = new AccountService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException,NumberFormatException {
        request.setCharacterEncoding("utf-8");
        String money = request.getParameter("money");
        String identify = request.getParameter("identify");
        String username = request.getParameter("username");
        String tel = request.getParameter("tel");
        Account account = new Account();
        account.setTel(Integer.parseInt(tel));
        account.setMoney(Double.parseDouble(money));
        account.setIdentify(Integer.parseInt(identify));
        account.setUsername(username);
        service.update(account);
        System.out.println(account);
        request.getRequestDispatcher("/secletAllAccountServlet").forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}

package com.lqw.web;

import com.lqw.pojo.Account;
import com.lqw.service.AccountService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/selectByIdentifyServlet")
public class SelectByIdentifyServlet extends HttpServlet {
    AccountService service =new AccountService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String identify = request.getParameter("identify");
        Account account = service.selectByIdentify(Integer.parseInt(identify));
        request.setAttribute("account",account);
        request.getRequestDispatcher("/admin/updateAccount.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}

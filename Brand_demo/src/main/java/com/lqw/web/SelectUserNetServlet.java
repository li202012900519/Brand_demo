package com.lqw.web;

import com.lqw.pojo.Company;
import com.lqw.pojo.Net;
import com.lqw.service.NetService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/selectUserNetServlet")
public class SelectUserNetServlet extends HttpServlet {
    NetService service = new NetService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Integer identify = (Integer) session.getAttribute("identify");
        Net nets = service.selectNetById(identify);
        request.setAttribute("nets",nets);
        System.out.println(nets);
        request.getRequestDispatcher("/user/usernet.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}

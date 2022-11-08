package com.lqw.web;

import com.lqw.pojo.Company;
import com.lqw.pojo.Net;
import com.lqw.service.NetService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/selectNetByIdServlet")
public class SelectNetByIdServlet extends HttpServlet {
    NetService service = new NetService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String identify = request.getParameter("identify");
        Net net = service.selectNetById(Integer.parseInt(identify));
        request.setAttribute("net",net);
        System.out.println(net);
        request.getRequestDispatcher("/updatenet.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}

package com.lqw.web;

import com.lqw.mapper.NetMapper;
import com.lqw.pojo.Company;
import com.lqw.pojo.Net;
import com.lqw.service.CompanyService;
import com.lqw.service.NetService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectNetServlet")
public class SelectNetServlet extends HttpServlet {
    NetService service = new NetService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Net> nets = service.selectNet();
        request.setAttribute("nets",nets);
        request.getRequestDispatcher("/admin/allnet.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}

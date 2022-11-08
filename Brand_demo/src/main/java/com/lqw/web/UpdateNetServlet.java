package com.lqw.web;

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

@WebServlet("/updateNetServlet")
public class UpdateNetServlet extends HttpServlet {
    NetService service = new NetService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String net1 = request.getParameter("nets");
        String identify = request.getParameter("identify");
        String username = request.getParameter("username");
        String tel = request.getParameter("tel");
        Net net = new Net();
        net.setTel(Integer.parseInt(tel));
        net.setNet(Double.parseDouble(net1));
        net.setIdentify(Integer.parseInt(identify));
        net.setUsername(username);
        service.update(net);
        System.out.println(net);
        request.getRequestDispatcher("/selectNetServlet").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}

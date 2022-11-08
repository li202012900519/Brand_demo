package com.lqw.web;

import com.lqw.pojo.Time;
import com.lqw.service.TimeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectTimeByIdServlet")
public class SelectTimeByIdServlet extends HttpServlet {

    TimeService service  = new TimeService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer identify = Integer.parseInt(request.getParameter("identify"));
        Time times = service.selectByIdentify(identify);
        System.out.println(identify);
        request.setAttribute("times",times);
        System.out.println(times);
        request.getRequestDispatcher("/updatetime.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}

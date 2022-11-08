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

@WebServlet("/selectAllTimeServlet")

public class SelectAllTimeServlet extends HttpServlet {

    TimeService service  = new TimeService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Time> times1 = service.selectAllTime();
        request.setAttribute("times1",times1);
        System.out.println(times1);
        request.getRequestDispatcher("/admin/alltime.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}

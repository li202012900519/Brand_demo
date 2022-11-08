package com.lqw.web;

import com.lqw.pojo.Account;
import com.lqw.pojo.Time;
import com.lqw.service.TimeService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectTimeServlet")
public class SelectTimeServlet extends HttpServlet {

    TimeService service  = new TimeService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Integer identify = (Integer) session.getAttribute("identify");
        List<Time> times = service.selectByUsername(identify);
        request.setAttribute("times",times);
        System.out.println(times);
        request.getRequestDispatcher("/user/time.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}

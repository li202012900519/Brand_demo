package com.lqw.web;

import com.lqw.pojo.Time;
import com.lqw.service.TimeService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@WebServlet("/updateTimeServlet")
public class UpdateTimeServlet extends HttpServlet {

    TimeService service = new TimeService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String identify = request.getParameter("identify");
        String tel = request.getParameter("tel");
        String teltime = request.getParameter("teltime");
        String continuetime = request.getParameter("continuetime");

        Time time = new Time();
        time.setUsername(username);
        time.setIdentify(Integer.parseInt(identify));
        time.setTel(Integer.parseInt(tel));
        time.setTeltime(teltime);
        time.setContinuetime(Integer.parseInt(continuetime));
        System.out.println(time);
        service.updateTime(time);
        request.getRequestDispatcher("/selectAllTimeServlet").forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}

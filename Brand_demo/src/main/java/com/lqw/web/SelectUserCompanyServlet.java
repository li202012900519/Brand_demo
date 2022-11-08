package com.lqw.web;

import com.lqw.pojo.Company;
import com.lqw.pojo.Time;
import com.lqw.service.CompanyService;
import com.lqw.service.TimeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectUserCompanyServlet")
public class SelectUserCompanyServlet extends HttpServlet {

    CompanyService service  = new CompanyService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Integer identify = (Integer) session.getAttribute("identify");
        Company companys = service.selectCompanyById(identify);
        request.setAttribute("companys",companys);
        System.out.println(companys);
        request.getRequestDispatcher("/user/usercompany.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}

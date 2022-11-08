package com.lqw.web;

import com.lqw.pojo.Account;
import com.lqw.pojo.Company;
import com.lqw.service.CompanyService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectCompanyByIdServlet")
public class SelectCompanyByIdServlet extends HttpServlet {
    CompanyService service = new CompanyService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String identify = request.getParameter("identify");
        Company company = service.selectCompanyById(Integer.parseInt(identify));
        request.setAttribute("company",company);
        System.out.println(company);
        request.getRequestDispatcher("/updatecompany.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}

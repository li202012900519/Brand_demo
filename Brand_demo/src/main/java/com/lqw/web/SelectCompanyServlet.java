package com.lqw.web;

import com.lqw.pojo.Account;
import com.lqw.pojo.Company;
import com.lqw.service.CompanyService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectCompanyServlet")
public class SelectCompanyServlet extends HttpServlet {
    CompanyService service = new CompanyService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Company> companys = service.selectCompany();
        request.setAttribute("companys",companys);
        request.getRequestDispatcher("/admin/allcompany.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}

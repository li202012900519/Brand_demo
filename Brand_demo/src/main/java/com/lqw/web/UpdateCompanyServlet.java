package com.lqw.web;

import com.lqw.pojo.Account;
import com.lqw.pojo.Company;
import com.lqw.service.CompanyService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/updateCompanyServlet")
public class UpdateCompanyServlet extends HttpServlet {
    CompanyService service = new CompanyService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String company1 = request.getParameter("companys");
        String identify = request.getParameter("identify");
        String username = request.getParameter("username");
        String tel = request.getParameter("tel");
        Company companyList = new Company();
        companyList.setTel(Integer.parseInt(tel));
        companyList.setCompany(company1);
        companyList.setIdentify(Integer.parseInt(identify));
        companyList.setUsername(username);
        service.update(companyList);
        System.out.println(company1);
        request.getRequestDispatcher("/selectCompanyServlet").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}

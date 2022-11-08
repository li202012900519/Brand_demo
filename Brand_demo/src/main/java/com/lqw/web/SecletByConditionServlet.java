package com.lqw.web;

import com.lqw.mapper.UserMapper;
import com.lqw.pojo.User;
import com.lqw.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/secletByConditionServlet")
public class SecletByConditionServlet extends HttpServlet {
    UserService service = new UserService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = "";
        Integer identify = 0;
        if(request.getParameter("username") != null){
            username = request.getParameter("username");
        }
        if(request.getParameter("identify") !=null && request.getParameter("identify") !=""){
            identify = Integer.parseInt(request.getParameter("identify"));
        }
        User user = new User();
        user.setUsername(username);
        user.setIdentify(identify);

        System.out.println(user);

        List<User> users = service.secletByconditon(user);
        request.setAttribute("users",users);
        request.getRequestDispatcher("/secletByConditon.jsp").forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}

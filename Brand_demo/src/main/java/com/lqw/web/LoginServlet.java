package com.lqw.web;



import com.lqw.pojo.User;
import com.lqw.service.UserService;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    UserService service = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Integer identify =  Integer.parseInt(request.getParameter("identify"));
        Integer radio = Integer.parseInt(request.getParameter("user"));


        String remember = request.getParameter("remember");
        if(radio == 1){
            User user = service.login1(username,password);
            if(user != null){
                if("1".equals(remember)){
                    Cookie c_username = new Cookie("username",username);
                    Cookie c_password = new Cookie("password",password);


                    c_username.setMaxAge(60*60*24*30);
                    c_password.setMaxAge(60*60*24*30);


                    response.addCookie(c_username);
                    response.addCookie(c_password);

                }
                HttpSession session = request.getSession();
                session.setAttribute("user",user);
                HttpSession session1 = request.getSession();
                session1.setAttribute("username",username);
                HttpSession session2 = request.getSession();
                session2.setAttribute("password",password);
                String  contextPath = request.getContextPath();
                response.sendRedirect(contextPath + "/admin/mainadmin.jsp");
            }
            else{
                request.setAttribute("login_msg","用户名或密码错误");
                request.getRequestDispatcher("/login.jsp").forward(request,response);
            }
        }
        else
        {
            User user = service.login(username, password,identify);
            if(user != null){
                if("1".equals(remember)){
                    Cookie c_username = new Cookie("username",username);
                    Cookie c_password = new Cookie("password",password);
                    Cookie c_identify = new Cookie("identify",identify.toString());

                    c_username.setMaxAge(60*60*24*30);
                    c_password.setMaxAge(60*60*24*30);
                    c_identify.setMaxAge(60*60*24*30);

                    response.addCookie(c_username);
                    response.addCookie(c_password);
                    response.addCookie(c_identify);
                }
                HttpSession session = request.getSession();
                session.setAttribute("user",user);
                HttpSession session1 = request.getSession();
                session1.setAttribute("username",username);
                HttpSession session2 = request.getSession();
                session1.setAttribute("password",password);
                HttpSession session3 = request.getSession();
                session3.setAttribute("identify",identify);
                String  contextPath = request.getContextPath();
                response.sendRedirect(contextPath + "/user/main.jsp");
            }
            else{
                request.setAttribute("login_msg","用户名密码或身份证错误");
                request.getRequestDispatcher("/login.jsp").forward(request,response);
            }
        }




    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        this.doGet(request,response);
    }
}

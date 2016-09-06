package edu.acc.j2ee.login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User bean = (User)request.getAttribute("loginbean");
        String destination = "index.jsp";
        if (!UserDao.validates(bean))
            request.setAttribute("flash", "Invalid Credentials");
        else if (!UserDao.authentic(bean))
            request.setAttribute("flash", "Access Denied");
        else {
            request.getSession().setAttribute("username", bean.getUser());
            destination = "content.jsp";
        }
        request.getRequestDispatcher(destination).forward(request, response);
    }
}

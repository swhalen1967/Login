package edu.acc.j2ee.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RegisterBean regBean = (RegisterBean)request.getAttribute("registerBean");
        String destination = "register.jsp";
        String message = UserDao.validateRegistration(regBean);
        if (message != null)
            request.setAttribute("flash", message);
        else if (!UserDao.register(regBean))
            request.setAttribute("flash",
                    String.format("User name %s is taken", regBean.getUser()));
        else {
            request.getSession().setAttribute("username", regBean.getUser());
            destination = "content.jsp";
        }
        request.getRequestDispatcher(destination).forward(request, response);
    }

}

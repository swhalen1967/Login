package edu.acc.j2ee.login;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext ctx = sce.getServletContext();
        String u1name = ctx.getInitParameter("user.1.name");
        String u1pass = ctx.getInitParameter("user.1.pass");
        String u2name = ctx.getInitParameter("user.2.name");
        String u2pass = ctx.getInitParameter("user.2.pass");
        
        User u1 = new User(u1name, u1pass);
        User u2 = new User(u2name, u2pass);
        
        UserDao.addUser(u1);
        UserDao.addUser(u2);
        
        ctx.setAttribute("candyVan", new CandyVan());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}

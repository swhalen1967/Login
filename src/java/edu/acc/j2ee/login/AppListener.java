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
        
        RegisterBean u1 = new RegisterBean(u1name, u1pass, u1pass);
        RegisterBean u2 = new RegisterBean(u2name, u2pass, u2pass);
        
        registerInitialUser(u1);
        registerInitialUser(u2);
        
        ctx.setAttribute("candyVan", new CandyVan());
    }
    
    private void registerInitialUser(RegisterBean reg) throws IllegalArgumentException {
        String message = UserDao.validateRegistration(reg);
        if (message != null)
            throw new IllegalArgumentException(reg.getUser() + ": " + message);
        if (!UserDao.register(reg))
            throw new IllegalArgumentException(reg.getUser() + ": " + "User exists!");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}

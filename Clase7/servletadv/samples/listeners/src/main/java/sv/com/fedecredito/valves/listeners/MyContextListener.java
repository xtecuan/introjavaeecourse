/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.com.fedecredito.valves.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author xtecuan
 */
public class MyContextListener implements ServletContextListener {

    //private static final Logger logger = LogManager.getLogger(MyContextListener.class);
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("La aplicacion acaba de iniciar: " + sce.getServletContext().getContextPath());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("La aplicacion se acaba de destruir: " + sce.getServletContext().getContextPath());
    }
}

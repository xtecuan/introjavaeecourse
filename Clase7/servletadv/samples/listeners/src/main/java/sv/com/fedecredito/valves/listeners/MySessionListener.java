/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.com.fedecredito.valves.listeners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Web application lifecycle listener.
 *
 * @author xtecuan
 */
public class MySessionListener implements HttpSessionListener {

    private static final Logger logger = LogManager.getLogger(MySessionListener.class);

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Se creo la Sesion: " + se.getSession().getId());
        logger.info("Se creo la Sesion: " + se.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Se invalido la sesion: " + se.getSession().getId());
        logger.info("Se invalido la sesion: " + se.getSession().getId());
    }
}

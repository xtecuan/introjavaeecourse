/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.com.fedecredito.ejemplos.miaplicacion2.ejb.client;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import sv.com.fedecredito.ejemplos.miaplicacion2.ejb.LogicaBean;

/**
 *
 * @author xtecuan
 */
public class LogicaBeanClient {

    LogicaBean logica;

    public LogicaBeanClient() {
    }

    public LogicaBean getLogica() {
        if (logica == null) {
            this.setLogica(lookupLogicaBeanBean());
        }
        return logica;
    }

    public void setLogica(LogicaBean logica) {
        this.logica = logica;
    }

    private LogicaBean lookupLogicaBeanBean() {
        try {
            Context c = new InitialContext();
                return (LogicaBean) c.lookup("java:global/miaplicacion2-1.0-SNAPSHOT/logicaBean");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    

}

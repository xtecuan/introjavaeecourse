/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.com.fedecredito.ejemplos.miaplicacion2.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author xtecuan
 */

@Stateless(name = "logicaBean",mappedName = "java:global/logicaBean")
public class LogicaBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public String saludar(String nombres, String apellidos) {
        return "Hola: " + nombres + " " + apellidos;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author xtecuan
 */
public class ObtenerFecha implements Serializable{
    
    public Date getDate(){
        return new Date();
    }
}

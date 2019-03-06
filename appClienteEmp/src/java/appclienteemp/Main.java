/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appclienteemp;

import javax.ejb.EJB;
import sesion.operacionesRemote;

/**
 *
 * @author lv1013
 */
public class Main {

    @EJB
    private static operacionesRemote operaciones;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println(operaciones.suma(5,3));

    }
    
}

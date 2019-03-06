/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion;

import javax.ejb.Remote;

/**
 *
 * @author lv1013
 */
@Remote
public interface operacionesRemote{

    float suma(float v1, float v2);
    
    float resta(float v1,float v2);

    public float multiplicacion(float v1, float v2);

    public boolean insertar(int index, float valor);
    
    
    
}


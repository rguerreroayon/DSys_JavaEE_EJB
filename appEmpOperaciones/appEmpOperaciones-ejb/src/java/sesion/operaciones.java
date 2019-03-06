/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion;

import javax.ejb.Stateless;

/**
 *
 * @author lv1013
 */
@Stateless
public class operaciones implements operacionesRemote {
    float arreglo[] = {0,0,0};
    
    @Override
    public float suma(float v1, float v2) {
        return v1+v2;
    }

    @Override
    public float resta(float v1, float v2) {
        return v1-v2;
    }
    
    @Override
    public float multiplicacion(float v1, float v2){
        return v1*v2;
    }
    
    @Override
    public boolean insertar(int index, float valor){
        return true;
    }

   
}

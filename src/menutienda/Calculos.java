/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menutienda;

/**
 *
 * @author vicenteyah
 */
public class Calculos {
    
    public double conDescuento(double cuenta)
    {
        double  suma = cuenta - ((0.20)*(cuenta));
        return suma;
    }
    
    public double conDescuentoInternet(double cuenta)
    {
        double  suma =cuenta - ((0.10)*(cuenta));
        return suma;
    }
    
}

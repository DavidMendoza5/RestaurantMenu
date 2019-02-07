
package menutienda;

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


package Logica;

import static java.lang.Math.pow;

public class cuadrado extends Basic {
    private double lado;
    
    public void setLado(float x)
    {
        this.lado =x;
    }

    @Override
    public void area() {
        this.area=pow(lado,2);
        System.out.println("El area del cuadrado es:" + super.area);
        super.area(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void perimetro() {
        this.perimetro=4*lado;
        System.out.println("El perimetro del cuadrado es:" + super.perimetro);
        super.perimetro(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

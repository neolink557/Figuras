package Logica;
import static java.lang.Math.pow;
public class triangulo extends Basic {
    private float base;
    private float altura;
    public void setBase(float x)
    {
        this.base=x;
    }
    public void setAltura(float x)
    {
        this.altura=x;
    }
    @Override
    public void area() {
        super.area=(base*altura)/2;
        System.out.println("El area del triangulo es:" + super.area);
        super.area(); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void perimetro() {
        super.perimetro=pow(base,2)+pow(altura,2);
        super.perimetro=Math.sqrt(this.perimetro);
        super.perimetro=base+altura+super.perimetro;
        System.out.println("El perimetro del triangulo es:" + super.perimetro);
        super.perimetro(); //To change body of generated methods, choose Tools | Templates.
    }
}

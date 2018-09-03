package Logica;
public class rectangulo extends Basic {
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
        super.area=(base*altura);
        System.out.println("El area del rectangulo es:" + super.area);
        super.area(); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void perimetro() {
        super.perimetro=(2*base)+(2*altura);
        System.out.println("El perimetro del rectangulo es:" + super.perimetro);
        super.perimetro(); //To change body of generated methods, choose Tools | Templates.
    }
    
}

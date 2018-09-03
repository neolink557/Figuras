
package Logica;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class circulo extends Basic {
   protected float radio;
   
   
   public void setRadio(float x)
   {
       this.radio=x;
   }
      
     
    

    @Override
    public void area() {
         super.area=pow(this.radio,2);
         super.area=PI*super.area;
         
        System.out.println("El area del circulo es:" + super.area);
        
        super.area(); //To change body of generated methods, choose Tools | Templates.
    }
   
    @Override
    public void perimetro() {
       super.perimetro=2*PI*radio;
       System.out.println("El perimetro del circulo es:" + super.perimetro);
        
        super.perimetro(); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
  
    
}

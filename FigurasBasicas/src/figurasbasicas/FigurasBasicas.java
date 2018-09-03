package figurasbasicas;
import java.util.Scanner;
import Logica.circulo;
import Logica.cuadrado;
import Logica.rectangulo;
import Logica.triangulo;

public class FigurasBasicas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cuadrado cd = new cuadrado();
        rectangulo rt=new rectangulo();
        triangulo tr = new triangulo();
        circulo cr =new circulo();
        System.out.println("DIGITE UN NUMERO PARA CALCULAR BASE Y ALTURA:\n "
                + "1. circulo \n"
                + "2.triangulo \n"
                + "3. rectangulo \n"
                + "4. cuadrado");
        int x;
        
        x=sc.nextInt();
        switch(x)
        {
            case 1:
                    System.out.println("ingrese radio");
                    cr.setRadio(sc.nextFloat());
                    cr.area();
                    cr.perimetro();
                    break;
            case 2:
                     System.out.println("ingrese la base");
                    tr.setBase(sc.nextFloat());
                    System.out.println("ingrese la Altura");
                    tr.setAltura(sc.nextFloat());
                    tr.area();
                    tr.perimetro();
                    break;
           case 3:
                    System.out.println("ingrese la base");
                    rt.setBase(sc.nextFloat());
                    System.out.println("ingrese la Altura");
                    rt.setAltura(sc.nextFloat());
                    rt.area();
                    rt.perimetro();
                    break;
            case 4:
                    System.out.println("ingrese lado");
                    cd.setLado(sc.nextFloat());
                    cd.area();
                    cd.perimetro();
                    break;
                   
        }
        
        
    }
    
}

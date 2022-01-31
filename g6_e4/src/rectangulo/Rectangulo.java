package rectangulo;

import java.util.Locale;
import java.util.Scanner;



public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo() {
         Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
       
             do {
               
                    System.out.println("Ingrese la base");
                    this.base=leer.nextDouble();
                    System.out.println("Ingrese la altura");
                    this.altura=leer.nextDouble();
                    
             }while(this.altura == this.base);
         
        
    }

    public void calcularSuperficie(){
        double superficie;
        superficie=base*altura;
        System.out.println("La superficie es de: "+superficie);
    }
    
     public void calcularPerimetro(){
        double perimetro;
        perimetro=(base+altura)*2;
        System.out.println("La superficie es de: "+perimetro);
    }
     
     public void dibujoRectangulo(){
       for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base ; j++) {
                if (i > 0 && j > 0 && i < this.altura - 1 && j < this.base - 1) {
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }


}

package circunferencia;


import java.util.Locale;
import java.util.Scanner;



public class Circunferencia {
    
    private double radio;
    
    
    public Circunferencia(){
        
    } 
    
    public Circunferencia(double radio){
       this.radio=radio;
    }

    //getters y setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
  
    //metodos 
    
    public void crearCircunferencia(){
         Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
         System.out.println("Ingrese el radio de la circunferencia");
         this.radio=leer.nextDouble();
    }
    
    public void hallarArea(){      
      double  area=Math.PI * Math.pow(radio,2);
        System.out.println("El area de la circunferencia es: "+area);
    }
    
    public void hallarPerimetro(){
       double perimetro = 2*Math.PI*radio;
        System.out.println("El perimetro de la circuferencia es: "+perimetro);
    }
    
}

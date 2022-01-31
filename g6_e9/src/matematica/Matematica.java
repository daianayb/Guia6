
package matematica;

import static java.lang.Double.max;
import static java.lang.Double.min;


public class Matematica {
    private double numero1;
    private double numero2;

    public Matematica() {
    }

    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public double devolverMayor(){
       return max(this.numero1,this.numero2);
    }
    
    public void calcularPotencia(){
        this.numero1=Math.round(this.numero1);
        this.numero2=Math.round(this.numero2);
        
        double numMax,numMin;
        
        numMax=max(this.numero1,this.numero2);
        numMin=min(this.numero1,this.numero2);
        System.out.println("La potencia del numero "+numMax);
        System.out.println("Elevado al numero: "+numMin);
        System.out.println("Es: "+Math.pow(numMax, numMin));
        
    }
    
    
    public void calcularRaiz(){
        this.numero1=Math.abs(this.numero1);
        this.numero2=Math.abs(this.numero2);
        double numMin=min(this.numero1,this.numero2);
        System.out.println("La raiz cuadrada del numero: "+numMin); 
        System.out.println("Es: "+ Math.sqrt(numMin));
    }
    
    
}

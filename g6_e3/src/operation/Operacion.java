
package operation;

import java.util.Locale;
import java.util.Scanner;


public class Operacion {
    
    private float numero1;
    private float numero2;
    
    //metodos constructores
    
    public Operacion(float numero1 ,float numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }
    
    public Operacion(){
        
    }

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }
    
    
    public void crearOperacion(){
          Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
          System.out.println("Ingrese el primer numero");
          this.setNumero1(leer.nextFloat());
           System.out.println("Ingrese el segundo numero");
          this.setNumero2(leer.nextFloat());
    }
    
    public float sumar(){
     return numero1+numero2;
}
    
    public float restar(){
        return numero1-numero2;
    }
    
    public float multiplicar(){
        if(numero1 == 0 || numero2 ==0){
            return 0;
        }else
        {
            return numero1 * numero2;
        }
    }
    
    public float dividir(){
        if(numero1 == 0 || numero2 ==0){
            return 0;
        }else
        {
            return numero1 / numero2;
        }
    }
}


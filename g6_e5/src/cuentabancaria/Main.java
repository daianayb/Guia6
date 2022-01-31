
package cuentabancaria;

import java.util.Locale;
import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        
       Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
       
       int opcion=0;
       
       Cuenta cuenta1=new Cuenta();
       
        while(opcion!=7){
            System.out.println("MENU DE OPERACIONES:    ");
            System.out.println("1) Crear Cuenta");
            System.out.println("2) Ingresar Saldo");
            System.out.println("3) Retirar Saldo");
            System.out.println("4) Extraccion Rapida");
            System.out.println("5) Consultar Saldo");
            System.out.println("6) Consultar Datos");
            System.out.println("7) SALIR");
            System.out.print("Ingrese la opcion que desee:");
            opcion=leer.nextInt();
            
            switch (opcion){
                case 1:
                    cuenta1.crearCuenta();
                    break;
                    
                case 2:
                    double saldo;
                    System.out.println("Ingrese el monto a depositar");
                    saldo=leer.nextDouble();
                    cuenta1.ingresar(saldo);
                    break;
                    
                case 3:
                      double retira;
                    System.out.println("Ingrese el monto a retirar");
                    retira=leer.nextDouble();
                    cuenta1.retirar(retira);
                    break;
                    
                case 4:
                    cuenta1.extraccionRapida();
                    break;
                    
                case 5:
                    cuenta1.consultarSaldo();
                    break;
                            
                 case 6:
                     cuenta1.consultarDatos();
                     break;
                     
                 case 7:
                     System.out.println("Saliendo del programa...");
                     break;
                                
                                
            }
        }
    }
    
}


package cafetera;

import java.util.Locale;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
       Cafetera cafe1=new Cafetera();
       
         Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
       
       int opcion=0;
       
       
        while(opcion!=7){
            System.out.println("MENU DE OPERACIONES:    ");
            System.out.println("1) Asignar capacidad maxima de la cafetera");
            System.out.println("2) Llenar la cafetera");
            System.out.println("3) Servir taza");
            System.out.println("4) Vaciar cafetera");
            System.out.println("5) Agregar cafe");
            System.out.println("6) Consultar cantidad de cafe en la cafetera");
            System.out.println("7) SALIR");
            System.out.print("Ingrese la opcion que desee:");
            opcion=leer.nextInt();
            
            switch (opcion){
                case 1:
                  int  capacidadMaxima;
                    System.out.println("Ingrese la capacidad maxima de la cafetera");
                    capacidadMaxima=leer.nextInt();
                    cafe1.setCapacidadMaxima(capacidadMaxima);
                    break;
                    
                case 2:
                   cafe1.llenarCafetera();
                    break;
                    
                case 3:
                     int tamañoTaza;
                    System.out.println("Ingrese el tamaño de taza");
                    cafe1.servirTaza(tamañoTaza=leer.nextInt());
                    break;
                    
                case 4:
                    cafe1.vaciarCafetera();
                    break;
                    
                case 5:
                    int cantidadCafe;
                    System.out.println("Ingrese la cantidad de cafe a agregar");
                   cafe1.agregarCafe(cantidadCafe=leer.nextInt());
                    break;
                            
                 case 6:
                     cafe1.consultaCafetera();
                     break;
                     
                 case 7:
                     System.out.println("Saliendo del programa...");
                     break;
                                
                                
            }
        }
    }
    
}

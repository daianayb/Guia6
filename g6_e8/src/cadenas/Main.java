
package cadenas;

import java.util.Locale;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
       
        Cadena cadena1 = new Cadena(); 
        
        int opcion=0;
        
        Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
      System.out.println("Ingrese una frase");
        String frase=leer.next();
        cadena1.setFrase(frase);
        cadena1.setLongitudFrase(frase.length());
        
        do{
            System.out.println("Opciones:");
            System.out.println("1- Mostrar vocales");
            System.out.println("2- Invertir frase");
            System.out.println("3- Caracter repetido");
            System.out.println("4- Comparar longitud con otra frase");
            System.out.println("5- Unir frases");
            System.out.println("6- Reemplazar letra");
            System.out.println("7- Contiene letra");
            System.out.println("8- Salir");
            opcion=leer.nextInt();
            
            switch(opcion){
                
                case 1:
                    cadena1.mostrarVocales();
                    break;
                case 2:
                    cadena1.invertirFrase();
                    break;
                    
                case 3:
                    String letra;
                    do{
                    System.out.println("Ingrese una letra ");
                    letra=leer.next();                         
                    }while(letra.length() != 1);
                    cadena1.vecesRepetido(letra);
                    break;
                case 4:
                    String fraseCompara;
                    System.out.println("Ingrese otra frase");
                    fraseCompara=leer.next();
                    cadena1.compararLongitud(fraseCompara);
                    break;
                    
                case 5:
                    String fraseUnir;
                    System.out.println("Ingrese otra frase a unir");
                    fraseUnir=leer.next();
                    cadena1.unirFrases(fraseUnir);
                    break;
                    
                case 6:
                    String letraReemplace;
                    do{
                    System.out.println("Ingrese una letra para reemplaar");
                    letraReemplace=leer.next();                         
                    }while(letraReemplace.length() != 1);
                    cadena1.reemplazar(letraReemplace);
                    break;
                    
                case 7:
                    String letraContiene;
                    do{
                    System.out.println("Ingrese una letra a buscar");
                    letraContiene=leer.next();                         
                    }while(letraContiene.length() != 1);
                    if(cadena1.contiene(letraContiene)){
                        System.out.println("La cadena contiene la letra: "+letraContiene);
                    }else{
                        System.out.println("La cadena no contiene la letra");
                    }
                    break;
                    
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
            }
       
            
        }while(opcion!=8);
        
      
        
    }
    
}

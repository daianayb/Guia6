
package package1;

import java.util.Locale;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
       Libro libro1=new Libro();
       
        Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese el ISBN");
        int isbn=leer.nextInt();
        System.out.println("Ingrese el titulo");
        String tit=leer.next();
        System.out.println("Ingrese el autor");
        String autor=leer.next();
        System.out.println("Ingrese el numero de paginas");
        int npag=leer.nextInt();
        
        libro1.Carga(isbn , tit , autor , npag);
        
        libro1.Informe();
        
        
    }
    
}

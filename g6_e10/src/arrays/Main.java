
package arrays;

import java.util.Arrays;
import static java.util.Arrays.copyOfRange;


public class Main {

    public static void main(String[] args) {
        
        double arrayA50[];
        double arrayB20[];
        
        arrayA50= new double[50];
        
        
        for(int i=0;i< arrayA50.length;i++){
            arrayA50[i]=(Math.random()*20 +1);
        }
    
         for(int i=0;i< arrayA50.length;i++){
             System.out.println("|"+arrayA50[i]+"|");
        }
        
       Arrays.sort(arrayA50);
        System.out.println(" ");
        System.out.println("ARRAY ORDENADO"); 
        for(int i=0;i< arrayA50.length;i++){
             System.out.println("|"+arrayA50[i]+"|");
        }
       
        
        arrayB20 = Arrays.copyOfRange(arrayA50, 0, 20);                   
        Arrays.fill(arrayB20, 10, 20, 0.5);       
        
        System.out.println(" ARRAY 2");
        
         for(int i=0;i< 20;i++){
             System.out.println("|"+arrayB20[i]+"|");
        }
       
        
    }
    
    
    
    
}

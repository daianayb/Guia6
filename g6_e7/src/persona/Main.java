
package persona;


public class Main {

  
    public static void main(String[] args) {
        // creacion de los 4 objetos
        Persona persona1=new Persona();
        Persona persona2=new Persona();
        Persona persona3=new Persona();
        Persona persona4=new Persona();
        
     
      int contadorMayor=0,contadorMenor=0;
      int contadorDebajoPeso=0,contadorPesoIdeal=0,contadorSobrepeso=0;
      
      int resultsIMC[];
      boolean resultsAge[];
      
      resultsIMC =new int [4];
      resultsAge=new boolean [4];
      
      
        persona1.crearPersona();
        persona2.crearPersona();
        persona3.crearPersona();
        persona4.crearPersona();
           
     
        
        resultsIMC[0]=persona1.calcularIMC();
        resultsIMC[1]=persona2.calcularIMC();
        resultsIMC[2]=persona3.calcularIMC();
        resultsIMC[3]=persona4.calcularIMC();
        
        resultsAge[0]=persona1.esMayorDeEdad();
        resultsAge[1]=persona2.esMayorDeEdad();
        resultsAge[2]=persona3.esMayorDeEdad();
        resultsAge[3]=persona4.esMayorDeEdad();
        
        System.out.println("*********************************");
        for(int i=0;i<4;i++){
            if(resultsAge[i]){
               System.out.println("La persona "+(i+1)+" es mayor de edad");
               contadorMayor++;
            }else {
                System.out.println("La persona "+(i+1)+" es menor de edad");
                contadorMenor++;
            }
            
        }
        

       System.out.println("*********************************"); 
        System.out.println("El porcentaje de mayores de edad es:"+((contadorMayor*100)/4)+"%");
        System.out.println("El porcentaje de mmenores de edad es:"+((contadorMenor*100)/4)+"%");
        System.out.println("*********************************");
         for(int i=0;i<4;i++){
            switch (resultsIMC[i]) {
                case -1:
                    System.out.println("La persona "+(i+1)+" esta por debajo de su peso ideal");
                    contadorDebajoPeso++;
                    break;
                case 0:
                    System.out.println("La persona "+(i+1)+" esta en su peso ideal");
                    contadorPesoIdeal++;
                    break;
                default:
                    System.out.println("La persona "+(i+1)+" tiene sobrepeso");
                    contadorSobrepeso++;
                    break;
            }
            
        }
        System.out.println("*********************************");
        System.out.println("Porcentaje de personas que estan por debajo de su peso ideal:"+(contadorDebajoPeso*100)/4+"%");
        System.out.println("Porcentaje de personas que estan en su peso ideal:"+(contadorPesoIdeal*100)/4+"%");
        System.out.println("Porcentaje de personas que tienen sobrepeso :"+(contadorSobrepeso*100)/4+"%");
        
        System.out.println("*********************************");
    }
    
      
    
}

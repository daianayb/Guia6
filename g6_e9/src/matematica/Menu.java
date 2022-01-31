
package matematica;


public class Menu {

  
    public static void main(String[] args) {
       
        Matematica nuevosNum=new Matematica();
        
        nuevosNum.setNumero1(Math.random()*20 +1);
        nuevosNum.setNumero2(Math.random()*20+1);
        
        System.out.println("************************");
        System.out.println("El numero mayor es: "+nuevosNum.devolverMayor());
        System.out.println("************************");
        nuevosNum.calcularPotencia();
        System.out.println("************************");
        nuevosNum.calcularRaiz();
        System.out.println("************************");
        
    }
    
}

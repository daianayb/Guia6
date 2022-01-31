
package operation;


public class Menu {

   
    public static void main(String[] args) {
        
        Operacion operacion1=new Operacion();
        
       operacion1.crearOperacion();
       
        System.out.println("SUMA:");
        System.out.println(operacion1.getNumero1()+" + "+operacion1.getNumero2()+" = "+operacion1.sumar());
        System.out.println("RESTA:");
        System.out.println(operacion1.getNumero1()+" - "+operacion1.getNumero2()+" = "+operacion1.restar());
        System.out.println("MULTIPLICACION:");
        System.out.println(operacion1.getNumero1()+" * "+operacion1.getNumero2()+" = "+operacion1.multiplicar());
        System.out.println("DIVISION:");
        System.out.println(operacion1.getNumero1()+" / "+operacion1.getNumero2()+" = "+operacion1.dividir());
        
        
    }
    
}

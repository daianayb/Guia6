package persona;


import java.util.Locale;
import java.util.Scanner;


public class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearPersona(){   
        int cont=0;
        Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese su nombre");
        this.nombre=leer.next();
        System.out.println("Ingrese su edad");
        this.edad=leer.nextInt();
        do{
            if(cont >0){
                 System.out.println("Ingrese correctamente");
             }  
             System.out.println("Ingrese su sexo ");
             System.out.println("H- Hombre .  M- Mujer .  O- Otro");
             this.sexo=leer.next().charAt(0);   
             cont++;
                 
        }while(this.sexo != 'H' && this.sexo != 'M' && this.sexo != 'O' );
       
        System.out.println("Ingrese su peso");
        this.peso=leer.nextDouble();
        System.out.println("Ingrese su altura");
        this.altura=leer.nextDouble();
    }
    
    public int calcularIMC(){
        double calculo;
        calculo=(this.peso/Math.pow(this.altura,2));
        if(calculo < 20){
            return -1;
        }else if(calculo >=20 && calculo<=25){
            return 0;
        }else{
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(){
        return this.edad>=18;
    }
    
}

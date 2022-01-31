
package cuentabancaria;

import java.util.Locale;
import java.util.Scanner;


public class Cuenta {
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public void crearCuenta(){
         Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
         System.out.println("Ingrese su numero de cuenta");
         this.numeroCuenta=leer.nextInt();
         System.out.println("Ingrese su DNI");
         this.dniCliente=leer.nextLong();
         this.saldoActual=0; //saldo actual en 0 , tiene que recargar..
         System.out.println("Actualmente no posee saldo , debera recargar");
    }
    
    public void ingresar(double ingreso){
        this.saldoActual+=ingreso;
    }
    
    public void retirar(double retiro){
        if(this.saldoActual >= retiro){
            this.saldoActual-=retiro;
        }else{
            this.saldoActual=0;
        }
    }
    
    public void extraccionRapida(){
        double retiro;
         Scanner leer=new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
         System.out.println("Ingrese el monto a retirar");
         retiro=leer.nextDouble();
         if(retiro <= (this.saldoActual*0.2)){
             System.out.println("Retirando...");
             this.saldoActual-=retiro;
         }else{
             System.out.println("No debe retirar mas del %20");
         }
    }
    
    
    public void consultarSaldo(){
        System.out.println("Su saldo disponible en la cuenta es: $"+saldoActual);
    }
    
    public void consultarDatos(){
        System.out.println("Sus datos de la cuenta:");
        System.out.println("Numero de Cuenta: "+numeroCuenta);
        System.out.println("DNI: "+dniCliente);
        System.out.println("Saldo actual: $"+saldoActual);
    }
    
}

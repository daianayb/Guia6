
package cadenas;


public class Cadena {
    
    private String frase;
    private int longitudFrase;

    public Cadena() {
    }

    public Cadena(String frase, int longitudFrase) {
        this.frase = frase;
        this.longitudFrase = longitudFrase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitudFrase() {
        return longitudFrase;
    }

    public void setLongitudFrase(int longitudFrase) {
        this.longitudFrase = longitudFrase;
    }
    
    
    public void mostrarVocales(){
        int contadorVocales=0;
        for(int i=0;i<this.frase.length();i++){
            switch (this.frase.charAt(i)){
                case 'A' :                   
                case 'a' :                    
                case 'E' :             
                case 'e' :      
                case 'I' :
                case 'i' :
                case 'O' :
                case 'o' :
                case 'U':
                case 'u':
                         contadorVocales++;
                         break;
                    
            }
        }
        
        System.out.println("La frase ingresada tiene: "+contadorVocales+" vocales");
  
    
    
    }
   
   public void  vecesRepetido(String letra){
       int contLetra=0;
       
       for(int i=0;i<this.frase.length();i++){
          
           if(String.valueOf(this.frase.charAt(i)).equals(letra) ){
               contLetra++;
           } 
       }
       
       System.out.println("El caracter se repite "+contLetra+" veces");
       
   }
   
   
   public void compararLongitud(String frase){
   
       if (this.frase.compareTo(frase) == 0){
            System.out.println("Las cadenas tienen la misma longitud");
       }else if (this.frase.compareTo(frase) < 0){
           System.out.println("La primer cadena es menor");
       }else{
           System.out.println("La primer cadena es mayor");
       }
      
   }
   
   public void unirFrases(String frase){
     this.frase=this.frase.concat(frase);
       System.out.println("La frase resultante de la concatenacion es: "+this.frase);
   }
   
   
   public void reemplazar(String letra){
       this.frase=this.frase.replace("a",letra);
       System.out.println("Frase resultante con el reemplazo:");
       System.out.println(this.frase);
   }
   
   public boolean contiene(String letra){
       boolean resultado;
       
       resultado=this.frase.contains(letra);
       
       return resultado;
   }
   
   public void invertirFrase(){
        for (int i = longitudFrase - 1; i >= 0; i--) {
            System.out.print(frase.charAt(i));

        }
        System.out.println(" ");
   }
   
}



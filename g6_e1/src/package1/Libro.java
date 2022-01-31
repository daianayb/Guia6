
package package1;


public class Libro {
    
  // ATRIBUTOS
    private int isbn;
    private String titulo;
    private String autor;
    private int numPag;
  
//Constructor vacío  
    public Libro(){
        
    }
    
    public Libro(int isbn, String titulo,String autor,int numPag){
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.numPag=numPag;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag =numPag;
    }
    
    public void Carga(int isbn, String titulo,String autor,int numPag){
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.numPag=numPag;
    }
    
    public void Informe(){
        System.out.println("El numero de ISBN es: "+isbn);
        System.out.println("El titulo es: "+titulo);
        System.out.println("El autor es: "+autor);
        System.out.println("El numero de paginas es: "+numPag);
    }
    
}

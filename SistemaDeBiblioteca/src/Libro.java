public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean prestado;

    public Libro(String titulo, String autor, String isnb) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isnb;
        this.prestado = false;
    }
    //Metodos

    //Metodo que cambia el estado de no prestado a prestado
    public void prestar() {
        prestado = true;
    }

    //Metodon que cambia el estado de prestado a no prestado
    public void devolver() {
        prestado = false;
    }
    
    //Metodo para mostrar los atributos de la clase 
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Estado: " + (prestado ? "Prestado" : "Disponible");
    }
    
    //Setters y Getters
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
}

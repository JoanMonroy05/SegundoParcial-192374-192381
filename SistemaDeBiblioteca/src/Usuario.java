import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private final int LIMITE_LIBROS = 3; //Declaramos como constate la catidad de libros que un usuario puede tener
    private String nombre;
    private int ID;
    private List<Libro> cantLibros = new ArrayList<>();

    public Usuario(String nombre, int ID) {
        this.nombre = nombre;
        this.ID = ID;
    }

    //Metodo para pedir prestado los libros verifica que no se hayan buscados mas de los que debería
    public boolean prestarLibro(Libro libro){
        if (cantLibros.size() >= LIMITE_LIBROS) {
            System.out.println("Haz alcanzado el límite de libros prestados.");
            return false;
        } else if (libro.isPrestado()) {
            System.out.println("El libro ya esta prestado");
            return false;
        } else {
            cantLibros.add(libro);
            libro.prestar();
            System.out.println("Libro '" + libro.getTitulo() + "' prestado con éxito.");
            return true;
        } 
    }

    //Metodo para devolver los libros
    public boolean devolverLibro(Libro libro){
        if (cantLibros.contains(libro)) {
            cantLibros.remove(libro);
            libro.devolver();
            System.out.println("Libro " + libro.getTitulo() + " devuelto con éxito.");
            return true;
        } else {
            System.out.println("El libro no pertenece a tus préstamos.");
            return false;
        }
    }

    //Metodo para recorrer la collecion que gurda los libros
    public void mostrarLibrosPrestados(){
        if (cantLibros.isEmpty()) {
            System.out.println("No tienes libros prestados.");
        } else {
            System.out.println("Libros prestados:");
            for (Libro libro : cantLibros) {
                System.out.println("- " + libro);
            }
        }
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public List<Libro> getCantLibros() {
        return cantLibros;
    }

    public void setCantLibros(List<Libro> cantLibros) {
        this.cantLibros = cantLibros;
    }
}

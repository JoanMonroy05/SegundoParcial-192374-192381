import java.util.ArrayList;
import java.util.List;

public class GestionBiblioteca {

    private List<Libro> libros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<String> historialPrestamos = new ArrayList<>();

    public GestionBiblioteca() {
        this.historialPrestamos = new ArrayList<>();
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    //Metodos

    //Metodo para agregar a la arrayList los libros que hallan
    public void registrarLibro(Libro libro){
        libros.add(libro);
    }

    //Metodo para agregar a la ArrayList los usuarios que se registren
    public void registrarUsuario(Usuario usuario){
        usuarios.add(usuario);
        System.out.println("Usuario registrado de manera correcta");
    }

    //Metodo que recorre la array donde se guardan los libros
    public void mostrarLibrosDisponibles(){
        System.out.println("Libros disponibles:");
        for (Libro libro : libros) {
            if (!libro.isPrestado()) {
                System.out.println("- " + libro.toString());
            }
        }
    }


    //Metodo que busca en la ArrayList el libro por su isnb
    public Libro buscar(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    //Metodo sobrecargado que busca en la ArrayList el usuario por id
    public Usuario buscar(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getID() == id) {
                return usuario;
            }
        }
        return null;
    }

    //Metodo para prestar libro 
    public void prestarLibro(int idUsuario, String isbn){
        Usuario usuario = buscar(idUsuario);
        Libro libro = buscar(isbn);

        if (usuario != null && libro != null) {
            if (usuario.prestarLibro(libro)) {
                historialPrestamos.add("Usuario: " + usuario.getNombre() + " prestó '" + libro.getTitulo() + "'");
            }

        } else {
            System.out.println("Usuario o libro no encontrado.");
        }
    }

    //Metodo de devolver libro
    public void devolverLibro(int idUsuario, String isbn){
        Usuario usuario = buscar(idUsuario);
        Libro libro = buscar(isbn);

        if (usuario != null && libro != null) {
            if (usuario.devolverLibro(libro)) {
                historialPrestamos.add("Usuario: " + usuario.getNombre() + " devolvió '" + libro.getTitulo() + "'");
            }

        } else {
            System.out.println("Usuario o libro no encontrado.");
        }
    }

    //Recorre el arrayList y muestra el historial
    public void mostrarHistorialPrestamos(){
        for (String registro : historialPrestamos) {
            System.out.println(registro);
        }
    }
}
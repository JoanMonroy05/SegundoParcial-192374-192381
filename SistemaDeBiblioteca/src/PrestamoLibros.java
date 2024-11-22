public class PrestamoLibros {
    public static void main(String[] args) throws Exception {

        //Creamos un objeto de la clase GestionBiblioteca
        GestionBiblioteca gestion = new GestionBiblioteca();

        //Creamos un objetos de la clase libro y lo guardamos en una ArrayList
        gestion.registrarLibro(new Libro("Cálculo", "James Stewart", "978-1-305"));
        gestion.registrarLibro(new Libro("Física", "Raymond Serway", "978-1-337"));

        //Creamos un objetos de la clase usuario y lo guardamos en una ArrayList
        System.out.println("Creamos los usuarios:");
        gestion.registrarUsuario(new Usuario("Joan Monroy", 192374));
        gestion.registrarUsuario(new Usuario("Daniel Adolfo", 192381));

        //Llamamos el metodo mostrar libros y asi verificamos la disponibilidad
        System.out.println("\nLibros disponibles:");
        gestion.mostrarLibrosDisponibles();

        //Llamamos el metodo prestarLibro
        System.out.println("\nPedimos prestado un  libro: ");
        gestion.prestarLibro(192374, "978-1-305");
        System.out.println("\nPedimos prestado el mismo libro: ");
        gestion.prestarLibro(192381, "978-1-305");

        //Llamamos el metodo devolverLibro
        System.out.println("\nDevolvemos un libro que no hemos buscado prestado: ");
        gestion.devolverLibro(192381, "978-1-337");
        System.out.println("\nDevolvemos un libro:");
        gestion.devolverLibro(192374, "978-1-305");
    }
}

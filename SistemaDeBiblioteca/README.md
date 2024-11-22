La biblioteca de la universidad necesita un sistema para prestar libros. Se requiere:

1. Una **clase `Libro`** con atributos como título, autor, ISBN, estado (disponible o prestado).
    - Métodos:
        - `prestar()`: Cambia el estado del libro a prestado.
        - `devolver()`: Cambia el estado del libro a disponible.
2. Una **clase `Usuario`** con atributos como nombre, ID y libros prestados.
    - Métodos:
        - `prestarLibro(Libro libro)`: Permite al usuario tomar un libro prestado.
        - `devolverLibro(Libro libro)`: Permite devolver un libro.
3. Una **clase `GestionBiblioteca`** que permita:
    - Registrar libros y usuarios.
    - Verificar la disponibilidad de libros.
    - Mostrar el historial de préstamos.

**Reto:** Implementar el sistema con métodos para verificar que un usuario no tome más libros de los permitidos.

## Documentacion:

Sistema de Biblioteca:
- Libro:
    Se crean tres metodos: prestar, devolver y toString. Tambien se crean los Setters y Getters
- Usuario:
    Se crean los metodos: prestarLibro, devolverLibro y mostrarLibrosPrestados. Tambien se crean los Setters y Getters.
- Gestion de Biblioteca:
    Se crean los metodos: registrarLibro, registrarUsuario, mostrarLibrosDisponible, buscar, prestarLibro, devolverLibro y mostrarHistorialPrestamos. Tambien se crean los Setters y Getters
- Prestamo Libro (main):
    Creamos un objeto de la clase GestionBiblioteca.
    Creamos un objeto de la clase Libro y lo guardamos en una ArrayList.
    Creamos un objeto de la clase Usuario y lo guardamos en una ArrayList.
    Llamamos al metodo mostraLibros y asi verificamos la disponibilidad.
    Llamamos al metodo prestarLibro.
    Llamamos al metodo devolverLibro.
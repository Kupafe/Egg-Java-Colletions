/*
EJERCICIO LISTA LIBROS
¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno con un bucle.
 */
package Entidades;

public class Libro {
    
    public long isbn;
    public String titulo;
    public String Autor;
    public int numeroPaginas;

    public Libro() {
    }

    public Libro(long isbn, String titulo, String Autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.Autor = Autor;
        this.numeroPaginas = numeroPaginas;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", Autor=" + Autor + ", numeroPaginas=" + numeroPaginas + '}';
    }
}

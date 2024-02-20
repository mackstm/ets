package es.iespuerto.ets.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibroTest {

    private String isbn = "isbn234";
    private String titulo = "nombre";
    private String autor = "autor";
    private String fPublicacion = "2024-02-20";

    Libro libro;

    @BeforeEach
    public void beforeEach() {
        libro = new Libro(isbn, titulo, autor, fPublicacion);
    }

    @Test
    public void libroVacioNotNullTest() {
        Libro libroVacio = new Libro();
        Assertions.assertNotNull(libroVacio, "No puede ser nulo");
    }

    @Test
    public void libroNotNullTest() {
        Assertions.assertNotNull(libro, "No puede ser nulo");
    }

    @Test
    public void libroGetSetTest() {
        String tituloUpdate = "otro nombre";
        String fPublicacionUpdate = "2024-02-21";
        String autorUpdate = "autorUpdate";
        libro.setTitulo(tituloUpdate);
        libro.setAutor(autorUpdate);
        libro.setfPublicacion(fPublicacionUpdate);
        Assertions.assertEquals(isbn, libro.getIsbn(), "Resultado no esperado");
        Assertions.assertEquals(tituloUpdate, libro.getTitulo(), "Resultado no esperado");
        Assertions.assertEquals(autorUpdate, libro.getAutor(), "Resultado no esperado");
        Assertions.assertEquals(fPublicacionUpdate, libro.getfPublicacion(), "Resultado no esperado");
    }

    @Test
    public void toStringTest() {
        Assertions.assertTrue(libro.toString().contains(isbn), "Resultado no esperado");
        Assertions.assertTrue(libro.toString().contains(titulo), "Resultado no esperado");
        Assertions.assertTrue(libro.toString().contains(autor), "Resultado no esperado");
        Assertions.assertTrue(libro.toString().contains(fPublicacion), "Resultado no esperado");
    }
}

package es.iespuerto.ets.negocio;

import es.iespuerto.ets.modelo.Libro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaNegocioTest {
    private int id = 1;
    private String nombre = "No";
    private String direccion = "dir";
    BibliotecaNegocio bibliotecaNegocio;

    Libro libro;
    @BeforeEach
    public void beforeEach() {
        bibliotecaNegocio = new BibliotecaNegocio(id, nombre, direccion);
        libro = new Libro(nombre, nombre, nombre, nombre);
        bibliotecaNegocio.addLibro(libro);
    }

    @Test
    public void bibliotecaNegocioNotNull() {
        Assertions.assertNotNull(bibliotecaNegocio, "El objeto no puede ser nulo");
        Assertions.assertNotNull(bibliotecaNegocio.obtenerLibros(), "La lista no puede ser nula");
    }

    @Test
    public void addLibroTest() {
        Assertions.assertEquals(1, bibliotecaNegocio.obtenerLibros().size(), "Resultado no esperado");
    }

    @Test
    public void addDupeLibroTest() {
        bibliotecaNegocio.addLibro(libro);
        Assertions.assertEquals(1, bibliotecaNegocio.obtenerLibros().size(), "Resultado no esperado");
    }

    @Test
    public void obtenerLibroTest() {
        Libro libroBuscar = new Libro(nombre);
        Assertions.assertEquals(libro, bibliotecaNegocio.obtenerLibro(libroBuscar), "Resultado no esperado");
    }

    @Test
    public void obtenerLibroNoExisteTest() {
        Libro libroBuscar = new Libro("232323");
        Assertions.assertNull(bibliotecaNegocio.obtenerLibro(libroBuscar), "Resultado no esperado");
    }

    @Test
    public void eliminarLibroTest() {
        Libro libroEliminar = new Libro(nombre);
        bibliotecaNegocio.eliminarLibro(libroEliminar);
        Assertions.assertEquals(0, bibliotecaNegocio.obtenerLibros().size(),
                "Resultado no esperado");
    }

    @Test
    public void actualizarLibroTest() {
        String otroTitulo = "Abuacate";
        libro.setTitulo(otroTitulo);
        Assertions.assertTrue(bibliotecaNegocio.actualizarLibro(libro), "Resultado no esperado");
        Libro libroBuscar = new Libro(nombre);
        libroBuscar = bibliotecaNegocio.obtenerLibro(libroBuscar);
        Assertions.assertEquals(otroTitulo, libroBuscar.getTitulo(), "No se ha obtenido el texto esperado");
    }
}

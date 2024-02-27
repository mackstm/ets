package es.iespuerto.ets.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
    private int id = 1;
    private String nombre = "nombre";
    private String direccion = "mi casa";

    Biblioteca biblioteca;

    @BeforeEach
    public void beforeEach() {
        biblioteca = new Biblioteca(id, nombre, direccion);
    }

    @Test
    public void bibliotecaNotNullTest() {
        Assertions.assertNotNull(biblioteca, "El objeto no puede ser nulo");
    }

    @Test
    public void bibliotecaGetSetTest() {
        String otroNombre = "otro nombre";
        String otraDireccion = "otra direccion";
        biblioteca.setNombre(otroNombre);
        biblioteca.setDireccion(otraDireccion);
        Assertions.assertEquals(otroNombre, biblioteca.getNombre(), "Resultado no esperado");
        Assertions.assertEquals(otraDireccion, biblioteca.getDireccion(), "Resultado no esperado");
        Assertions.assertEquals(id, biblioteca.getId(), "Resultado no esperado");
    }

    @Test
    public void bibliotecaEqualsTest() {
        Assertions.assertEquals(biblioteca, biblioteca, "Resultado inesperado");
        Biblioteca bibliotecaEquals = new Biblioteca(id);
        Assertions.assertEquals(bibliotecaEquals, biblioteca, "Resultado inesperado");
    }

    @Test
    public void bibliotecaToStringTest() {
        Assertions.assertTrue(biblioteca.toString().contains(String.valueOf(id)), "Resultado no esperado");
        Assertions.assertTrue(biblioteca.toString().contains(nombre), "Resultado no esperado");
        Assertions.assertTrue(biblioteca.toString().contains(direccion), "Resultado no esperado");
    }
}

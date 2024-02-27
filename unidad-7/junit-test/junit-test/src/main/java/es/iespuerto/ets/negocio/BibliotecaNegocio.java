package es.iespuerto.ets.negocio;

import es.iespuerto.ets.modelo.Biblioteca;
import es.iespuerto.ets.modelo.Libro;

import java.util.List;

public class BibliotecaNegocio {
    private Biblioteca biblioteca;

    public BibliotecaNegocio() {}

    public BibliotecaNegocio(int id) {
        biblioteca = new Biblioteca(id);
    }

    public BibliotecaNegocio(int id, String nombre, String direccion) {
        biblioteca = new Biblioteca(id, nombre, direccion);
    }

    public List<Libro> obtenerLibros() {
        return biblioteca.getLibros();
    }

    public Libro obtenerLibro(Libro libro) {
        int posicion = biblioteca.getLibros().indexOf(libro);
        if (posicion >= 0) {
            return biblioteca.getLibros().get(posicion);
        }
        return null;
    }

    public boolean addLibro(Libro libro) {
        if (existeLibro(libro)) {
            return true;
        }
        return biblioteca.getLibros().add(libro);
    }

    public boolean eliminarLibro(Libro libro) {
        if (!existeLibro(libro)) {
            return true;
        }
        return biblioteca.getLibros().remove(libro);
    }

    public boolean actualizarLibro(Libro libro) {
        if (existeLibro(libro)) {
            int posicion = biblioteca.getLibros().indexOf(libro);
            biblioteca.getLibros().add(posicion, libro);
            return false;
        }
        return true;
    }

    public boolean existeLibro(Libro libro) {
        return biblioteca.getLibros().contains(libro);
    }
}

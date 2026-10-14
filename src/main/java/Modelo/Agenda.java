/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class Agenda {
    private ArrayList<Contacto> listaContactos;

    public Agenda() {
        this.listaContactos = new ArrayList<>();
    }

    /**
      Guarda un nuevo contacto en la agenda.
      Retorna true si se guardó con éxito; false si el contacto ya existía o es inválido.
     */
    public boolean guardarContacto(Contacto c) {
        if (c == null) {
            return false;
        }
        if (c.getNombre() == null || c.getNombre().trim().isEmpty()) {
            return false;
        }
        if (c.getTelefono() == null || c.getTelefono().trim().isEmpty()) {
            return false;
        }

        // Validar que no se duplique por nombre (ignorando mayúsculas/minúsculas)
        if (existeContacto(c.getNombre())) {
            return false;
        }

        return this.listaContactos.add(c);
    }

    /**
      Busca el teléfono de un contacto dado su nombre.
     */
    public String buscarTelefonoPorNombre(String nombreBuscado) {
        if (nombreBuscado == null || nombreBuscado.trim().isEmpty()) {
            return null;
        }

        for (Contacto c : this.listaContactos) {
            if (c != null && c.getNombre().equalsIgnoreCase(nombreBuscado.trim())) {
                return c.getTelefono();
            }
        }
        return null;
    }

    /**
      Verifica si un contacto ya existe registrado en la agenda.
     */
    public boolean existeContacto(String nombre) {
        if (nombre == null) return false;
        for (Contacto c : this.listaContactos) {
            if (c != null && c.getNombre().equalsIgnoreCase(nombre.trim())) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Contacto> getListaContactos() {
        return listaContactos;
    }

    public int getCantidadContactos() {
        return this.listaContactos.size();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.Agenda;
import Modelo.Contacto;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ControladorAgenda {
    private Agenda agenda;

    public ControladorAgenda() {
        this.agenda = new Agenda();
    }

    public ControladorAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    /**
     * Crea el objeto Contacto y delega su guardado en la Agenda.
     * Retorna true si se guardó con éxito, o false si no fue posible (ej. campos vacíos o duplicado).
     */
    public boolean agregarContacto(String nombre, String telefono) {
        Contacto nuevo = new Contacto(nombre, telefono);
        return agenda.guardarContacto(nuevo);
    }

    /**
     * Consulta el teléfono de un contacto a través del método de la Agenda.
     * Retorna el número de teléfono o null si no existe.
     */
    public String buscarTelefono(String nombre) {
        return agenda.buscarTelefonoPorNombre(nombre);
    }

    /**
     * Retorna la lista completa de contactos almacenados en la Agenda.
     */
    public ArrayList<Contacto> getListaContactos() {
        return agenda.getListaContactos();
    }

    /**
     * Retorna la cantidad total de contactos registrados.
     */
    public int getCantidadContactos() {
        return agenda.getCantidadContactos();
    }

    public Agenda getAgenda() {
        return agenda;
    }
}
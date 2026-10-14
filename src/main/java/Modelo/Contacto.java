/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Contacto to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Contacto {
    private String nombre;
    private String telefono;

    public Contacto() {
        this.nombre = "";
        this.telefono = "";
    }

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre != null ? nombre.trim() : "";
        this.telefono = telefono != null ? telefono.trim() : "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre != null ? nombre.trim() : "";
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono != null ? telefono.trim() : "";
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre='" + nombre + '\'' + ", telefono='" + telefono + '\'' + '}';
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */


public class ContactoTest {

    @Test
    public void testConstructorVacioYGetters() {
        Contacto contacto = new Contacto();
        assertEquals("", contacto.getNombre());
        assertEquals("", contacto.getTelefono());
    }

    @Test
    public void testConstructorConParametros() {
        Contacto contacto = new Contacto("Carlos Gómez", "3001234567");
        assertEquals("Carlos Gómez", contacto.getNombre());
        assertEquals("3001234567", contacto.getTelefono());
    }

    @Test
    public void testConstructorConValoresNulos() {
        Contacto contacto = new Contacto(null, null);
        assertEquals("", contacto.getNombre());
        assertEquals("", contacto.getTelefono());
    }

    @Test
    public void testSetNombreYSetTelefono() {
        Contacto contacto = new Contacto();
        contacto.setNombre("Ana Ruiz");
        contacto.setTelefono("3119876543");

        assertEquals("Ana Ruiz", contacto.getNombre());
        assertEquals("3119876543", contacto.getTelefono());
    }

    @Test
    public void testToString() {
        Contacto contacto = new Contacto("Juan", "12345");
        String esperado = "Contacto{nombre='Juan', telefono='12345'}";
        assertEquals(esperado, contacto.toString());
    }
}

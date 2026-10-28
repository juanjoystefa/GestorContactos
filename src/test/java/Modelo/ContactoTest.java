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

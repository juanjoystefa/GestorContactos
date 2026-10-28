/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class AgendaTest {

    @Test
    public void testGuardarContactoExitoso() {
        Agenda agenda = new Agenda();
        Contacto contacto = new Contacto("Maria Lopez", "3123456789");

        boolean resultado = agenda.guardarContacto(contacto);

        assertTrue(resultado);
        assertEquals(1, agenda.getCantidadContactos());
    }

    @Test
    public void testGuardarContactoDuplicado() {
        Agenda agenda = new Agenda();
        agenda.guardarContacto(new Contacto("Maria Lopez", "3123456789"));

        // Intento guardar otro con el mismo nombre (sin importar mayúsculas/minúsculas)
        boolean duplicado = agenda.guardarContacto(new Contacto("maria lopez", "3000000000"));

        assertFalse(duplicado);
        assertEquals(1, agenda.getCantidadContactos());
    }

    @Test
    public void testGuardarContactoInvalido() {
        Agenda agenda = new Agenda();

        assertFalse(agenda.guardarContacto(null));
        assertFalse(agenda.guardarContacto(new Contacto("", "12345")));
        assertFalse(agenda.guardarContacto(new Contacto("Pedro", "")));
        assertEquals(0, agenda.getCantidadContactos());
    }

    @Test
    public void testBuscarTelefonoPorNombreExistente() {
        Agenda agenda = new Agenda();
        agenda.guardarContacto(new Contacto("Luisa Perez", "3155555555"));

        String telefono = agenda.buscarTelefonoPorNombre("Luisa Perez");

        assertEquals("3155555555", telefono);
    }

    @Test
    public void testBuscarTelefonoPorNombreInexistente() {
        Agenda agenda = new Agenda();
        agenda.guardarContacto(new Contacto("Luisa Perez", "3155555555"));

        String telefono = agenda.buscarTelefonoPorNombre("Mario Bros");

        assertNull(telefono);
    }

    @Test
    public void testExisteContacto() {
        Agenda agenda = new Agenda();
        agenda.guardarContacto(new Contacto("David", "3001112233"));

        assertTrue(agenda.existeContacto("David"));
        assertTrue(agenda.existeContacto("david")); // Comprueba case-insensitive
        assertFalse(agenda.existeContacto("Sofia"));
        assertFalse(agenda.existeContacto(null));
    }

    @Test
    public void testGetListaContactos() {
        Agenda agenda = new Agenda();
        agenda.guardarContacto(new Contacto("Contacto 1", "111"));
        agenda.guardarContacto(new Contacto("Contacto 2", "222"));

        ArrayList<Contacto> lista = agenda.getListaContactos();

        assertNotNull(lista);
        assertEquals(2, lista.size());
    }

    @Test
    public void testGetCantidadContactos() {
        Agenda agenda = new Agenda();
        assertEquals(0, agenda.getCantidadContactos());

        agenda.guardarContacto(new Contacto("Test", "123"));
        assertEquals(1, agenda.getCantidadContactos());
    }
}
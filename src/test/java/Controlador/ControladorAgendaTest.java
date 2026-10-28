/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Agenda;
import Modelo.Contacto;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class ControladorAgendaTest {

    @Test
    public void testAgregarContacto() {
        ControladorAgenda controlador = new ControladorAgenda();

        boolean guardado = controlador.agregarContacto("Andres", "3201234567");

        assertTrue(guardado);
        assertEquals(1, controlador.getCantidadContactos());
    }

    @Test
    public void testBuscarTelefono() {
        ControladorAgenda controlador = new ControladorAgenda();
        controlador.agregarContacto("Diana", "3178889900");

        String telefonoEncontrado = controlador.buscarTelefono("Diana");
        String noExiste = controlador.buscarTelefono("Felipe");

        assertEquals("3178889900", telefonoEncontrado);
        assertNull(noExiste);
    }

    @Test
    public void testGetListaContactos() {
        ControladorAgenda controlador = new ControladorAgenda();
        controlador.agregarContacto("Persona A", "100");

        ArrayList<Contacto> lista = controlador.getListaContactos();

        assertNotNull(lista);
        assertEquals(1, lista.size());
        assertEquals("Persona A", lista.get(0).getNombre());
    }

    @Test
    public void testGetCantidadContactos() {
        ControladorAgenda controlador = new ControladorAgenda();
        assertEquals(0, controlador.getCantidadContactos());

        controlador.agregarContacto("Uno", "111");
        controlador.agregarContacto("Dos", "222");

        assertEquals(2, controlador.getCantidadContactos());
    }

    @Test
    public void testGetAgendaYConstructorConParametro() {
        Agenda agendaPropia = new Agenda();
        ControladorAgenda controlador = new ControladorAgenda(agendaPropia);

        assertSame(agendaPropia, controlador.getAgenda());
    }
}

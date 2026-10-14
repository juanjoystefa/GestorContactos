/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;
import Modelo.Agenda;
import Modelo.Contacto;
import Vista.VistaAgenda;
import Controlador.ControladorAgenda;
/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {
        // Ejecución en el hilo de eventos de Swing
        javax.swing.SwingUtilities.invokeLater(() -> {
            Agenda modelo = new Agenda();
            VistaAgenda vista = new VistaAgenda();
            ControladorAgenda controlador = new ControladorAgenda(modelo, vista);
            controlador.iniciar();
        });
}

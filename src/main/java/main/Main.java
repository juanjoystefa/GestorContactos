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
        javax.swing.SwingUtilities.invokeLater(() -> {
            VistaAgenda vista = new VistaAgenda();
            vista.setVisible(true);
        });
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Usuario
 */
import Modelo.Agenda;
import Modelo.contacto;

public class controladorAgenda {

    private final Agenda agenda;

    public controladorAgenda() {
        this.agenda = new Agenda();
    }

    public void guardarContacto(String nombre, String telefono) {
        contacto contacto = new contacto(nombre.trim(), telefono.trim());
        agenda.guardarContacto(contacto);
    }

    public String buscarTelefono(String nombre) {
        return agenda.buscarTelefono(nombre.trim());
    }
}

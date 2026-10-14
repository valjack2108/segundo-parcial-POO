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
public class agenda {
    
    private ArrayList<contacto> contactos;

    public agenda() {
        this.contactos = new ArrayList<>();
    }

    public ArrayList<contacto> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<contacto> contactos) {
        this.contactos = contactos;
    }

    public void guardarContacto(contacto contacto) {
        contactos.add(contacto);
    }

    public String buscarTelefono(String nombre) {
        for (contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return contacto.getTelefono();
            }
        }
        return null;
    }
    
}

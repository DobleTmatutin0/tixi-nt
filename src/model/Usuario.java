package model;

import model.enumeration.RolUsuario;

public class Usuario {
    private String nombre;
    private String telefono;
    private String email;
    private Cliente cliente;


    // ############################
    // Getters
    // ############################

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    // ############################
    // Setters
    // ############################

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    private void setEmail(String email) {
        this.email = email;
    }

    public void altaConductor(String licencia, Vehiculo vehiculo) {

    }

    public void cambiarRolActivo(RolUsuario rolNuevo) {

    }

    private class Cliente {
        public boolean enViaje {

        }

        public void agregarViaje(Viaje viaje) {

        } 
    
    }

    private class Conductor {
        private String licenciaConducir;

        public void agregarVehiculo(Vehiculo vehiculo) {
            
        }
    }
}

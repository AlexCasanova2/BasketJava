
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Equipo {
    private String nombre;
    private String ciudad;
    private LocalDate creacion;


    public Equipo() {
    }
    

    public Equipo(String nombre, String ciudad, LocalDate creacion) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.creacion = creacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public LocalDate getCreacion() {
        return creacion;
    }

    public void setCreacion(LocalDate creacion) {
        this.creacion = creacion;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", creacion=" + creacion + '}';
    }
    
    
}



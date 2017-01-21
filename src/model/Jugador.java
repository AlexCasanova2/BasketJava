
package model;

import java.time.LocalDate;
import java.util.Date;


public class Jugador {
    private int id;
    private String nombre;
    private LocalDate nacimiento;
    private int canastas;
    private int asistencias;
    private int rebotes;
    private String posicion;
    private String equipo;
    // Jugador tiene un equipo
    
     private static int contador = 0;

    public Jugador(int id, String nombre,LocalDate nacimiento, int canastas, int asistencias, int rebotes, String posicion, String equipo) {
        this.id = id;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.canastas = canastas;
        this.asistencias = asistencias;
        this.rebotes = rebotes;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    public Jugador() {
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }


    public int getRebotes() {
        return rebotes;
    }

    public void setRebotes(int rebotes) {
        this.rebotes = rebotes;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }


    public int getCanastas() {
        return canastas;
    }

    public void setCanastas(int canastas) {
        this.canastas = canastas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", nacimiento=" + nacimiento + ", canastas=" + canastas + ", asistencias=" + asistencias + ", rebotes=" + rebotes + ", posicion=" + posicion + ", equipo=" + equipo + '}';
    }
    
    
    
    
    
}

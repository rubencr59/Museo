package Modelo;

import java.util.Date;

public class Artista {

    private String nombre, lugarNacimiento;
    private Date fechaNac, fechaFall;

    public Artista(String nombre, String lugarNacimiento, Date fechaNac, Date fechaFall){
        this.nombre = nombre;
        this.lugarNacimiento = lugarNacimiento;
        this.fechaNac = fechaNac;
        this.fechaFall = fechaFall;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombre='" + nombre + '\'' +
                ", lugarNacimiento='" + lugarNacimiento + '\'' +
                ", fechaNac=" + fechaNac +
                ", fechaFall=" + fechaFall +
                '}';
    }
}

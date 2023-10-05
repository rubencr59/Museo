package Modelo;

public class Artista {

    private String nombre, lugarNacimiento,fechaNac, fechaFall;

    public Artista(String nombre, String lugarNacimiento, String fechaNac, String fechaFall){
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

    public String getNombre() {
        return nombre;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public String getFechaFall() {
        return fechaFall;
    }
}

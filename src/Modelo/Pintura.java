package Modelo;

public class Pintura extends Obra {

    private  Double dimensiones;

    private  String soporte;


    public Pintura(String titulo, Integer numInventario, Artista autor, Integer año, Double dimensiones, String soporte) {
        super(titulo, numInventario, autor, año);
        this.dimensiones = dimensiones;
        this.soporte = soporte;
    }

    public Double getDimensiones() {
        return dimensiones;
    }

    public String getSoporte() {
        return soporte;
    }

    @Override
    public String toString() {
        return "PINTURA\n" +
                " dimensiones= " + dimensiones + '\n' +
                " soporte='" + soporte + '\n' +
                super.toString();
    }
}

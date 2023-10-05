package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Pintura extends Obra {

    private  List<Integer> dimensiones;

    private  String soporte;


    public Pintura(String titulo, Integer numInventario, Artista autor, Integer año, Integer Altura, Integer Anchura, String soporte) {
        super(titulo, numInventario, autor, año);
        this.dimensiones = new ArrayList<Integer>();
        this.dimensiones.add(Altura, Anchura);
        this.soporte = soporte;
    }

    public List<Integer> getDimensiones() {
        return dimensiones;
    }

    public Integer getAltura(){

        return this.dimensiones.get(0);
    }

    public Integer getAnchura(){
        
        return this.dimensiones.get(1);
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

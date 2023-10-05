package Modelo;


import java.util.ArrayList;
import java.util.List;


public class Catalogo {

    private List<Obra> listaDeObras;


    public Catalogo(){
        this.listaDeObras = new ArrayList<Obra>();
    }

    public List<Obra> getListaDeObras() {
        return listaDeObras;
    }

}

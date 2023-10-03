package Modelo;

abstract public class Obra {

    private String titulo;

    private Integer numInventario, año;

    private Artista autor;


    public Obra(String titulo, Integer numInventario, Artista autor, Integer año){

        this.titulo = titulo;
        this.numInventario = numInventario;
        this.autor = autor;
        this.año = año;
    }


}

package Modelo;

import java.util.Objects;

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

    public String getTitulo() {
        return titulo;
    }

    public Integer getNumInventario() {
        return numInventario;
    }

    public Integer getAño() {
        return año;
    }

    public Artista getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "titulo='" + titulo + '\n' +
                " numInventario=" + numInventario + '\n' +
                " año=" + año + '\n' +
                " autor=" + autor ;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Obra)) return false;
        Obra obra = (Obra) o;
        return Objects.equals(titulo, obra.titulo) && Objects.equals(numInventario, obra.numInventario) && Objects.equals(año, obra.año) && Objects.equals(autor, obra.autor);
    }

}

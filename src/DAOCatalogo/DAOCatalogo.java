package DAOCatalogo;

import Modelo.Artista;
import Modelo.Escultura;
import Modelo.Obra;
import Modelo.Pintura;

import java.util.ArrayList;

public class DAOCatalogo {
    ArrayList<Obra> ListaDeObras = new ArrayList<Obra>();

    public DAOCatalogo(){

        //Crear artistas.
        Artista picasso = new Artista("Pablo Picasso", "España", "25/10/1881", "08/04/1973");
        Artista monet = new Artista("Claude Monet", "Francia", "14/11/1840", "05/12/1926");
        Artista klimt = new Artista("Gustav Klimt", "Austria", "14/07/1862", "06/02/1918");
        Artista michelangelo = new Artista("Michelangelo Buonarroti", "Italia", "06/03/1475", "18/02/1564");

        //Crear las pinturas.
        Pintura guernica = new Pintura("Guernica", 101, picasso, 1937, 350, 782, "Óleo sobre lienzo");
        Pintura liriosDeAgua = new Pintura("Lirios de Agua", 102, monet, 1916, 90, 90, "Óleo sobre lienzo");

        //Crear las esculturas.
        Escultura elPensador = new Escultura("El Pensador", 202, klimt, 1880, "Bronce", 181.0);
        Escultura venusDeMilo = new Escultura("Venus de Milo", 203, michelangelo, 130, "Mármol", 203.0);

        ListaDeObras.add(guernica);
        ListaDeObras.add(liriosDeAgua);
        ListaDeObras.add(elPensador);
        ListaDeObras.add(venusDeMilo);
    }

    public ArrayList<Obra> getListaDeObras() {
        return ListaDeObras;
    }
}

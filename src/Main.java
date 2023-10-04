import Modelo.*;

public class Main {

    public static void main(String[] args) {

        Catalogo catalogoMuseo = new Catalogo();
        Artista picasso = new Artista("Pablo Picasso", "España", "25/10/1881", "08/04/1973");
        Artista monet = new Artista("Claude Monet", "Francia", "14/11/1840", "05/12/1926");
        Artista klimt = new Artista("Gustav Klimt", "Austria", "14/07/1862", "06/02/1918");
        Artista michelangelo = new Artista("Michelangelo Buonarroti", "Italia", "06/03/1475", "18/02/1564");


        Pintura guernica = new Pintura("Guernica", 101, picasso, 1937, 349.3, "Óleo sobre lienzo");
        Pintura liriosDeAgua = new Pintura("Lirios de Agua", 102, monet, 1916, 200.0, "Óleo sobre lienzo");

        Escultura elPensador = new Escultura("El Pensador", 202, klimt, 1880, "Bronce", 181.0);
        Escultura venusDeMilo = new Escultura("Venus de Milo", 203, michelangelo, 130, "Mármol", 203.0);



        catalogoMuseo.añadeObra(guernica);
        catalogoMuseo.añadeObra(liriosDeAgua);
        catalogoMuseo.añadeObra(liriosDeAgua);
        catalogoMuseo.añadeObra(elPensador);
        catalogoMuseo.añadeObra(venusDeMilo);

        System.out.println('\n');
        catalogoMuseo.mostrar();
        System.out.println('\n');

        catalogoMuseo.eliminaObra(103);

        catalogoMuseo.eliminaObra(101);

        System.out.println('\n');
        catalogoMuseo.mostrar();
        System.out.println('\n');


        System.out.println("La escultura más alta es: " + catalogoMuseo.buscaObra(catalogoMuseo.masAlta()));

        System.out.println("La superficie de las pinturas es: " + catalogoMuseo.superficie());




    }
}
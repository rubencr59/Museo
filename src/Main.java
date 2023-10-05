import Controlador.MuseoControlador;
import Modelo.*;
import Vista.MuseoVista;

public class Main {

    public static void main(String[] args) {

        //Crear el catálogo del museo.
        Catalogo catalogoMuseo = new Catalogo();

        //Crear la vista.
        MuseoVista vistaMuseo = new MuseoVista();

        //Crear el controlador.
        MuseoControlador controlador = new MuseoControlador(catalogoMuseo, vistaMuseo);

        //Crear los artistas.
        Artista picasso = new Artista("Pablo Picasso", "España", "25/10/1881", "08/04/1973");
        Artista monet = new Artista("Claude Monet", "Francia", "14/11/1840", "05/12/1926");
        Artista klimt = new Artista("Gustav Klimt", "Austria", "14/07/1862", "06/02/1918");
        Artista michelangelo = new Artista("Michelangelo Buonarroti", "Italia", "06/03/1475", "18/02/1564");

        //Crear las pinturas.
        Pintura guernica = new Pintura("Guernica", 101, picasso, 1937, 349.3, "Óleo sobre lienzo");
        Pintura liriosDeAgua = new Pintura("Lirios de Agua", 102, monet, 1916, 200.0, "Óleo sobre lienzo");

        //Crear las esculturas.
        Escultura elPensador = new Escultura("El Pensador", 202, klimt, 1880, "Bronce", 181.0);
        Escultura venusDeMilo = new Escultura("Venus de Milo", 203, michelangelo, 130, "Mármol", 203.0);


        //Agregamos las obras al catálogo.
        controlador.agregarObra(guernica);
        controlador.agregarObra(liriosDeAgua);
        controlador.agregarObra(elPensador);
        controlador.agregarObra(venusDeMilo);

        //Mostramos el catálogo
        controlador.mostrarCatalogo();

        //Eliminar las obras del catálogo.
        controlador.eliminarObra(103);
        controlador.eliminarObra(103);

        //Mostrar la escultura más alta y la superficie de las pinturas.
        vistaMuseo.mostrarMensaje("La escultura más alta es: " + Servicio.buscaObra(catalogoMuseo.getListaDeObras(), Servicio.masAlta(catalogoMuseo.getListaDeObras())));
        vistaMuseo.mostrarMensaje("La superficie de las pinturas es: " + Servicio.superficie(catalogoMuseo.getListaDeObras()));

    }
}
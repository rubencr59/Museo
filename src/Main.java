import Controlador.MuseoControlador;
import Modelo.*;
import Servicio.ServicioCatalogo;
import Vista.MuseoVista;

public class Main {

    public static void main(String[] args) {

        //Crear el catálogo del museo.

        //Crear la vista.
        MuseoVista vistaMuseo = new MuseoVista();

        //Crear el controlador.
        MuseoControlador controlador = new MuseoControlador();

        //Mostramos el catálogo
        controlador.mostrarCatalogo();

        //Eliminar las obras del catálogo.
        controlador.eliminarObra(103);
        controlador.eliminarObra(101);

        //Mostrar la escultura más alta y la superficie de las pinturas.
        vistaMuseo.mostrarMensaje("La escultura más alta es: " + ServicioCatalogo.buscaObra(ServicioCatalogo.masAlta()));
        vistaMuseo.mostrarMensaje("La superficie de las pinturas es: " + ServicioCatalogo.calcularSuperficie() + " cm2.");

    }
}
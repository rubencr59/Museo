import Controlador.MuseoControlador;
import Servicio.ServicioCatalogo;
import Vista.MuseoVista;

public class Main {

    public static void main(String[] args) {



        //Crear el controlador.
        MuseoControlador controlador = new MuseoControlador();

        controlador.Menu();

    }
}
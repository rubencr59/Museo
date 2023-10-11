package Controlador;

import DAOCatalogo.DAOCatalogo;
import Modelo.Artista;
import Modelo.Escultura;
import Modelo.Obra;
import Modelo.Pintura;
import Servicio.ServicioCatalogo;
import Vista.MuseoVista;

import java.util.ArrayList;

public class MuseoControlador {

    private MuseoVista vista;
    private ServicioCatalogo ServicioCatalogo;

    private DAOCatalogo DAOCatalogo;

    public MuseoControlador() {
        this.vista = new MuseoVista();
        this.DAOCatalogo = new DAOCatalogo();
        this.ServicioCatalogo = new ServicioCatalogo(DAOCatalogo.getListaDeObras());
    }


    public void agregarObra(Obra obra) {
        boolean exito = ServicioCatalogo.añadeObra(obra);
        if (exito) {
            vista.mostrarMensaje("Obra añadida con éxito.");
        } else {
            vista.mostrarMensaje("Error al agregar la obra.");
        }
    }

    public void eliminarObra(int id) {
        boolean exito = ServicioCatalogo.eliminaObra( id);
        if (exito) {
            vista.mostrarMensaje("Obra eliminada con éxito.");
        } else {
            vista.mostrarMensaje("No se ha encontrado la obra.");
        }
    }

    public void mostrarCatalogo() {
        vista.mostrar(ServicioCatalogo.getCatalogo());
    }



}

package Controlador;

import Modelo.Catalogo;
import Modelo.Obra;
import Modelo.Servicio;
import Vista.MuseoVista;

public class MuseoControlador {
     private Catalogo catalogoMuseo;
    private MuseoVista vista;

    public MuseoControlador(Catalogo catalogoMuseo, MuseoVista vista) {
        this.catalogoMuseo = catalogoMuseo;
        this.vista = vista;
    }
    public void agregarObra(Obra obra) {
        boolean exito = Servicio.añadeObra(catalogoMuseo.getListaDeObras(), obra);
        if (exito) {
            vista.mostrarMensaje("Obra añadida con éxito.");
        } else {
            vista.mostrarMensaje("Error al agregar la obra.");
        }
    }

    public void eliminarObra(int id) {
        boolean exito = Servicio.eliminaObra(catalogoMuseo.getListaDeObras(), id);
        if (exito) {
            vista.mostrarMensaje("Obra eliminada con éxito.");
        } else {
            vista.mostrarMensaje("No se ha encontrado la obra.");
        }
    }

    public void mostrarCatalogo() {
        vista.mostrar(catalogoMuseo.getListaDeObras());
    }
}

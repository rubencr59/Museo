package Controlador;

import DAOCatalogo.DAOCatalogo;
import Modelo.Obra;
import Servicio.ServicioCatalogo;
import Vista.MuseoVista;

public class MuseoControlador {

    private MuseoVista vista;
    private ServicioCatalogo Catalogo;

    private DAOCatalogo DAOCatalogo;

    private int respuesta;

    public MuseoControlador() {
        this.vista = new MuseoVista();
        this.DAOCatalogo = new DAOCatalogo();
        this.Catalogo = new ServicioCatalogo(DAOCatalogo.getListaDeObras());
    }


    public void agregarObra(Obra obra) {
        boolean exito = Catalogo.añadeObra(obra);
        if (exito) {
            vista.mostrarMensaje("Obra añadida con éxito.");
        } else {
            vista.mostrarMensaje("Error al agregar la obra.");
        }
    }

    public void eliminarObra(int id) {
        boolean exito = Catalogo.eliminaObra( id);
        if (exito) {
            vista.mostrarMensaje("Obra eliminada con éxito.");
        } else {
            vista.mostrarMensaje("No se ha encontrado la obra.");
        }
    }

    public void mostrarCatalogo() {
        vista.mostrarTodasObras(Catalogo.getCatalogo());
    }

    public void Menu(){
        do{
            respuesta = vista.elegirOpcion("Añade Obra", "Elimina Obra","Busca Obra"
                    , "Supercie pinturas", "Escultura más alta","Mostrar obras");

            switch (respuesta)
            {


                case 1:
                    agregarObra(vista.pedirObra());
                    break;

                case 2:{
                    vista.mostrarTodasObras(Catalogo.getCatalogo());
                    eliminarObra(vista.pedirNumInventario());
                    break;
                }

                case 3:{
                    Catalogo.buscaObra(vista.pedirNumInventario());
                    break;
                }

                case 4: Catalogo.calcularSuperficie();
                    break;

                case 5:Catalogo.masAlta();
                    break;

                case 6:vista.mostrarTodasObras(Catalogo.getCatalogo());
                    break;

            }
        }while (respuesta != 7);

    }


}

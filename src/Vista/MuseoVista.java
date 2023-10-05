package Vista;

import java.util.List;

import Modelo.Obra;

public class MuseoVista {


    public void mostrar(List<Obra> listaDeObras){
        for (Obra obra:listaDeObras){
            System.out.println(obra.toString());
            System.out.println('\n');
        }
    }

    public void mostrarMensaje(String Mensaje){
        System.out.println('\n');
        System.out.println(Mensaje);
        System.out.println('\n');
    }

    
}

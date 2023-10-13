package Vista;

import java.util.List;
import java.util.Scanner;

import Modelo.Artista;
import Modelo.Escultura;
import Modelo.Obra;

public class MuseoVista {

    public int elegirOpcion(String ... opciones) {
        int ind,opcion=0;
        Scanner scanner = new Scanner (System.in);

        for ( ind=0; ind<opciones.length; ind++)
            System.out.println((ind+1) +" - " + opciones[ind]);

        System.out.println((ind+1) +" - Salir");

        System.out.println("\n\n Introduzca una opción: ");

        do{
            opcion = scanner.nextInt();


        }while(opcion>opciones.length);

        return opcion;
    }

    public Obra pedirObra(){
        Artista michelangelo = new Artista("Michelangelo Buonarroti", "Italia", "06/03/1475", "18/02/1564");
        Escultura venusDeMilo = new Escultura("Venus de Milo", 203, michelangelo, 130, "Mármol", 203.0);

        return  venusDeMilo;
    }


    public void mostrarObra(Obra obraALeer){

        System.out.println(obraALeer.toString());
    }

    public void mostrarTodasObras(List<Obra> listaDeObras){
        for (Obra obra:listaDeObras){
            System.out.println(obra.toString());
            System.out.println('\n');
        }
    }

    public Integer pedirNumInventario(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce el numero de inventario de la obra que deseas borrar:");
        return scanner.nextInt();

    }

    public void mostrarMensaje(String Mensaje){
        System.out.println('\n');
        System.out.println(Mensaje);
        System.out.println('\n');
    }

    
}

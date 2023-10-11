package Servicio;

import Modelo.Escultura;
import Modelo.Obra;
import Modelo.Pintura;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ServicioCatalogo {

    //Creamos el catálogo.
    private static List<Obra> Catalogo;

    public ServicioCatalogo(ArrayList<Obra> ListaDeObras){
        this.Catalogo = ListaDeObras;
    }

    public static List<Obra> getCatalogo() {
        return Catalogo;
    }

    //Busca la obra en el catálogo.
    public static Obra buscaObra(Integer numeroInventario){

        if(Catalogo.size() != 0){
            for(Obra obra:Catalogo){
                if (Objects.equals(obra.getNumInventario(), numeroInventario)){
                    return obra;
                }
            }
        }
        return null;
    }

    //Añade una obra al catálogo.
    public static boolean añadeObra(Obra obra){
        Catalogo.add(obra);
        System.out.println("Obra añadida con éxito.");
        return true;
    }


    //Elimina una obra del catálogo.
    public static boolean eliminaObra(Integer numeroInventario){

        Obra obraAborrar = buscaObra(numeroInventario);

        if (obraAborrar!=null){
            Catalogo.remove(obraAborrar);
            return true;
        }else{
            return false;
        }
    }


    //Devuelve la escultura más alta.
    public static Integer masAlta(){
        Escultura esculturaMasAlta = null;
         Double alturaMasAlta = 0.0;

        for (Obra obra:Catalogo){
            if (obra instanceof Escultura){
                Escultura escultura = (Escultura) obra;
                if(escultura.getAltura() > alturaMasAlta){
                    esculturaMasAlta = escultura;
                }
            }
        }

        return esculturaMasAlta.getNumInventario();
    }

    //Calcula la superficie de todas las pinturas y la devuelve.
    public static Integer calcularSuperficie(){

        Integer superficieTotal = 0;

        for(Obra obra:Catalogo){
            if(obra instanceof Pintura){
                Pintura pintura = (Pintura) obra;
                superficieTotal += pintura.getAltura()*pintura.getAnchura();
            }
        }
        return superficieTotal;
    }

}

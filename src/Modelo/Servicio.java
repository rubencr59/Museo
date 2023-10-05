package Modelo;

import java.util.List;
import java.util.Objects;

public class Servicio {
 
    public static Obra buscaObra(List<Obra> listaDeObras,Integer numeroInventario){

        if(listaDeObras.size() != 0){
            for(Obra obra:listaDeObras){
                if (Objects.equals(obra.getNumInventario(), numeroInventario)){
                    return obra;
                }
            }
        }

        return null;
    }

    public static boolean añadeObra(List<Obra> listaDeObras,Obra obra){
        listaDeObras.add(obra);
        System.out.println("Obra añadida con éxito.");
        return true;
    }

    public static boolean eliminaObra(List<Obra> listaDeObras,Integer numeroInventario){

        Obra obraAborrar = buscaObra(listaDeObras,numeroInventario);

        if (obraAborrar!=null){
            listaDeObras.remove(obraAborrar);
            return true;
        }else{
            return false;
        }
    }



    public static Integer masAlta(List<Obra> listaDeObras){
        Escultura esculturaMasAlta = null;
         Double alturaMasAlta = 0.0;

        for (Obra obra:listaDeObras){
            if (obra instanceof Escultura){
                Escultura escultura = (Escultura) obra;
                if(escultura.getAltura() > alturaMasAlta){
                    esculturaMasAlta = escultura;
                }
            }
        }

        return esculturaMasAlta.getNumInventario();
    }

    public static Integer calcularSuperficie(List<Obra> listaDeObras){

        Integer superficieTotal = 0;

        for(Obra obra:listaDeObras){
            if(obra instanceof Pintura){
                Pintura pintura = (Pintura) obra;
                superficieTotal += pintura.getAltura()*pintura.getAnchura();
            }
        }

        return superficieTotal;

    }


}

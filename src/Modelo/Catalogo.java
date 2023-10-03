package Modelo;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Catalogo {

    private List<Obra> listaDeObras;


    public Catalogo(){
        this.listaDeObras = new ArrayList<Obra>();
    }




    public Obra buscaObra(Integer numeroInventario){

        if(listaDeObras.size() != 0){
            for(Obra obra:listaDeObras){
                if (Objects.equals(obra.getNumInventario(), numeroInventario)){
                    return obra;
                }
            }
        }

        return null;
    }

    public boolean añadeObra(Obra obra){
        listaDeObras.add(obra);
        System.out.println("Obra añadida con éxito.");
        return true;
    }

    public boolean eliminaObra(Integer numeroInventario){

        Obra obraAborrar = buscaObra(numeroInventario);

        if (obraAborrar!=null){
            listaDeObras.remove(obraAborrar);
            System.out.println("Obra borrada con éxito.");
            return true;
        }else{
            System.out.println("No se ha encontrado la obra.");
            return false;
        }
    }

    public Double superficie(){

        Double superficieTotal = 0.0;

        for (Obra obra:listaDeObras){
            if (obra instanceof Pintura){
                Pintura pintura = (Pintura) obra;
                superficieTotal += pintura.getDimensiones();
            }
        }
        return superficieTotal;
    }


    public Integer masAlta(){
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

    public void mostrar(){
        for (Obra obra:listaDeObras){
            System.out.println(obra.toString());
            System.out.println('\n');
        }
    }





}

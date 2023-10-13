package Modelo;

public class Escultura extends Obra {

    private String material;

    private Double altura;

    public Escultura(String titulo, Integer numInventario, Artista autor, Integer año, String material, Double altura) {
        super(titulo, numInventario, autor, año);
        this.material = material;
        this.altura = altura;
    }

    public String getMaterial() {
        return material;
    }

    public Double getAltura() {
        return altura;
    }


    @Override
    public String toString() {
        return "ESCULTURA\n" + super.toString() +
                " material= " + material + '\n' +
                " altura= " + altura + '\n';
    }
}

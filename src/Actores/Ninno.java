package Actores;

public class Ninno extends Persona{
    private int edad;
    private float talla, peso;
    private String situacionEspecial, genero;

    public Ninno(long id, String nombre, String idType, int edad, float talla, float peso, String situacionEspecial, String genero) {
        super(id, nombre, idType);
        this.edad = edad;
        this.talla = talla;
        this.peso = peso;
        this.situacionEspecial = situacionEspecial;
        this.genero = genero;
    }

    public Ninno(){
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getTalla() {
        return talla;
    }

    public void setTalla(float talla) {
        this.talla = talla;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getSituacionEspecial() {
        return situacionEspecial;
    }

    public void setSituacionEspecial(String situacionEspecial) {
        this.situacionEspecial = situacionEspecial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

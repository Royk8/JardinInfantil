package Actores;

public class Persona {
    private long id;
    public static String nombre;
    private String idType;

    public Persona(long id, String nombre, String idType) {
        this.id = id;
        this.nombre = nombre;
        this.idType = idType;
    }

    public Persona() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }
}

package Actores;

public abstract class Persona {
    private String id;
    private String nombre;
    private String idType;

    public Persona(String id, String nombre, String idType) {
        this.id = id;
        this.nombre = nombre;
        this.idType = idType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

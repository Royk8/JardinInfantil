package Actores;

public class Profesor extends Persona {
    private long telefono;
    private String especialidad;

    public Profesor(long id, String nombre, String idType, long telefono, String especialidad) {
        super(id, nombre, idType);
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}

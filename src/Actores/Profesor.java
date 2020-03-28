package Actores;

public class Profesor extends Persona {
    private String telefono;
    private String especialidad;

    public Profesor(String id, String nombre, String idType, String telefono, String especialidad) {
        super(id, nombre, idType);
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}

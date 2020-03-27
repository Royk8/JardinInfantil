package Actores;

public class Pariente extends Persona {
    private long telefono, celular;
    private String calidad, direccion;

    public Pariente(long id, String nombre, String apellido, String idType, long telefono,
                    long celular, String calidad, String direccion) {
        super(id, nombre, apellido, idType);
        this.telefono = telefono;
        this.celular = celular;
        this.calidad = calidad;
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

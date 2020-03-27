package Actores;

public class Acudiente extends Pariente {
    private String horario, permiso;

    public Acudiente(long id, String nombre, String apellido, String idType, long telefono, long celular,
                     String calidad, String direccion, String horario, String permiso) {
        super(id, nombre, apellido, idType, telefono, celular, calidad, direccion);
        this.horario = horario;
        this.permiso = permiso;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getPermiso() {
        return permiso;
    }

    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }
}

package Actores;

public class Acudiente extends Pariente {
    private String horario, permiso;

    public Acudiente(String id, String nombre, String idType, String telefono, String celular,
                     String calidad, String direccion, String horario, String permiso) {
        super(id, nombre, idType, telefono, celular, calidad, direccion);
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

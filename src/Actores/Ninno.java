package Actores;

import java.util.ArrayList;
import java.util.Date;

public class Ninno extends Persona{
    private int edad;
    private float talla, peso;
    private String situacionEspecial, nivel;
    private char genero, horario;
    private Date fechaDeNacimiento;
    private ArrayList<Logro> logros;

    public Ninno(long id, String nombre, String idType, int edad, float talla, float peso,
                 String situacionEspecial, String nivel, char genero, char horario, Date fechaDeNacimiento,
                 ArrayList<Logro> logros) {

        super(id, nombre, idType);
        this.edad = edad;
        this.talla = talla;
        this.peso = peso;
        this.situacionEspecial = situacionEspecial;
        this.nivel = nivel;
        this.genero = genero;
        this.horario = horario;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.logros = logros;

    }

}

package Actores;

import java.time.LocalDate;
import java.util.ArrayList;


public class Ninno extends Persona{
    private int edad;
    private float talla, peso;
    private String situacionEspecial, nivel;
    private char genero, horario;
    private LocalDate fechaDeNacimiento;
    private ArrayList<Logro> logros;

    public Ninno(long id, String nombre, String apellido, String idType, int edad, float talla, float peso,
                 String situacionEspecial, String nivel, char genero, char horario, int day, int month, int year) {
        super(id, nombre, apellido, idType);
        this.edad = edad;
        this.talla = talla;
        this.peso = peso;
        this.situacionEspecial = situacionEspecial;
        this.nivel = nivel;
        this.genero = genero;
        this.horario = horario;
        this.fechaDeNacimiento = LocalDate.of(year,month,day);
        this.logros = new ArrayList<Logro>();
    }
}

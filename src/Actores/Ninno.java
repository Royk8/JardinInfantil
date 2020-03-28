package Actores;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ninno extends Persona{
    private int edad, grupo;
    private float talla, peso;
    private String situacionEspecial;
    private char genero, horario;
    private LocalDate fechaDeNacimiento;
    private ArrayList<Logro> logros;

    public Ninno(String id, String nombre, String idType, int edad, int grupo, float talla,
                 float peso, String situacionEspecial, char genero, char horario, int year, int month, int day) {
        super(id, nombre, idType);
        this.edad = edad;
        this.grupo = grupo;
        this.talla = talla;
        this.peso = peso;
        this.situacionEspecial = situacionEspecial;
        this.genero = genero;
        this.horario = horario;
        this.fechaDeNacimiento = LocalDate.of(year,month,day);
        logros = new ArrayList<Logro>();
    }
}

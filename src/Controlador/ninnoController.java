package Controlador;

import Actores.Ninno;

import java.util.ArrayList;

public class ninnoController {
    public static ArrayList<Ninno> ninnos;

    public ninnoController(){

    }

    public void addNinno(){
        Ninno jhoniercito = new Ninno(175456L,"Jhoniercito","Cordoba","Registro Civil",
                4,1.40f,35f,"Indisciplina","2",'M','T',10,
                5,2001);
        ninnos.add(jhoniercito);
        Ninno alejito = new Ninno(487561L,"Alejito","Yarce","Registro Civil",
                4,1.38f,36f,"Preguntoncito","2",'M','T',26,
                12,1998);
        ninnos.add(alejito);
    }



    public ArrayList<Ninno> getNinnos(){
        return ninnos;
    }
}

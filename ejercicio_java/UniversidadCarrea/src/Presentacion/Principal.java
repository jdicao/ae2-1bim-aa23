/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Clases.Universidad;
import Clases.Carrera;

/**
 *
 * @author jeffd
 */
public class Principal {
    
    public static void main(String[] args) {
        //Crear objecto universidad
        Universidad objUniversidad = new Universidad("UTPL","Loja","Diana Jimenez",5);
        //crear objeto carrera
        Carrera objCarrera = new Carrera("Tecnologia en Transformacion Digital de Empresas","UTPL TEC","Tecnólogo en Transformacion Digital de Empresas",4,"Patricio Abad");
        //cambio en numero de semestres
        objCarrera.setNumero_semestres(6);
        //presentar datos por pantalla
        System.out.println("Datos de la Universidad:");
        System.out.println(objUniversidad.toString());
        System.out.println("Datos de la Carrera:");
        System.out.println(objCarrera.toString());
    }
}

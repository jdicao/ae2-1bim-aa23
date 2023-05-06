/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jeffd
 */
public class Carrera {
    public String nombre;
    public String facultad;
    public String titulo;
    public int numero_semestres;
    public String director;

    public Carrera() {
    }

    public Carrera(String nombre, String facultad, String titulo, int numero_semestres, String director) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.titulo = titulo;
        this.numero_semestres = numero_semestres;
        this.director = director;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumero_semestres() {
        return numero_semestres;
    }
    public String getDirector() {
        return director;
    }    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumero_semestres(int numero_semestres) {
        this.numero_semestres = numero_semestres;
    }
    public void setDirector(String director) {
        this.director = director;
    }    

    @Override
    public String toString() {
        //return "Carrera{" + "nombre=" + nombre + ", facultad=" + facultad + ", titulo=" + titulo + ", numero_semestres=" + numero_semestres + '}';
        return "Carrera{" + "nombre=" + nombre + ", facultad=" + facultad + ", director=" + director + ", titulo=" + titulo + ", numero_semestres=" + numero_semestres + '}';
    }
    
    
    
}

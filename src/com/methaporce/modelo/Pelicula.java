package com.methaporce.modelo;

public class Pelicula {
    private int id;
    private String nombre;
    private boolean disponible;

    public Pelicula(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.disponible = true;
    }

    // Getters y setters para los atributos
    // ...

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Disponible: " + disponible;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
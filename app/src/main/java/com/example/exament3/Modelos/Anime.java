package com.example.exament3.Modelos;

public class Anime {
    private String nombre;
    private String descripcion;
    private String image;

    public Anime(String nombre, String descripcion, String image) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

package com.example.dgonzalo.restaurantapp;

public class ItemList {
    protected long id;
    protected String nombre;
    protected String tipo;

    public ItemList() {
        this.nombre = "";
        this.tipo = "";
    }

    public ItemList(long id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

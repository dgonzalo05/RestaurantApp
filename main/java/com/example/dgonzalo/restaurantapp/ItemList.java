package com.example.dgonzalo.restaurantapp;

public class ItemList {
    protected String nombre;
    protected boolean titol;
    protected long id;
    private static long nextId = 0;

    public ItemList() {
        this.nombre = "";
        this.titol = false;
        this.id = nextId++;
    }

    public ItemList(String nombre) {
        this.nombre = nombre;
        this.titol = false;
        this.id = nextId++;
    }

    public ItemList(String nombre, boolean titol) {
        this.nombre = nombre;
        this.titol = titol;
        this.id = nextId++;
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

    public boolean isTitol() {
        return titol;
    }
}

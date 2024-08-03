package com.celeste.miumg.edu.gt;


import java.util.List;

public abstract class Postres {
    private String nombre;
    private int tamano;
    private double precio;

    List<Ingrediente> ingredientes;

    public Postres(String nombre, int tamano, double precio, List<Ingrediente> ingredientes) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public abstract void preparar();
    public abstract void servir();
}

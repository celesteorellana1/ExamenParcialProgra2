package com.celeste.miumg.edu.gt;

public class Pastel extends Postres {

    private String sabor;

    public Pastel(String nombre, int tamano, double precio, String sabor) {
        super(nombre, tamano, precio);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Pastel");
    }

    @Override
    public void servir() {
        System.out.println("Servir Pastel");
    }
}

package com.celeste.miumg.edu.gt;

public class Brownie extends Postres{
    private String tipoChocolate;

    public Brownie(String nombre, int tamano, double precio, String tipoChocolate) {
        super(nombre, tamano, precio);
        this.tipoChocolate = tipoChocolate;
    }

    public String getTipoChocolate() {
        return tipoChocolate;
    }

    public void setTipoChocolate(String tipoChocolate) {
        this.tipoChocolate = tipoChocolate;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Brownie");
    }

    @Override
    public void servir() {
        System.out.println("Servir Brownie");
    }
}

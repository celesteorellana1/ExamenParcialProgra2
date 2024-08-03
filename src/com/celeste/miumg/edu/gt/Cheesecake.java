package com.celeste.miumg.edu.gt;

public class Cheesecake extends Postres{
    private String tipoQueso;

    public Cheesecake(String nombre, int tamano, double precio, String tipoQueso) {
        super(nombre, tamano, precio);
        this.tipoQueso = tipoQueso;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Cheesecake");
    }

    @Override
    public void servir() {
        System.out.println("Servir Cheesecake");
    }
}

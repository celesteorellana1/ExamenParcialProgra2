package com.celeste.miumg.edu.gt;

public class Crepa extends Postres {
    private String tipoMasa;

    public Crepa(String nombre, int tamano, double precio, String tipoMasa) {
        super(nombre, tamano, precio);
        this.tipoMasa = tipoMasa;
    }

    public String getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Crepa");
    }

    @Override
    public void servir() {
        System.out.println("Servir Crepa");
    }
}

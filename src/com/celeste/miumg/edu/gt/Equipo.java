package com.celeste.miumg.edu.gt;

public class Equipo {
    private String tipo;
    private boolean estado;

    public Equipo(String tipo, boolean estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void Encender(){
        estado = true;
        System.out.println("El equipo esta encendido");
    }

    public void Apagar(){
        estado = false;
        System.out.println("El eqipo esta apagado");
    }

    public void reparar(){
        estado = false;
        System.out.println("El equipo esta reparado");
        estado = true;
    }


}

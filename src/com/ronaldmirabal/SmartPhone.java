package com.ronaldmirabal;

public class SmartPhone extends SmartDevice{
    String capacidadCamaraDelantera;
    String capacidadCamaraTrasera;
    String tamanoPantalla;

    public SmartPhone(){

    }
    public SmartPhone(String marca, String modelo, int capacidadMemoria, String sistema, String almacenamiento, String duracionBateria){
        super(marca,modelo,capacidadMemoria,sistema,almacenamiento,duracionBateria);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "capacidadCamaraDelantera='" + capacidadCamaraDelantera + '\'' +
                ", capacidadCamaraTrasera='" + capacidadCamaraTrasera + '\'' +
                ", tamanoPantalla='" + tamanoPantalla + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadMemoria=" + capacidadMemoria +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", almacenamiento='" + almacenamiento + '\'' +
                ", duracionBateria='" + duracionBateria + '\'' +
                '}';
    }
}

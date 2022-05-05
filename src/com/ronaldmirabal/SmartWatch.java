package com.ronaldmirabal;

public class SmartWatch extends SmartDevice{
    boolean manosLibres;
    boolean alarmaSenderismo;
    boolean recordatorios;

    public  SmartWatch(){

    }
    public  SmartWatch(String marca, String modelo, int capacidadMemoria, String sistema, String almacenamiento, String duracionBateria){
        super(marca,modelo,capacidadMemoria,sistema,almacenamiento,duracionBateria);
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "manosLibres=" + manosLibres +
                ", alarmaSenderismo=" + alarmaSenderismo +
                ", recordatorios=" + recordatorios +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadMemoria=" + capacidadMemoria +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", almacenamiento='" + almacenamiento + '\'' +
                ", duracionBateria='" + duracionBateria + '\'' +
                '}';
    }
}

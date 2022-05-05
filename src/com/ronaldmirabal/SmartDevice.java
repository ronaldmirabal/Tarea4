package com.ronaldmirabal;

public class SmartDevice {
    String marca;
    String modelo;
    int capacidadMemoria;
    String sistemaOperativo;
    String almacenamiento;
    String duracionBateria;
    public SmartDevice(){

    }
    public SmartDevice(String marca, String modelo, int capacidadMemoria, String sistema, String almacenamiento, String duracionBateria){
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadMemoria = capacidadMemoria;
        this.sistemaOperativo = sistema;
        this.almacenamiento = almacenamiento;
        this.duracionBateria = duracionBateria;
    }



}

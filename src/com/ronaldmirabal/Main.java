package com.ronaldmirabal;

public class Main {
    public static void main(String[] args) {
        SmartWatch smartWatchObj = new SmartWatch("Amazon", "Amazfit Bip U",2,"Android","1Gb","24 horas");
        smartWatchObj.manosLibres = true;
        smartWatchObj.alarmaSenderismo = false;
        smartWatchObj.recordatorios = true;

        SmartPhone smartPhoneObj = new SmartPhone("iPhone", "13 pro max", 8, "IOS","128Gb","6 horas");
        smartPhoneObj.capacidadCamaraDelantera = "13px";
        smartPhoneObj.capacidadCamaraTrasera = "5px";
        smartPhoneObj.tamanoPantalla = "FullHD a 2.532 x 1.170";

        System.out.println(smartPhoneObj.toString());
        System.out.println(smartWatchObj.toString());
    }
}

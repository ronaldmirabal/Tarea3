package com.ronaldmirabal;

public class Bucles {
    public static void main(String[] args) {
        String[] text = {"Agua", "Pan", "Azucar", "Manzana", "Refresco"};
        String concatenar = "";
        for (int i = 0; i < text.length;i++){
            concatenar += text[i] + ", ";
        }
        System.out.println(concatenar);
    }
}

package com.companybitmix;

public class Cuadrado extends Figura {

    public Cuadrado(int lado) {
        super(lado);
    }

    public void area() {
        System.out.println("el area es " + areaCuadrado(base));
    }

    public static int areaCuadrado(int lado) {
        int area = lado * lado;
        return area;
    }
}

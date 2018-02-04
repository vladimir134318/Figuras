package com.companybitmix;

public class Rectangulo extends Figura {

    int altura;

    public Rectangulo(int base, int altura) {
        super(base);
        this.altura = altura;
    }

    public void area() {
        System.out.println("el area es " + areaRectangulo(base, altura));
    }

    public static int areaRectangulo(int lado, int altura) {
        int area = lado * altura;
        return area;
    }
}




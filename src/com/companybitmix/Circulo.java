package com.companybitmix;

public class Circulo extends Figura {

    public Circulo(int radio) {
        super(radio);
    }

    public void area() {
        System.out.println("el area es " + areacirculo(base));
    }

    public static double areacirculo(int radio) {
        double area = Math.PI * radio * radio;
        return area;
    }
}

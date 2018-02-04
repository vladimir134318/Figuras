package com.companybitmix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Figura rec;
        Figura cir;
        Figura cua;
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("para salir ingrese 0");
            System.out.println("para saber el area de un Rectangulo ingrese 1");
            System.out.println("para saber el area de un Cuadrado ingrese 2");
            System.out.println("para saber el area de un Circulo ingrese 3");

            n = scanner.nextInt();
            if (n == 1) {
                System.out.println("ingrese la base del rectangulo");
                int b = scanner.nextInt();
                System.out.println("ingrese la altura del rectangulo");
                int a = scanner.nextInt();
                rec = new Rectangulo(a, b);
                rec.area();

            }
            if (n == 2) {
                System.out.println("ingrese la base del cuadrado");
                int b = scanner.nextInt();
                rec = new Cuadrado(b);
                rec.area();
            }
            if (n == 3) {
                System.out.println("ingrese el radio del circulo");
                int b = scanner.nextInt();
                rec = new Circulo(b);
                rec.area();
            }

        }
        while (n != 0);
    }
}

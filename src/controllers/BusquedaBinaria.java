package controllers;

import models.Person;

public class BusquedaBinaria {

    public static int buscar(Person[] personas, int edadBuscada) {
        int bajo = 0;
        int alto = personas.length - 1;

        while (bajo <= alto) {
            int centro = (bajo + alto) / 2;
            int valorCentro = personas[centro].getAge();

            imprimirArreglo(personas, bajo, alto);
            System.out.println("bajo=" + bajo + "      alto=" + alto + "      centro=" + centro + "      valorCentro=" + valorCentro);

            if (valorCentro == edadBuscada) {
                System.out.println("--> ENCONTRADO");
                return centro;
            } else if (valorCentro < edadBuscada) {
                System.out.println("--> DERECHA\n");
                bajo = centro + 1;
            } else {
                System.out.println("--> IZQUIERDA\n");
                alto = centro - 1;
            }
        }

        return -1;
    }

    private static void imprimirArreglo(Person[] personas, int bajo, int alto) {
        for (int i = bajo; i <= alto; i++) {
            System.out.print(personas[i].getAge() + " | ");
        }
        System.out.println();
    }
}

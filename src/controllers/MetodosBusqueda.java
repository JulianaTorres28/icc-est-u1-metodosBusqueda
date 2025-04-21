package controllers;

import views.ShowConsole;
import models.Person;
import java.util.Arrays;
import java.util.Comparator;

public class MetodosBusqueda {
    private ShowConsole showConsole;
    private Person[] people;

    public MetodosBusqueda(Person[] persons) {
        showConsole = new ShowConsole();
        this.people = persons;
        buscarPersonaPorEdad(); 
    }

    public void buscarPersonaPorEdad() {
        Arrays.sort(people, Comparator.comparingInt(Person::getAge));

        int edadBuscada = showConsole.getInt("Ingrese la edad a buscar: ");
        int bajo = 0;
        int alto = people.length - 1;

        while (bajo <= alto) {
            int centro = (bajo + alto) / 2;
            int valorCentro = people[centro].getAge();

            // Imprimir el subarreglo actual
            for (int i = bajo; i <= alto; i++) {
                System.out.print(people[i].getAge() + " | ");
            }
            System.out.println();

            System.out.println("bajo=" + bajo + "      alto=" + alto + "      centro=" + centro + "      valorCentro=" + valorCentro);

            if (valorCentro == edadBuscada) {
                System.out.println("--> ENCONTRADO");
                System.out.println("La persona con la edad " + edadBuscada + " es " + people[centro].getName());
                return;
            } else if (valorCentro < edadBuscada) {
                System.out.println("--> DERECHA");
                bajo = centro + 1;
            } else {
                System.out.println("--> IZQUIERDA");
                alto = centro - 1;
            }
        }

        System.out.println("No se encontró una persona con la edad " + edadBuscada);
    }
}

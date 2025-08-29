package dev.jorge.set.ejercicios;

import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EjercicioSetZoologico {
    public static void main(String[] args) {

        Set<String> grupoDeAnimale1 = crearSetAnimales1();
        Scanner scanner = new Scanner(System.in);

        Set<String> grupoDeAnimale2 = crearSetAnimales2(scanner);

        grupoDeAnimale1.retainAll(grupoDeAnimale2);

        imprimirSet(grupoDeAnimale1);


    }

    public static Set<String> crearSetAnimales1() {

        Set<String> grupoDeAnimale1 = new HashSet<>(Arrays.asList("oso", "gorila", "zebra", "leon", "pantera"));


        return grupoDeAnimale1;
    }

    public static Set<String> crearSetAnimales2(Scanner scanner) {

        Set<String> grupoDeAnimale2 = new HashSet<>();

        String animal;

        do {
            System.out.print("Ingresar animal de zoologico:");
            animal = scanner.nextLine().toLowerCase();

            if (!animal.equals("salida")) {

                grupoDeAnimale2.add(animal);
            }


        } while (!(animal).toLowerCase().equals("salida"));


        return grupoDeAnimale2;


    }

    public static void imprimirSet(Set<String> grupoDeAnimales) {

        System.out.printf("Los animales comunes son %s%n", grupoDeAnimales);

    }
}

package dev.jorge.set.ejercicios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EjercicioSetUtiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> utilesPrimerHijo = crearSetUtiles1();

        Set<String> utilesSegundoHijo = crearSetUtiles2(scanner);

        utilesPrimerHijo.removeAll(utilesSegundoHijo); //A - B y se guarda en el set1

        imprimirSet(utilesPrimerHijo);

    }

    public static Set<String> crearSetUtiles1() {
        Set<String> utilesPrimerhijo = new HashSet<>(Arrays.asList("lapicero", "borrador", "lonchera", "mochila", "corrector", "goma", "tijera"));

        return utilesPrimerhijo;
    }

    public static Set<String> crearSetUtiles2(Scanner scanner) {
        Set<String> utilesSegundoHijo = new HashSet<>();

        String utiles;

        do {
            System.out.print("Ingresar utiles del hijo:");
            utiles = scanner.nextLine().toLowerCase();

            if (!utiles.equals("salida")) {

                utilesSegundoHijo.add(utiles);
            }


        } while (!(utiles).toLowerCase().equals("salida"));


        return utilesSegundoHijo;

    }

    public static void imprimirSet(Set<String> utiles) {
        System.out.printf("Utiles faltantes %s%n", utiles);
    }
}

package dev.jorge.set.ejercicios;

import java.util.*;

public class EjercicioSetRegalos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Set<String> grupoRegalos1 = crearSetGrupo1();
        System.out.printf("Regalos grupo 1 %s%n", grupoRegalos1);
        System.out.println("");
        Set<String> grupoRegalos2 = crearSetGrupo2(scanner);
        System.out.printf("Regalos grupo 2 %s%n", grupoRegalos2);
        scanner.close();

        grupoRegalos1.addAll(grupoRegalos2);

        imprimirSet(grupoRegalos1);


    }

    public static Set<String> crearSetGrupo1() {

        Set<String> grupoRegalos1 = new HashSet<>(Arrays.asList("oso", "carro", "patito", "robot", "pelota"));

        return grupoRegalos1;
    }

    public static Set<String> crearSetGrupo2(Scanner scanner) {
        Set<String> grupoRegalos2 = new HashSet<>();
        String nombreRegalo;

        do {
            System.out.print("Ingresar el nombre de regalo:");
            nombreRegalo = scanner.nextLine().toLowerCase();

            if (!nombreRegalo.equals("salida")) {

                grupoRegalos2.add(nombreRegalo);
            }


        } while (!(nombreRegalo).toLowerCase().equals("salida"));


        return grupoRegalos2;
    }

    public static void imprimirSet(Set<String> grupoRegalosFinal) {

        System.out.println("Regalos grupo final" + grupoRegalosFinal);

    }
}

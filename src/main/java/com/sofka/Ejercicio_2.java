package com.sofka;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre, reclamo;
        Integer opcion, elegiralquiler, elegirentrega, elegirqueja;


        ArrayList<String> peliculas = new ArrayList<>();
        peliculas.add("Star Wars");
        peliculas.add("Harry Poter");
        peliculas.add("Lord of the Rings");
        peliculas.add("Interestellar");

        System.out.println("Ingrese nombre de usuario");
        nombre = entrada.next();


        System.out.println("" +
                "1- Alquilar\n" +
                "2- Cosultar Peliculas \n" +
                "3- Entregar Pelicula \n" +
                "8- Salir");
        do {
            System.out.println("Ingrese una opcion");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Que pelicula deseas alquilar?\n" +
                            "1- Star Wars\n" +
                            "2- Harry Poter\n" +
                            "3- Lord of the Rings\n" +
                            "4- Interestellar\n");
                    elegiralquiler = entrada.nextInt();
                    switch (elegiralquiler) {
                        case 1:
                            System.out.println(nombre + " Alquilo Star Wars");
                            break;
                        case 2:
                            System.out.println(nombre + " Alquilo Harry Poter");
                            break;
                        case 3:
                            System.out.println(nombre + " Alquilo Lord of the Rings");
                            break;
                        case 4:
                            System.out.println(nombre + " Alquilo Interestellar");
                            break;
                        default:
                            System.out.println("opcion incorrecta");
                    }
                    break;

                case 2:
                    System.out.println("Lista de peliculas\n" + peliculas);
                    break;

                case 3:
                    System.out.println("Que pelicula desea entregar?\n" +
                            "1- Star Wars\n" +
                            "2- Harry Poter\n" +
                            "3- Lord of the Rings\n" +
                            "4- Interestellar\n");
                    elegirentrega = entrada.nextInt();
                    switch (elegirentrega) {
                        case 1:
                            System.out.println(nombre + " que tal estuvo Star Wars?");
                            break;
                        case 2:
                            System.out.println(nombre + " que tal estuvo  Harry Poter?");
                            break;
                        case 3:
                            System.out.println(nombre + " que tal estuvo  Lord of the Rings?");
                            break;
                        case 4:
                            System.out.println(nombre + " que tal estuvo  Interestellar?");
                            break;
                        default:
                            System.out.println("opcion incorrecta");
                    }
                    System.out.println("Te gustaria dejar realizar alguna queja?\n" +
                            "1- Si\n" +
                            "2- No\n");
                    elegirqueja = entrada.nextInt();
                    switch (elegirqueja) {
                        case 1:
                            System.out.println("Cuentanos que sucedio");
                            reclamo = entrada.next();
                            System.out.println("Su queja fue registrada\n" + "(" + reclamo + ")" + "\nLo revisaremos lo mas rapido posible");
                            break;
                        case 2:
                            System.out.println("Muchas gracias por su preferencia!");
                    }
                    break;
                default:
                    System.out.println("opcion incorrecta");
            }
        }
        while (opcion != 8);
    }
}

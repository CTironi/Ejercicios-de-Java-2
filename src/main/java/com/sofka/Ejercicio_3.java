package com.sofka;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombre;
        Integer opcion, elegirproducto, elegirprecio, elegirdevolucion;

        ArrayList<String> productos = new ArrayList<>();
        productos.add("Remedios");
        productos.add("Limpieza");
        productos.add("Higiene");
        productos.add("Cosméticos");

        System.out.println("Bienvenido a La Droguería Mi Salud.\n Ingrese nombre de usuario");
        nombre = entrada.next();

        System.out.println("Bienvenido, " + nombre + ", contamos con esta lista de productos: " + productos + " que desearia ver?\n" +
                "1- Comprar\n" +
                "2- Consultar precios\n" +
                "3- Devolver producto\n" +
                "8- Salir");
        do {
            System.out.println("Ingrese una opcion");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Que producto desea comprar?\n" +
                            "1- Remedios\n" +
                            "2- Limpieza\n" +
                            "3- Higiene\n" +
                            "4- Cosméticos\n");
                    elegirproducto = entrada.nextInt();
                    switch (elegirproducto) {
                        case 1:
                            System.out.println(nombre + " Compro Remedios, gracias por su preferencia!");
                            break;
                        case 2:
                            System.out.println(nombre + " Compro Limpieza, gracias por su preferencia!");
                            break;
                        case 3:
                            System.out.println(nombre + " Compro Higiene, gracias por su preferencia!");
                            break;
                        case 4:
                            System.out.println(nombre + " Compro Cosméticos, gracias por su preferencia!");
                            break;
                        default:
                            System.out.println("opcion incorrecta");
                    }
                    break;
                case 2:
                    System.out.println("De que producto desearia ver el precio?\n" +
                            "1- Remedios\n" +
                            "2- Limpieza\n" +
                            "3- Higiene\n" +
                            "4- Cosméticos\n");
                    elegirprecio = entrada.nextInt();
                    switch (elegirprecio) {
                        case 1:
                            System.out.println("Los Remedios cuestan $100");
                            break;
                        case 2:
                            System.out.println("Los productos de Limpieza cuestan $250");
                            break;
                        case 3:
                            System.out.println("Los productos de Higiene cuestan $130");
                            break;
                        case 4:
                            System.out.println("Los Cosméticos cuestan $190");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Que producto desea devolver?\n" +
                            "1- Remedios\n" +
                            "2- Limpieza\n" +
                            "3- Higiene\n" +
                            "4- Cosméticos\n");
                    elegirdevolucion = entrada.nextInt();
                    switch (elegirdevolucion) {
                        case 1:
                            System.out.println("Lamentamos los incovenientes");
                            break;
                        case 2:
                            System.out.println("Lamentamos los incovenientes");
                            break;
                        case 3:
                            System.out.println("Lamentamos los incovenientes");
                            break;
                        case 4:
                            System.out.println("Lamentamos los incovenientes");
                            break;
                    }
                    break;
            }
        } while (opcion != 8);
    }
}

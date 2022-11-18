package com.sofka;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        Integer edad;

        System.out.println("Ingrese nombre y apellido");
        nombre = entrada.nextLine();

        System.out.println("Ingrese la edad");
        edad = entrada.nextInt();

        String verificar = (edad >= 18)
                ? nombre + " usted es mayor de edad, por lo tanto, puede entrar a la fiesta."
                : nombre + " usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.";
        System.out.println(verificar);

    }
}
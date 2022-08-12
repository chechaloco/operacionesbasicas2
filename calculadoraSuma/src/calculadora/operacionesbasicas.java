/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Cesar Ramirez
 */
public class operacionesbasicas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int operaciones = 0;
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;

        do {
            System.out.println("\n");
            System.out.println("SELECCIONE UN NUMERO DE OPERACION A REALIZAR");
            System.out.println("1.-SUMA");
            System.out.println("2.-RESTA");
            System.out.println("3.-MULTIPLICACION");
            System.out.println("4.-DIVISION");
            System.out.println("5.-SALIR");
            operaciones = sc.nextInt();

            if (operaciones != 5) {
                System.out.println("inserte primer numero: ");
                numero1 = sc.nextInt();
                System.out.println("inserte esegundo numero: ");
                numero2 = sc.nextInt();
            }

            switch (operaciones) {
                case 1:
                    operaciones = 1;
                    resultado = numero1 + numero2;
                    System.out.println("resultado de la suma es: " + resultado);
                    break;

                case 2:
                    operaciones = 2;
                    resultado = numero1 - numero2;
                    System.out.println("el resultado de la resta es: " + resultado);
                    break;

                case 3:
                    operaciones = 3;
                    resultado = numero1 * numero2;
                    System.out.println("el resultado de la multiplicacion: " + resultado);
                    break;

                case 4:
                    operaciones = 4;
                    resultado = numero1 / numero2;
                    System.out.println("el resultado de la division es: " + resultado);
                    break;
            }

        } while (operaciones != 5);
        System.out.println("ah elejido salir de la calculadora hasta la proxima");

    }

}

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
public class suma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int menu = 0;
        int seleccione_alguna_operacion = 0;

        do {
            System.out.println("MENU");
            System.out.println("1. Aritmetica");
            System.out.println("2. Trigonometria");
            System.out.println("3. Estadistica");
            System.out.println("4: Calculo");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opcion");
            menu = sc.nextInt();

            if (menu != 5) {
                System.out.println("ingrese una opcion: ");
                seleccione_alguna_operacion = sc.nextInt();
            }

            switch (menu) {
                case 1:
                    
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
                        seleccione_alguna_operacion = sc.nextInt();

                        if (seleccion_de_operacion != 5) {
                            System.out.println("inserte primer numero: ");
                            numero1 = leer.nextInt();
                            System.out.println("inserte esegundo numero: ");
                            numero2 = leer.nextInt();
                        }

                        switch (seleccion_de_operacion) {
                            case 1:
                                seleccion_de_operacion = 1;
                                resultado = numero1 + numero2;
                                System.out.println("resultado de la suma es: " + resultado);
                                break;

                            case 2:
                                seleccion_de_operacion = 2;
                                resultado = numero1 - numero2;
                                System.out.println("el resultado de la resta es: " + resultado);
                                break;

                            case 3:
                                seleccion_de_operacion = 3;
                                resultado = numero1 * numero2;
                                System.out.println("el resultado de la multiplicacion: " + resultado);
                                break;

                            case 4:
                                seleccion_de_operacion = 4;
                                resultado = numero1 / numero2;
                                System.out.println("el resultado de la division es: " + resultado);
                                break;
                        }

                    } while (seleccion_de_operacion != 5);
                    System.out.println("ah elejido salir de la calculadora hasta la proxima");

            }
        } while (menu != 5); // dkjslkjglñksjglks
    }

}

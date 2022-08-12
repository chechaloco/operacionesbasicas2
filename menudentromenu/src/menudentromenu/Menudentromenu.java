/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menudentromenu;

import java.util.Scanner;

/**
 *
 * @author Cesar Ramirez
 */
public class Menudentromenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner menu1 = new Scanner(System.in);

        int opciones = 0;

        do {
            System.out.println("***MENU***");
            System.out.println("1. aritmetica");
            System.out.println("2. Trigonometrica");
            System.out.println("3. Estadistica");
            System.out.println("4. calculo");
            System.out.println("5. salir");
            System.out.println("-----Ingrese una opcion-----");
            opciones = menu1.nextInt();

            if (opciones != 5) {
                switch (opciones) {
                    case 1: //este caso es para la opcion de aritmetica
                        opciones = 1;

                        Scanner menu2 = new Scanner(System.in);

                        int potencia = 1;
                        int operaciones = 0;
                        double numero1 = 0;
                        double numero2 = 0;
                        double resultado = 0;

                        do {
                            System.out.println("***ARITMETICA***");
                            System.out.println("1. suma");
                            System.out.println("2. resta");
                            System.out.println("3. multiplicacion");
                            System.out.println("4. division");
                            System.out.println("5. potencia");
                            System.out.println("6. salir");
                            System.out.println("-----Ingrese una opcion-----");
                            operaciones = menu2.nextInt();

                            if (operaciones != 6) {
                                System.out.println("ingresar el primer numero");
                                numero1 = menu2.nextDouble();
                                System.out.println("ingresar el sugundo numero");
                                numero2 = menu2.nextDouble();
                            }

                            switch (operaciones) {
                                case 1: //caso para la suma
                                    operaciones = 1;
                                    resultado = numero1 + numero2;
                                    System.out.println("la suma es:" + resultado);
                                    break;

                                case 2: // caso para la resta
                                    operaciones = 2;
                                    resultado = numero1 - numero2;
                                    System.out.println("la resta es: " + resultado);
                                    break;

                                case 3: // caso para la multiplicacion
                                    operaciones = 3;
                                    resultado = numero1 * numero2;
                                    System.out.println("la multiplicacion es: " + resultado);
                                    break;

                                case 4: //caso para la division
                                    operaciones = 4;
                                    resultado = numero1 / numero2;
                                    if (numero2 == 0) {
                                        System.out.println("no se puede dividir dentro de cero");
                                    }
                                    System.out.println("la division es: " + resultado);
                                    break;

                                case 5: //caso para la division
                                    operaciones = 5;

                                    int i = 1;
                                    do {
                                        potencia = (int) (potencia * numero1);
                                        i++;
                                    } while (i <= numero2);
                                    System.out.println("la potencia es: " + potencia);
                                    break;
                            }

                            if (numero2 < 0) {
                                System.out.println("el exponente no puede ser menor que cero");
                            }
                            break;

                        } while (operaciones != 6);
                        System.out.println("usted a elejido regresar al menu principal");
                        break;

                    case 2: //este case es para la opcion de trigonometria
                        opciones = 2;

                        Scanner menu3 = new Scanner(System.in);

                        int operaciones1 = 0;
                        double numero3 = 0;

                        do {
                            System.out.println("***TRIGONOMETRIA***");
                            System.out.println("1. seno");
                            System.out.println("2. coseno");
                            System.out.println("3. tangente");
                            System.out.println("4. salir");
                            System.out.println("-----Ingrese una opcion-----");
                            operaciones1 = menu3.nextInt();

                            if (operaciones1 != 4) {

                            }

                            switch (operaciones1) {
                                case 1:  //este case es para el calculo de seno
                                    operaciones1 = 1;

                                    double x = 3.1415;
                                    double s = 1;
                                    double fac = 10;
                                    int n;

                                    System.out.println("favor ingresar un numero:");
                                    n = menu3.nextInt();

                                    s = x;

                                    for (int i = 2; i < n; i++) {
                                        fac = fac * ((i * 2) - 2) * ((i * 2) - 1);

                                        if (i % 2 == 0) {
                                            n = (int) (x + Math.pow(n, i * 2 - 1) / fac);
                                        } else {
                                            n = (int) (x + Math.pow(n, i * 2 - 1) / fac);
                                        }
                                    }
                                    System.out.println("sen(x) se aproxima a: " + s);
                                    break; //hasta aca termina la operaciones del seno

                                case 2: //este case calcula el coseno
                                    operaciones1 = 2;
                                    System.out.println("Seno de 90 = " + Math.cos(90));
                                    break;

                                case 3:  // este case es para calcular la tangente
                                    operaciones1 = 3;
                                    break;
                            }

                        } while (operaciones1 != 4);
                        System.out.println("usted a elejido regresar al menu principal");
                        break;

                    case 3: //este caso es para la opcion de estadistica
                        opciones = 3;

                        Scanner menu4 = new Scanner(System.in);

                        int operaciones2;
                        double numero4 = 0;

                        do {
                            System.out.println("***ESTADISTICA***");
                            System.out.println("1, Promedio");
                            System.out.println("2. Media");
                            System.out.println("3. Moda");
                            System.out.println("4. Valance");
                            System.out.println("5. Desviacion estandar");
                            System.out.println("6. salir");
                            System.out.println("-----Ingrese una opcion-----");
                            operaciones2 = menu4.nextInt();

                            if (operaciones2 != 6) {

                            }

                            switch (operaciones2) {
                                case 1:  // este case es para resolver el promedio
                                    operaciones2 = 1;
                                    break;

                                case 2:  // este case es para resolver la media
                                    operaciones2 = 2;
                                    break;

                                case 3:  //este case es para resolver el moda
                                    operaciones2 = 3;
                                    break;

                                case 4:  //este case es para resolver el valance
                                    operaciones2 = 4;
                                    break;

                                case 5:  // este case es para resolver la desviacion estandar
                                    operaciones2 = 5;
                                    break;
                            }

                        } while (operaciones2 != 6);
                        System.out.println("usted a elejido regresar al menu principal");
                        break;

                    case 4: //calculo de una matriz
                        opciones = 4;

                        Scanner menu5 = new Scanner(System.in);

                        int operaciones3;
                        double numero5 = 0;

                        do {
                            System.out.println("***CALCULO***");
                            System.out.println("1. matriz");
                            System.out.println("2. salir");
                            System.out.println("-----Ingrese una opcion-----");
                            operaciones3 = menu5.nextInt();

                        } while (operaciones3 != 2);
                        System.out.println("usted a elejido regresar al menu principal");
                        break;

                }
            }
        } while (opciones != 5);
        System.out.println("usted a elegido regresar al menu principal");

    }
}

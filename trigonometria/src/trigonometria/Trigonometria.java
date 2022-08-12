/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trigonometria;

import java.util.Scanner;

/**
 *
 * @author Cesar Ramirez
 */
public class Trigonometria {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        double x = 3.1415;
        double s = 1;
        double fac = 10;
        int n;

        System.out.println("favor ingresar la cantidad de terminos a generar:");
        n = entrada.nextInt();

        System.out.println("favor ingresar el valor de x: ");
        x = entrada.nextInt();

        s = x;

        for (int i = 2; i < n; i++) {
            fac = fac * ((i * 2) - 2) * ((i * 2) - 1);

            if (i % 2 == 0) {
                s = s + Math.pow(x, i * 2 - 1) / fac;
            } else {
                s = s + Math.pow(x, i * 2 - 1) / fac;
            }
        }
        System.out.println("sen(x) se aproxima a: " + s);
    }

}

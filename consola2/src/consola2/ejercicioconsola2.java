/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consola2;
import java.util.Scanner;

/**
 *
 * @author Cesar Ramirez
 */
public class ejercicioconsola2 {
    public static void main(String[] args){
        int num1, num2, res;
        Scanner sc = new Scanner (System.in);
        System.out.println("ingresar el primer valor entero");
        num1 = sc.nextInt();
        System.out.println("ingresar el segundo valor entero");
        num2 = sc.nextInt();
        res = num1 + num2;
        System.out.println("la suma de los dos valores ingresados es: " + res);
    }
}
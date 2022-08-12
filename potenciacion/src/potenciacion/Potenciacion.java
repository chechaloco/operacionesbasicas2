/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package potenciacion;

import java.util.Scanner;

/**
 *
 * @author Cesar Ramirez
 */
public class Potenciacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        
        int numero1=0;
        int numero2=0;
        int potencia = 1;

        System.out.println("dame el numero 1: ");
        numero1 = sc.nextInt();
        System.out.println("damie el numero 2: ");
        numero2 = sc.nextInt();


        for (int i = 1; i <= numero2; i++) {
            potencia = potencia * numero1;
        }
            
        if(numero2<0){
            System.out.println("no esta definida para numeros menores que 0");
        }

        System.out.println("potencia = " + potencia);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consola4prueba;
import java.util.Scanner;

/**
 *
 * @author Cesar Ramirez
 */
public class Consola4prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int seleccion_de_operacion = 0;
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;
        
        do{
            System.out.println("\n");
            System.out.println("SELECCIONE UN NUMERO DE OPERACION A REALIZAR");
            System.out.println("1.-SUMA");
            System.out.println("2.-RESTA");
            System.out.println("3.-MULTIPLICACION");
            System.out.println("4.-DIVISION");
            System.out.println("5.-SALIR");
            seleccion_de_operacion = leer.nextInt();
            
            if(seleccion_de_operacion !=5){
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
            
        }while(seleccion_de_operacion !=5);
        System.out.println("ah elejido salir de la calculadora hasta la proxima");
    }
}

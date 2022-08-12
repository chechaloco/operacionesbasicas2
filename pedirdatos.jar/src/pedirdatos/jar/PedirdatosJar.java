/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedirdatos.jar;
import java.util.Scanner;

/**
 *
 * @author Cesar Ramirez
 */
public class PedirdatosJar {

    /**
     * @param args the command line arguments
     */
         public static void main(String[] args) {
        
        Scanner dato1 = new Scanner(System.in);
        
        String nombre;
        System.out.println("Escribe tu nombrr");
        if(dato1.hasNextLine()) {
            nombre = dato1.nextLine();
            System.out.println("hola: " + nombre);
        }
        
        Scanner dato2 = new Scanner(System.in);
        
        int edad;
        System.out.println("escebie tu edad");
        if(dato2.hasNextInt()) {
            edad = dato2.nextInt();
            System.out.println("edad: " + edad);
        }else{
            System.out.println("no es una edad");
        }
    }
}
   
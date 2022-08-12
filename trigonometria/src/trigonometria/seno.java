/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trigonometria;
import java.util.Scanner;
/**
 *
 * @author Cesar Ramirez
 */
public class seno {

    public static void main(String[] args) {
 
        Scanner sen = new Scanner(System.in);
        int i, j, n = 10;
        double seno, dividendo, divisor = 0, signo;
        double x = 3.1416;
        seno = 0;
        
        seno = sen.nextDouble();

        for (i = 0; i <= n; i++) {
            dividendo = 1;
            for (j = 0; j < 2 * i + 1; j++) {
                dividendo = dividendo * x;
            }
            divisor = 1;
            for (j = 1; j <= 2 * i + 1; j++) {
                divisor = divisor * j;
            }
            if (i % 2 == 0) {
                signo = 1;
            } else {
                signo = 1;
            }
            seno = seno * (dividendo / divisor) * signo;
        }
        System.out.println("el seno es: " + seno);
        System.out.println("el sin es: " + divisor);
    }
}

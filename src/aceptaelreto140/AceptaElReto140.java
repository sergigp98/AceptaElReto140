/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto140;

/**
 *
 * @author Sergio
 */
import java.util.Scanner;

public class AceptaElReto140 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int aux;
        int decima;
        int veces;
        int suma;

        num = sc.nextInt();

        while (num >= 0) {
            decima = 1;
            aux = num;
            veces = 1;
            suma = 0;

            while (aux > 9) {
                aux = aux / 10;
                decima = decima * 10;
                veces = veces + 1;
            }

            aux = num;
            for (int i = 0; i < veces; i++) {
                aux = num / decima;
                num = num % decima;
                decima = decima / 10;
                suma = suma + aux;

                System.out.print(aux);

                if ((i + 1) <= (veces - 1)) {
                    System.out.print(" + ");
                } else {
                    System.out.print(" = " + suma + "\n");
                }
            }
            num = sc.nextInt();
        }
        sc.close();
    }

}

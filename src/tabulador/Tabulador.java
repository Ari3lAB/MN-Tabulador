package tabulador;

import java.util.Scanner;

/**
 *
 * @author Ariel AB
 */
public class Tabulador {

    private int limSup = 0;
    private int limInf = 0;
    private int increm = 0;
    Scanner keyboard = new Scanner(System.in);

    private void tabula(int limSup, int limInf, int increm) {
        if (limInf >= limSup) {
            System.out.println("Valores de entrada invalidos");
            return;
        }

        System.out.println("---- ----");
        while (limInf <= limSup) {
            float fx = f(limInf);
            System.out.print("x= ");
            System.out.printf("%03d", limInf);
            System.out.print(" ║ y= ");
            System.out.printf("%.4f", fx);
            System.out.println("\n---- ----");
            limInf = limInf + increm;
        }
    }
//printf ("%.2f", 3.14159)

    private float f(float x) {
        float y = 0;

        y = (float) (((-12 * (Math.pow(x, 5))) - (6.4 * (Math.pow(x, 3))) + 12));
        return y;
    }

    public void main() {
        System.out.println("Ingrese el limite inferior:");
        this.limInf = keyboard.nextInt();
        System.out.println("Ingrese el limite superior:");
        this.limSup = keyboard.nextInt();
        System.out.println("Ingrese el incremento:");
        this.increm = keyboard.nextInt();
        tabula(limSup, limInf, increm);
    }

}

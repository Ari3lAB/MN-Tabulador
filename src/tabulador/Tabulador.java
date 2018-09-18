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

    private void tabula(int limSup, int limInf, int increm) {                   //Método tabulador
        if (limInf >= limSup || !(increm > 1) || limInf == limSup) {
            System.out.println("Valores de entrada invalidos");
            return;
        }

        System.out.println("--------\t--------");
        while (limInf <= limSup) {
            float fx = f(limInf);
            System.out.print("x= ");
            System.out.printf("%03d", limInf);
            System.out.print(" ║ y= ");
            System.out.printf("%.4f", fx);
            System.out.println("\n--------\t--------");
            limInf = limInf + increm;
        }
    }

    private float f(float x) {
        float y;

        y = (float) (((-12 * (Math.pow(x, 5))) - (6.4 * (Math.pow(x, 3))) + 12)); //Ecuacion
        return y;
    }

    public void main() {                                                        //Metodo principal
        System.out.println("Ingrese el limite inferior:");
        this.limInf = keyboard.nextInt();
        System.out.println("Ingrese el limite superior:");
        this.limSup = keyboard.nextInt();
        System.out.println("Ingrese el incremento:");
        this.increm = keyboard.nextInt();
        tabula(limSup, limInf, increm);
    }

}

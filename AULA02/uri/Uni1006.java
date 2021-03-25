package uri;

import java.util.Scanner;

public class Uni1006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double notaA, notaB, notaC, media;

        System.out.println("Digite a primeira nota");
        
        notaA = entrada.nextDouble();

        System.out.println("Digite a primeira nota");

        notaB = entrada.nextDouble();

        System.out.println("Digite a primeira nota");

        notaC = entrada.nextDouble();

        media = (notaA * 2 + notaB * 3 + notaC * 5 ) / 10;

        System.out.printf("MEDIA = %.1f\n" , media);

        entrada.close();
             

    }
    
}

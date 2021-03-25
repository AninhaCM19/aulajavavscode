package uri;

import java.util.Scanner;

public class Uni1003 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, soma;

        System.out.println("Digite um número:");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();

        soma = n1 + n2;

        System.out.println("SOMA = " + soma);

        teclado.close(); 
 
    }

}

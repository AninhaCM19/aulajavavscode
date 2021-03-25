package uri;

import java.util.Scanner;

/**
 * Uri1010
 */
public class Uri1010 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor1, valor2;
        float preco1, preco2, total;
        entrada.nextInt();
        valor1 = entrada.nextInt();
        preco1 = entrada.nextFloat();
        entrada.nextInt();
        valor2 = entrada.nextInt();
        preco2 = entrada.nextFloat();

        total = (valor1 * preco1) + (valor2 * preco2);
        System.out.printf("Valor a pagar: R$ %.2f\n" , total);
        entrada.close();

    }
}
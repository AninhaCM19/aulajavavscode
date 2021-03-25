package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cont, numero, soma;
        cont = 1;
        soma = 0;
        numero = 1;

        while ( numero != 0) { //!= significa diferente
            System.out.printf("Digite o %dº numero (0 = fim): ", cont);
            numero = teclado.nextInt();
            soma = soma + numero;
            cont ++;

        }
        System.out.println("Soma = " + soma);
        teclado.close();
    }
    
}

package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, pares;

        final int QTIDADE_NUMEROS = 10;

        pares = 0;
        
        for(int i = 1; i <= QTIDADE_NUMEROS ; i++){
            System.out.println("Digite o " + i + "º número: ");
            numero = teclado.nextInt();
            if(numero % 2 == 0) {
                pares++;
            }
        }
        System.out.println("O total de pares é: " + pares);
        System.out.println("O total de impares é: " + (QTIDADE_NUMEROS - pares));

        teclado.close();
        
    }
    
}

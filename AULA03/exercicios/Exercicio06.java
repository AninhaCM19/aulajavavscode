package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, pares, somaPares;

        final int Qtde_Numeros = 10;

        pares = 0;
        somaPares = 0;

        for(int i = 1; i <= Qtde_Numeros ; i++){
            System.out.println("Digite o " + "º numero: ");
            numero = entrada.nextInt();
            
            if(numero % 2 == 0) {
                pares++;
                somaPares = somaPares + numero;

            }
        }
        System.out.println("A media dos pares: " + (double)somaPares / pares);
        System.out.println("Porcentagem de impares: " + ((double)(Qtde_Numeros - pares) / Qtde_Numeros) * 100 + " %");
        entrada.close();
    }
    
}

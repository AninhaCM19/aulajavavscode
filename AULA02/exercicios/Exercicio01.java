package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        int valor;

        System.out.println("Digite um valor inteiro");

        valor = teclado.nextInt();

        if (valor > 20) {
            System.out.println("Metade = " + ((double)valor /2));
        }
        
        teclado.close();  
    }           
   
}

package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

    try{    
        System.out.println("Digite um valor inteiro:");
        numero = entrada.nextInt();

        System.out.println("Voce digitou " + numero);
       
    } catch (InputMismatchException ex) {
        System.out.println("Digitação Invalida.");
    }
    System.out.println("Final");
    
    entrada.close();
    }
    
}

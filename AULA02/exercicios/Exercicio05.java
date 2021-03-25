package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String senha;
        final String SENHA_CORRETA = "R10p5";

    System.out.println("Digite a sua senha:");
    senha = teclado.nextLine();

        if (senha.equals(SENHA_CORRETA)) {
            System.out.println("acesso concedido");

    } else {
        System.out.println("acesso negado");
    }    
    
}
}

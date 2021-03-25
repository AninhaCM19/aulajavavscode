package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do salário e o valor da prestação:");
        double salario, prestação;

        salario = input.nextDouble();

        prestação = input.nextDouble();

        if (prestação < (salario * 0.3)) {
            System.out.println("Emprestimo concedido");

    } else {
        System.out.println("Emprestimo negado");
    }
    input.close();

    
}
}


package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cont, limite;

        System.out.println("Informe o valor do n(limite)");
        limite = entrada.nextInt();

        cont = 1;

        while (cont <= limite){
            if(cont==1){
            System.out.print(cont);
            } else {
                System.out.print(", " + cont);
            } 
            cont = cont * 2;

        entrada.close();
        
        }
    }
    
}

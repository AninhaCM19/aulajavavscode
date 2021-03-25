package AULA02.uri;

import java.util.Scanner;

public class Uri1018 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int v1, resto, n100, n50, n20, n10, n5, n2, n1;

        v1 = entrada.nextInt();
        System.out.println(v1);

        n100 = v1 / 100;

        resto = v1 % 100;

        System.out.printf("%d nota(s) de R$ 100,00\n" , n100);

        v1 = resto;
        n50 = v1 / 50;
        resto = v1 % 50;

        System.out.printf("%d nota(s) de R$ 50,00\n" , n50);

        v1 = resto;
        n20 = v1 / 20;
        resto = v1 % 20;

        System.out.printf("%d nota(s) de R$ 20,00\n" , n20);

        v1 = resto;
        n10 = v1 / 10;
        resto = v1 % 10;

        System.out.printf("%d nota(s) de R$ 10,00\n" , n10);
        
        v1 = resto;
        n5 = v1 / 5;
        resto = v1 % 5;

        System.out.printf("%d nota(s) de R$ 5,00\n" , n5);

        v1 = resto;
        n2 = v1 / 2;
        resto = v1 % 2;

        System.out.printf("%d nota(s) de R$ 2,00\n" , n2);

        v1 = resto;
        n1 = v1 / 1;
        resto = v1 % 1;

        entrada.close();
        
    }
    
}

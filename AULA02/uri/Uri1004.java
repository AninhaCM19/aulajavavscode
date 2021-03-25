package uri;

import java.util.Scanner;

public class Uri1004 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, prod;
         
        //System.out.println("Digite um numero");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();

        prod = n1 * n2;

        System.out.println("PROD = " + prod);

        entrada.close();
        }
    }
    


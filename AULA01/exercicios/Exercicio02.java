package AULA01.exercicios;

import java.util.Scanner;

public class Exercicio02 {
 public static void main(String[] args) {
   //entrada ler 2 notas (scanner com 2 variaveis)
   //processamento calcular a media
   //saida exibir media
   
   Scanner entrada = new Scanner(System.in);
   double nota1, nota2, media;

    System.out.println("Digite a 1ª nota");
    nota1 = entrada.nextDouble();
    System.out.println("Digite a 2ª nota");
    nota2 = entrada.nextDouble();

    media = (nota1 + nota2) / 2;

    entrada.close();
    

    System.out.println("Media = " + media);
    
 }   
}

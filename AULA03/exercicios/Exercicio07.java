package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int Numero_Turmas = 2;
        final int Numero_Alunos = 2;
        double mediaAluno, mediaTurma, mediaGeral;

        mediaGeral = 0;

        for(int turma = 1; turma <= Numero_Turmas; turma++){
            System.out.println("\nTurma " + turma);
            mediaTurma = 0;
            
            for (int aluno =1; aluno <= Numero_Alunos; aluno++) {
                System.out.println("Digite a media do aluno: " + aluno);
                mediaAluno = entrada.nextDouble();
                mediaTurma = mediaTurma + mediaAluno;
                
            }
            mediaTurma = mediaTurma / Numero_Turmas;
            System.out.println("Media de turma: " + mediaTurma);
            mediaGeral = mediaGeral + mediaTurma;
        }
        mediaGeral = mediaGeral / Numero_Turmas;
        System.out.println("Media das turmas: " + mediaGeral);
        entrada.close();
    }
    
}


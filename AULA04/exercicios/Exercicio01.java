package exercicios;

public class Exercicio01 {
    public static void main(String[] args) {
        int numero;
        String retornoTexto;

        numero = 10;

        retornoTexto = verificaParImpar(numero);
        System.out.println(retornoTexto);

    }

    static String verificaParImpar (int numero) {
        if (numero % 2 == 0){
            return "O numero é par ";

        } else { //caso contrario
            return "O número é impar";

        }
    
    }
    
}

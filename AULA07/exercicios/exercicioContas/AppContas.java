package exercicios.exercicioContas;

import java.util.ArrayList;
import java.util.Scanner;

public class AppContas {
    public static void main(String[] args) {
        GerenciaContas_old contas = new GerenciaContas_old();
        
        Scanner teclado = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double limite;
        double valor;

        //Conta c = new ContaCorrente(123);
        //Conta c1 = new ContaPoupanca(123);
        //Conta c2 = new ContaEspecial(123, 1000);

        ArrayList<Conta> listaContas = new ArrayList<>();

        do {
            System.out.println("1- nova conta corrente");
            System.out.println("2- nova conta especial");
            System.out.println("3- nova conta poupanca");
            System.out.println("4- Deposito");
            System.out.println("5- Saque");
            System.out.println("6- Consultar Saldo");
            System.out.println("7- Sair");
            System.out.print("Opcao: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o numero da conta: ");
                    numeroConta = teclado.nextInt();
                    contas.novaContaCorrente(numeroConta);                                 
                    break;
            
                case 2:
                    System.out.println("Informe o numero da conta: ");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o limite da conta: ");
                    limite = teclado.nextDouble();
                    contas.novaContaCorrente(numeroConta, limite);  
                    break;
                
                case 3:
                    System.out.println("Informe o numero da conta: ");
                    numeroConta = teclado.nextInt();
                    contas.novaContaCorrente(numeroConta);  
                    break;

                case 4:
                System.out.println("Informe o numero da conta: ");
                numeroConta = teclado.nextInt();
                System.out.println("Qual o valor? ");
                valor = teclado.nextDouble();
                for (Conta conta : listaContas){
                    if(conta.getNumero() == numeroConta){
                        if(conta.deposito(valor)){
                            System.out.println("Operação realizada");
                        }
                    }else{
                        System.out.println("Falha na operação.");
                    }
                    break;
                }

                case 5:
                System.out.println("Informe o numero da conta: ");
                numeroConta = teclado.nextInt();
                System.out.println("Qual o valor? ");
                valor = teclado.nextDouble();
                for (Conta conta : listaContas){
                    if(conta.getNumero() == numeroConta){
                        if(conta.saque(valor)){
                            System.out.println("Operação realizada");
                        }
                    }else{
                        System.out.println("Falha na operação.");
                    } 
                }    
                    
                case 6:
                    System.out.println("Informe o numero da conta: ");
                    numeroConta = teclado.nextInt();
                    for(Conta conta : listaContas){
                        if(conta.getNumero() == numeroConta);
                        break;
                    }
                break;

                case 7:
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;

            }
        }
         while( opcao != 7) ;

         teclado.close();

        //System.out.println("\nConta Corrente\n" + cc);
        //cc.deposito(100);
        //System.out.println(cc);
        //cc.saque(50);
        //System.out.println(cc.getSaldo());
        //if (cc.saque(500)) {
          //  System.out.println("Novo Saldo: " + cc.getSaldo());
        //} else {
        //    System.out.println("Operacao Negada");
       
        //System.out.println("\nConta Especial\n" + ce);
        //ce.deposito(100);
        //System.out.println(ce);
        //ce.saque(50);
        //System.out.println(ce);
        //if (ce.saque(500)) {
        //    System.out.println("Novo Saldo: " + ce.getSaldo());
        //} else {
        //    System.out.println("Operacao Negada");
        //}
    
        //System.out.println("\nConta Poupanca\n" + cp);
        //cp.deposito(100);
        //System.out.println(cp);
        //cp.saque(50);
        //System.out.println(cp);
        //ContaPoupanca.setTaxa(2);
        //if (cp.saque(30)) {
        //    System.out.println("Novo Saldo: " + cp.getSaldo());
        //} else {
        //    System.out.println("Operacao Negada");
        //}
    
    }
}

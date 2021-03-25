package exercicios.exercicioContas;

import java.util.HashMap;

public class GerenciaContas {
    private HashMap<Integer, Conta> hashContas;

    private GerarNumero gerarNumero;


    public GerenciaContas(){
        hashContas = new HashMap<>();
        gerarNumero = new GerarNumero();
    }
    
    public int novaContaCorrente() {
        int numeroConta = gerarNumero.proximo();
        hashContas.put(numeroConta, new ContaCorrente(numeroConta));
        return numeroConta;
                
    }
    public void novaContaEspecial(int numeroConta, double limite) {
        hashContas.put(numeroConta, new ContaEspecial(numeroConta, limite));    
    }
    public void novaContaPoupanca(int numeroConta) {
        hashContas.put(numeroConta, new ContaPoupanca(numeroConta));
    }
    
    public boolean depositar(int numeroConta, double valor){
        Conta contaEncontrada = hashContas.get(numeroConta);
        if (contaEncontrada != null){
            if (contaEncontrada.deposito(valor)){
                return true;
            }else{
                return false;
            }
        }
    return false;

}    

    public boolean sacar(int numeroConta, double valor){
        Conta contaEncontrada = hashContas.get(numeroConta);
        if (contaEncontrada != null){
            if (contaEncontrada.saque(valor)){
                return true;
            }else{
                return false;
            }
        }    
    return false;
    }
}   

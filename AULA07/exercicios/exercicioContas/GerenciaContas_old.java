package exercicios.exercicioContas;

import java.util.ArrayList;

public class GerenciaContas_old {
    private ArrayList<Conta> listaContas;
    
    public GerenciaContas_old(){
        listaContas = new ArrayList<>();        
    }

    public void novaContaCorrente(int numeroConta){
        listaContas.add(new ContaCorrente(numeroConta));  
    }
    public void novaContaEspecial(int numeroConta, double limite){
        listaContas.add(new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupança(int numeroConta){
        listaContas.add(new ContaCorrente(numeroConta));  
    }

    public void novaContaCorrente(int numeroConta, double limite) {
    }
    
}
    

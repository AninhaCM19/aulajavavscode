package exercicios.exercicioContas;

public class ContaCorrente extends Conta{ 
    final double TAXA_DEPOSITO = 0.1;

    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public boolean saque(double valor) {
        if ( getSaldo() >= valor) {
        super.saque(valor);
        return true;
        } 
        return false;
    }

    @Override
    public boolean deposito(double valor) {
        return super.deposito(valor - TAXA_DEPOSITO);
    }
}

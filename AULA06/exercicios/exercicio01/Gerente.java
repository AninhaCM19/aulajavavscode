import exemplo01.Gerente;

public class Gerente extends Funcionario {
    private int numeroFuncionarios;
    
    public Gerente(String nome, double salario, int funcionarios) {
        super(nome, salario);
        numeroFuncionarios = funcionarios;
    }

    @Override
    public String exibir(){
        return super.exibir() + numeroFuncionarios;
    }
    
    @Override
    public void calculaNovoSalario(double porc){
        super.calculaNovoSalario(porc + 20);
    }
}

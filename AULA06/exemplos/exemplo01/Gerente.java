package exemplo01;

public class Gerente extends Funcionario {
    private int numeroFuncionarios;

    public Gerente(String nome, double salario, int funcionarios) {
        super(nome, salario);
        numeroFuncionarios = funcionarios;
    }
    
}

package exemplo01;

public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = 0;
    }

    public Funcionario(){
        
    }

    public String exibir(){
        return nome + " : " + salario;
    }
    
}

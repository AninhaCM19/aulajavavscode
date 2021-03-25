public class Funcionario {
  private String nome;
  private double salario;

  public Funcionario(String nome, double salario){
      this.nome = nome;
      this.salario = salario;

  }
  
  public void calculaNovoSalario(double porc){
      salario = salario + salario * (porc / 100);
  }

  public String exibir(){
      return nome + " : " + salario;
      
  }
}

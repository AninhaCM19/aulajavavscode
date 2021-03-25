package exercicios.Exercicio01;

public class Animal {
    private String nome, raca;
    private int ano;
    private Proprietario proprietario;

    public Animal(String nomeAnimal, String raca, int ano, String nomePropretario, String telefone){
        this.nome = nomeAnimal;
        this.raca = raca;
        this.ano = ano;
        proprietario = new Proprietario(nomePropretario, telefone);
            
    }

    public Animal(String nomeAnimal, String raca, int ano, Proprietario prop) {
        

    }

    
    
}

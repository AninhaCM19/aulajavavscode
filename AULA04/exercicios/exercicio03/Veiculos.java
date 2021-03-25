package exercicios.exercicio03;

public class Veiculos {
    String modelo, marca;
    double consumo;

    Veiculos(String modelo, String marca, double consumo){
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }
    void exibir(){
        System.out.println("Modelo: " + modelo + "Marca: " + marca);
    }
    double obterConsumo();
       return consumo;           
}

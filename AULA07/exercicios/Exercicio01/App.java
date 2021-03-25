package exercicios.Exercicio01;

public class App {
    public static void main(String[] args) {
        Animal a1 = new Animal("Cookie", "Golden", 2000, "Alessandra", "11984277627");
        System.out.println(a1);

        Proprietario prop = new Proprietario("Alessandra", "11984277627");
        Animal a2 = new Animal("Cookie", "Golden", 2000, prop);

        System.out.println(a2);
    }
    
}

package exemplos.Exemplo04;

public class AppRobo {
    public static void main(String [] args) {
        Robo robo = new Robo();

        robo.norte();
        System.out.println("Posição Y atual: " + robo.getY());
        
    }
    
}

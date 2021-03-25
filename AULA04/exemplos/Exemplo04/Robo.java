package exemplos.Exemplo04;

public class Robo {
    private int x, y;

    public void norte() {
        y++;
    }
    
    public int getY() {
        return y;
    }

    public void setY(int novoY) {
        y = novoY;        
    }
}
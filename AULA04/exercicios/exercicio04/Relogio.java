package exercicios.exercicio04;

public class Relogio {
    private int hora, minuto, segundo;

    Relogio(int hora, int minuto, int segundo){
        if((hora >= 0) && (hora < 24)){
            this.hora = hora;
        }
        if((minuto >= 0) && (minuto < 60)){
            this.minuto = minuto;
        }
        if((segundo >= 0) && (segundo < 60)){
            this.segundo = segundo;
        }
        gethour(){
            System.out.printf("Hora Atual: %2d:%2d:%2d\n" , hora);
        }

    }
    
}

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void mudarCanalCima(){
        if (ligada && canal < 50) {
            canal++;
        }
    }

    public void mudarCanalBaixo(){
        if (ligada && canal > 1) {
            canal--;
        }
    }

    public void mudarCanal(int novoCanal){
        if (ligada && novoCanal < 50 || novoCanal > 0) {
            canal = novoCanal;
        }
    }

    public void aumentarVolume(){
        if (ligada && volume > 25) {
            volume++;
        }  
    }

    public void diminuirVolume(){
        if (ligada && volume > 0) {
            volume--;
        } 
    }
}
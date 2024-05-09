public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        // Teste para ligar a TV
        smartTv.ligar();
        System.out.println("\nStatus da TV: " + smartTv.ligada);

        //Status atual da TV após ligada
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        // Teste para desligar a TV
        // smartTv.desligar();
        // System.out.println("\nStatus da TV: " + smartTv.ligada);

        // Teste para mudar o canal para cima
        smartTv.mudarCanalCima();
        System.out.println("Canal atual: " + smartTv.canal);

        // Teste para mudar o canal para baixo
        smartTv.mudarCanalBaixo();
        System.out.println("Canal atual: " + smartTv.canal);

        // Teste para mudar o canal para um valor específico
        smartTv.mudarCanal(10);
        System.out.println("Canal atual: " + smartTv.canal);

        // Teste para diminuir o volume
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        // Teste para aumentar o volume
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        
    }
}

public class WAVPlayer implements FormatoAudio{
    
    
    public void play(){
    }
    
    public void stop(){
    }
    
    public int forward(int position){
        return position;
    }
    
    public int reward(int position){
        return position;
    }

    @Override
    public void reproduzir() {
        System.out.println("Reprodução iniciada");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void parar() {
        System.out.println("Música parada");
    }

    @Override
    public void liberar() {
        System.out.println("Você iniciou a música que estava pausada");
    }

    @Override
    public void abrir(String file) {
        System.out.println("Você avançou 15s");
    }

    @Override
    public void avancar(int time) {
        System.out.println("Você avançou 15s");
    }

    @Override
    public void retornar(int time) {
        System.out.println("Você retornou 15s");
    }
}

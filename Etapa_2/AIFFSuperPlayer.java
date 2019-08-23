public class AIFFSuperPlayer implements FormatoAudio{
    
    private String cursor;
    private boolean playing;
    
    public void play(){
        System.out.println("Você começou a ouvir a música em AIFF");
    }
    
    public void stop(){
        System.out.println("Você parou a música");
        this.playing = false;
    }
    
    public void pause(){
        System.out.println("Você pausou a música");
    }
    
    public void release(){
        System.out.println("A música foi atualizada");
    }

    public void setCursor(String cursor) {
        System.out.println("Cursor alterado");
        this.cursor = cursor;
    }

    public AIFFSuperPlayer(String cursor) {
        this.cursor = cursor;
    }

    @Override
    public void abrir(String file) {
        System.out.println("Você abrirá o arquivo chamado " + file);
        reproduzir();
    }

    @Override
    public void reproduzir() {
        System.out.println("Você iniciou a música");
        this.playing = true;
        play();
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
    public void avancar(int time) {
        System.out.println("Você avançou 15s");
    }

    @Override
    public void retornar(int time) {
        System.out.println("Você retornou 15s");
    }
}

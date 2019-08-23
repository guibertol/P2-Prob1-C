public class WMAPlay implements FormatoAudio{
    
    private String file;
    private int location;
    private boolean playing;
    
    public void open(){
        System.out.println("O música foi aberta!");
    }
    
    public void play(){
        System.out.println("O música foi iniciada");
    }
    
    private void stop(){
        System.out.println("O música foi interrompida");
        this.playing = false;
    }

    public String getFile() {
        System.out.println("Você pegou a música");
        return file;
    }

    public void setFile(String file) {
        System.out.println("Você alterou o nome do arquivo");
        this.file = file;
    }

    public int getLocation() {
        System.out.println("Você pegou a localização");
        return location;
    }

    public void setLocation(int location) {
        System.out.println("Você definiu a localização");
        this.location = location;
    }

    public WMAPlay(String file, int location) {
        System.out.println("A música .WMA foi iniciada");
        this.file = file;
        this.location = location;
        
    }

    @Override
    public void abrir(String file) {
        System.out.println("Você abriu o arquivo " + file);
        play();
    }

    @Override
    public void reproduzir() {
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
        this.playing = false;
            
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

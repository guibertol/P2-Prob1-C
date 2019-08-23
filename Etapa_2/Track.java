public class Track implements FormatoAudio{
        
    private WAVPlayer wav;
    private WMAPlay wma;
    private AACPlayer aac;
    private MP3DJ mp3dj;

    public Track(WAVPlayer wav, WMAPlay wma, AACPlayer aac, MP3DJ mp3dj) {
        this.wav = wav;
        this.wma = wma;
        this.aac = aac;
        this.mp3dj = mp3dj;
    }
    
    public WAVPlayer getWav() {
        return wav;
    }

    public void setWav(WAVPlayer wav) {
        this.wav = wav;
    }

    public WMAPlay getWma() {
        return wma;
    }

    public void setWma(WMAPlay wma) {
        this.wma = wma;
    }
    
    public void iniciarMp3(){
    }
    
    public void abrir() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void reproduzir() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void pausar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void parar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void avancar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void retornar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void liberar() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void abrir(String file) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void avancar(int time) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void retornar(int time) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}

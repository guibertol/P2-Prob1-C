public class WMAPlay implements FormatoAudio{
    
    private String file;
    private int location;
    
    public void open(){
    }
    
    public void play(){
    }
    
    private void stop(){
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public WMAPlay(String file, int location) {
        this.file = file;
        this.location = location;
    }
    
}

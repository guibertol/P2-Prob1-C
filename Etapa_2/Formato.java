public class Formato{
    
    public void abrir(String file) {
        System.out.println("Você abriu a musica: " + file);
    }
    
    public void play(){
        System.out.println("Música iniciada");
    }
    
    public void pausar() {
        System.out.println("Música pausada");
    }
    
    public void stop() {
        System.out.println("Música finalizada");
    }
    
    public void avancar(int time) {
        System.out.println("Você avançou "+time + "s");
    }

    public void retornar(int time) {
        System.out.println("Você retornou " + time + "s");
    }
    
}

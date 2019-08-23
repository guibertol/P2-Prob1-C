public interface FormatoAudio {
    
    void abrir(String file);
    void reproduzir();
    void pausar();
    void parar();
    void avancar(int time);
    void retornar(int time);
    void liberar();
    
}

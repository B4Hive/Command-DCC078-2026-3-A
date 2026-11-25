package b4hive;

public class Luminaria {
    private boolean ligada;

    public boolean isLigada() {
        return ligada;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
}

package b4hive;

public class DesligarLuminariaComando implements Comando {
    private final Luminaria luminaria;

    public DesligarLuminariaComando(Luminaria luminaria) {
        this.luminaria = luminaria;
    }

    @Override
    public void executar() {
        luminaria.desligar();
    }

    @Override
    public void cancelar() {
        luminaria.ligar();
    }
}

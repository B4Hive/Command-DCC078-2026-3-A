package b4hive;

public class LigarLuminariaComando implements Comando {
    private final Luminaria luminaria;

    public LigarLuminariaComando(Luminaria luminaria) {
        this.luminaria = luminaria;
    }

    @Override
    public void executar() {
        luminaria.ligar();
    }

    @Override
    public void cancelar() {
        luminaria.desligar();
    }
}

package b4hive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ControleRemotoTest {
    private ControleRemoto controle;
    private Luminaria luminaria;

    @BeforeEach
    void setUp() {
        controle = new ControleRemoto();
        luminaria = new Luminaria();
    }

    @Test
    void deveLigarLuminaria() {
        controle.executarComando(new LigarLuminariaComando(luminaria));

        assertTrue(luminaria.isLigada());
    }

    @Test
    void deveDesligarLuminaria() {
        luminaria.ligar();

        controle.executarComando(new DesligarLuminariaComando(luminaria));

        assertFalse(luminaria.isLigada());
    }

    @Test
    void deveCancelarUltimoComando() {
        controle.executarComando(new LigarLuminariaComando(luminaria));
        controle.executarComando(new DesligarLuminariaComando(luminaria));

        controle.cancelarUltimoComando();

        assertTrue(luminaria.isLigada());
    }

    @Test
    void cancelarSemComandosNaoAlteraLuminaria() {
        controle.cancelarUltimoComando();

        assertFalse(luminaria.isLigada());
    }
}

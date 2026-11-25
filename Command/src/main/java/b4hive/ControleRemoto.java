package b4hive;

import java.util.ArrayList;
import java.util.List;

public class ControleRemoto {
    private final List<Comando> comandos = new ArrayList<>();

    public void executarComando(Comando comando) {
        comandos.add(comando);
        comando.executar();
    }

    public void cancelarUltimoComando() {
        if (!comandos.isEmpty()) {
            Comando comando = comandos.remove(comandos.size() - 1);
            comando.cancelar();
        }
    }
}

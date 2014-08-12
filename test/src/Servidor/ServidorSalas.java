package Servidor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 *
 * @author Luma
 */
@RunWith(JUnit4.class)
public class ServidorSalas {

    /**
     * Classe de Teste para o Servidor Professor.
     */
    @Test
    /**
     * Testando
     */
    public final void inserindoBanco() {
        SGDB.Salas salas = new SGDB.Salas();
        assertEquals("Teste de retorno insercao certa", 0,
                salas.inserir("Lab2221", "20",
                        "Nenhum recurso", "DAFIS", "42"));
    }

    @Test
    public final void editandoBanco() {
        SGDB.Salas salas = new SGDB.Salas();
        assertEquals("Teste de retorno edicao certa", 0,
                salas.editar("1", "Lab2221", "20",
                        "Nenhum recurso", "DAFIS", "42"));
    }

    @Test
    public final void detetandoBanco() {
        SGDB.Salas salas = new SGDB.Salas();
        assertEquals("Teste de retorno delecao certa", 0,
                salas.deletar("1"));
    }
}

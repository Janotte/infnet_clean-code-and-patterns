import com.exemplo.patterns.proxy.contatos.ContatosXMLProxy;
import com.exemplo.patterns.proxy.repositorio.Contatos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContatosXMLTest {

    @Test
    void deveRetornarUmContato() {
        Contatos contatos = new ContatosXMLProxy("contatos1.xml", "contatos2.xml", "contatos3.xml");
        String nome = contatos.buscarPorEmail("ozires@exemplo.com");

        assertEquals("Ozires Borges", nome);
    }

    @Test
    void deveRetornarNull() {
        Contatos contatos = new ContatosXMLProxy("contatos1.xml", "contatos2.xml", "contatos3.xml");
        String nome = contatos.buscarPorEmail("bruna@exemplo.com");

        assertEquals(null, nome);
    }
}

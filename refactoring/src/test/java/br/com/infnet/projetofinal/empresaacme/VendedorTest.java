package br.com.infnet.projetofinal.empresaacme;

import br.com.infnet.projetofinal.empresaacme.builders.VendedorBuilder;
import br.com.infnet.projetofinal.empresaacme.modelos.GrupoSanguineo;
import br.com.infnet.projetofinal.empresaacme.modelos.Vendedor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VendedorTest {

    @Test
    void isPlatinumDeveRetornarVerdadeiroTest() {
        Vendedor vendedor = new VendedorBuilder()
                .comDadosPessoais("0002", "Nome do Vendedor", "Sobrenome", 5L, 1234L, GrupoSanguineo.A)
                .comEndereco("89.227-000", "Rua dos Engenheiros", "9999","Engenharia", "Novo Engenheiro")
                .comQuantidadeDeVendas(40L)
                .comCursos(1, "Excelência no atendimento a cliente")
                .comCursos(2, "Técnica Avançadas de Negociações")
                .comCursos(3, "A Arte de Conquistar Clientes")
                .comCursos(4, "Marketing Digital")
                .construir();

        assertTrue(vendedor.isPlatinum(true));
    }

    @Test
    void isPlatinumDeveRetornarFalsoQuandoQuantidadeDeVendasMenorOuIgual35Test() {
        Vendedor vendedor = new VendedorBuilder()
                .comDadosPessoais("0002", "Nome do Vendedor", "Sobrenome", 5L, 1234L, GrupoSanguineo.A)
                .comEndereco("89.227-000", "Rua dos Engenheiros", "9999","Engenharia", "Novo Engenheiro")
                .comQuantidadeDeVendas(35L)
                .comCursos(1, "Excelência no atendimento a cliente")
                .comCursos(2, "Técnica Avançadas de Negociações")
                .comCursos(3, "A Arte de Conquistar Clientes")
                .comCursos(4, "Marketing Digital")
                .construir();

        assertFalse(vendedor.isPlatinum(true));
    }

    @Test
    void isPlatinumDeveRetornarFalsoQuandoCursosMenorOuIgual3Test() {
        Vendedor vendedor = new VendedorBuilder()
                .comDadosPessoais("0002", "Nome do Vendedor", "Sobrenome", 5L, 1234L, GrupoSanguineo.A)
                .comEndereco("89.227-000", "Rua dos Engenheiros", "9999","Engenharia", "Novo Engenheiro")
                .comQuantidadeDeVendas(40L)
                .comCursos(1, "Excelência no atendimento a cliente")
                .comCursos(3, "A Arte de Conquistar Clientes")
                .comCursos(4, "Marketing Digital")
                .construir();

        assertFalse(vendedor.isPlatinum(true));
    }

    @Test
    void isPlatinumDeveRetornarFalsoQuandoMetaBatidaFalsoTest() {
        Vendedor vendedor = new VendedorBuilder()
                .comDadosPessoais("0002", "Nome do Vendedor", "Sobrenome", 5L, 1234L, GrupoSanguineo.A)
                .comEndereco("89.227-000", "Rua dos Engenheiros", "9999","Engenharia", "Novo Engenheiro")
                .comQuantidadeDeVendas(40L)
                .comCursos(1, "Excelência no atendimento a cliente")
                .comCursos(2, "Técnica Avançadas de Negociações")
                .comCursos(3, "A Arte de Conquistar Clientes")
                .comCursos(4, "Marketing Digital")
                .construir();

        assertFalse(vendedor.isPlatinum(false));
    }
}

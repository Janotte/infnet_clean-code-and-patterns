package br.com.infnet.projetofinal.empresaacme;

import br.com.infnet.projetofinal.empresaacme.builders.EngenheiroBuilder;
import br.com.infnet.projetofinal.empresaacme.modelos.Engenheiro;
import br.com.infnet.projetofinal.empresaacme.modelos.GrupoSanguineo;
import br.com.infnet.projetofinal.empresaacme.servicos.EngenheiroService;
import br.com.infnet.projetofinal.empresaacme.servicos.ValidaEngenheiro;
import br.com.infnet.projetofinal.empresaacme.servicos.ValidaEngenheiroImpl;
import org.junit.jupiter.api.Test;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EngenheiroTest {

    @Test
    void deveRetornarVerdadeiroTest() {
        List<ValidaEngenheiro> validaEngenheiros = Arrays.asList(new ValidaEngenheiroImpl());
        EngenheiroService service = new EngenheiroService(validaEngenheiros);
        Engenheiro engenheiro = new EngenheiroBuilder()
                .comDadosPessoais("0001", "Nome do Engenheiro", "Sobrenome", 3L, 1234L, GrupoSanguineo.O)
                .comEndereco("89.227-000", "Rua dos Engenheiros", "9999","Engenharia", "Novo Engenheiro")
                .comNumeroConselho("Abc122")
                .comQualificacoes(true, true, 8, true, 7)
                .construir();

        assertEquals(true,service.verificaQualificacoesParaTrabalhoFora(engenheiro));
    }
    @Test
    void deveRetornarFalsoQuandoFluenteInglesFalsoTest() {
        List<ValidaEngenheiro> validaEngenheiros = Arrays.asList(new ValidaEngenheiroImpl());
        EngenheiroService service = new EngenheiroService(validaEngenheiros);
        Engenheiro engenheiro = new EngenheiroBuilder()
                .comDadosPessoais("0001", "Nome do Engenheiro", "Sobrenome", 3L, 1234L, GrupoSanguineo.O)
                .comEndereco("89.227-000", "Rua dos Engenheiros", "9999","Engenharia", "Novo Engenheiro")
                .comNumeroConselho("Abc122")
                .comQualificacoes(false, true, 8, true, 7)
                .construir();

        assertEquals(false, service.verificaQualificacoesParaTrabalhoFora(engenheiro));
    }

    @Test
    void deveRetornarVerdadeiroSeFluenteInglesTemMestradoENotaMestradoMaiorQue7Test() {
        List<ValidaEngenheiro> validaEngenheiros = Arrays.asList(new ValidaEngenheiroImpl());
        EngenheiroService service = new EngenheiroService(validaEngenheiros);
        Engenheiro engenheiro = new EngenheiroBuilder()
                .comDadosPessoais("0001", "Nome do Engenheiro", "Sobrenome", 3L, 1234L, GrupoSanguineo.O)
                .comEndereco("89.227-000", "Rua dos Engenheiros", "9999","Engenharia", "Novo Engenheiro")
                .comNumeroConselho("Abc122")
                .comQualificacoes(true, true, 8, false, 0)
                .construir();

        assertEquals(true, service.verificaQualificacoesParaTrabalhoFora(engenheiro));
    }

    @Test
    void deveRetornarVerdadeiroSeFluenteInglesTemDoutoradoENotaDoutoradoMaiorQue5Test() {
        List<ValidaEngenheiro> validaEngenheiros = Arrays.asList(new ValidaEngenheiroImpl());
        EngenheiroService service = new EngenheiroService(validaEngenheiros);
        Engenheiro engenheiro = new EngenheiroBuilder()
                .comDadosPessoais("0001", "Nome do Engenheiro", "Sobrenome", 3L, 1234L, GrupoSanguineo.O)
                .comEndereco("89.227-000", "Rua dos Engenheiros", "9999","Engenharia", "Novo Engenheiro")
                .comNumeroConselho("Abc122")
                .comQualificacoes(true, false, 0, true, 6)
                .construir();

        assertEquals(true, service.verificaQualificacoesParaTrabalhoFora(engenheiro));
    }

    @Test
    void deveCalculaBonusEngenheiroTest() {
        List<ValidaEngenheiro> validaEngenheiros = Arrays.asList(new ValidaEngenheiroImpl());
        EngenheiroService service = new EngenheiroService(validaEngenheiros);
        Engenheiro engenheiro = new EngenheiroBuilder()
                .comDadosPessoais("0001", "Nome do Engenheiro", "Sobrenome", 3L, 1234L, GrupoSanguineo.O)
                .comEndereco("89.227-000", "Rua dos Engenheiros", "9999","Engenharia", "Novo Engenheiro")
                .comNumeroConselho("Abc122")
                .comQualificacoes(true, false, 0, true, 6)
                .construir();

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);

        assertEquals(decimalFormat.format(11.1), decimalFormat.format(service.calculaBonusEngenheiro(engenheiro)));
    }
}

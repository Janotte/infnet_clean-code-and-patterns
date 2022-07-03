package br.com.infnet.projetofinal.empresaacme.servicos;

import br.com.infnet.projetofinal.empresaacme.modelos.Engenheiro;

import java.util.List;

public class EngenheiroService {

    private List<ValidaEngenheiro> validacoes;

    public EngenheiroService(List<ValidaEngenheiro> validacoes) {
        this.validacoes = validacoes;
    }

    public boolean verificaQualificacoesParaTrabalhoFora(Engenheiro engenheiro) {
        final boolean[] resultado = {false};
        validacoes.forEach(validacao ->
        {
            resultado[0] = validacao.verificaQualificacoesParaTrabalhoFora(engenheiro);
        });
        return resultado[0];
    }

    public Double calculaBonusEngenheiro(Engenheiro engenheiro) {
        return engenheiro.getDadosPessoais().getTempoDeServicoEmAnos() * 3.7;
    }
}

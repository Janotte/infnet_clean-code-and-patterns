package br.com.infnet.projetofinal.empresaacme.servicos;

import br.com.infnet.projetofinal.empresaacme.modelos.Engenheiro;

public class ValidaEngenheiroImpl implements ValidaEngenheiro {

    @Override
    public boolean verificaQualificacoesParaTrabalhoFora(Engenheiro engenheiro) {
        if (engenheiro.getQualificacoes().isFluenteEmIngles()
                && engenheiro.getQualificacoes().isTemMestrado()
                && engenheiro.getQualificacoes().getNotaMestrado() > 7) {
            return true;
        }
        if (engenheiro.getQualificacoes().isFluenteEmIngles()
                && engenheiro.getQualificacoes().isTemDoutorado()
                && engenheiro.getQualificacoes().getNotaDoutorado() > 5) {
            return true;
        }
        return false;
    }
}

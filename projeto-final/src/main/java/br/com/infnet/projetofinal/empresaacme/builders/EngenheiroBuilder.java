package br.com.infnet.projetofinal.empresaacme.builders;

import br.com.infnet.projetofinal.empresaacme.modelos.*;

public class EngenheiroBuilder {

    private final Engenheiro instancia;

    public EngenheiroBuilder() { this.instancia = new Engenheiro(); }

    public EngenheiroBuilder comDadosPessoais(String id, String nome, String sobrenome, Long tempoDeServicoEmAnos, Long matricula, GrupoSanguineo grupoSanguineo ) {
        DadosPessoais dadosPessoais = new DadosPessoais();
        dadosPessoais.setId(id);
        dadosPessoais.setNome(nome);
        dadosPessoais.setSobrenome(sobrenome);
        dadosPessoais.setTempoDeServicoEmAnos(tempoDeServicoEmAnos);
        dadosPessoais.setMatricula(matricula);
        dadosPessoais.setGrupoSanguineo(grupoSanguineo);
        this.instancia.setDadosPessoais(dadosPessoais);
        return this;
    }

    public EngenheiroBuilder comEndereco( String cep, String logradouro, String numero, String bairro, String cidade) {
        Endereco endereco = new Endereco();
        endereco.setCep(cep);
        endereco.setLogradouro(logradouro);
        endereco.setNumero(numero);
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        this.instancia.setEndereco(endereco);
        return this;
    }

    public EngenheiroBuilder comNumeroConselho( String numeroConselho) {
        this.instancia.setNumeroConselho(numeroConselho);
        return this;
    }

    public EngenheiroBuilder comQualificacoes( boolean fluenteEmIngles, boolean temMestrado, Integer notaMestrado, boolean temDoutorado, Integer notaDoutorado ) {
        QualificacoesEngenheiro qualificacoes = new QualificacoesEngenheiro();
        qualificacoes.setFluenteEmIngles(fluenteEmIngles);
        qualificacoes.setTemMestrado(temMestrado);
        qualificacoes.setNotaMestrado(notaMestrado);
        qualificacoes.setTemDoutorado(temDoutorado);
        qualificacoes.setNotaDoutorado(notaDoutorado);
        this.instancia.setQualificacoes(qualificacoes);
        return this;
    }

    public Engenheiro construir() { return this.instancia; }
}

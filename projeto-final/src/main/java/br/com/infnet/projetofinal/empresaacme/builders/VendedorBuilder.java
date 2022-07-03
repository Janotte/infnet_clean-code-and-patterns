package br.com.infnet.projetofinal.empresaacme.builders;

import br.com.infnet.projetofinal.empresaacme.modelos.DadosPessoais;
import br.com.infnet.projetofinal.empresaacme.modelos.Endereco;
import br.com.infnet.projetofinal.empresaacme.modelos.GrupoSanguineo;
import br.com.infnet.projetofinal.empresaacme.modelos.Vendedor;

import java.util.HashMap;

public class VendedorBuilder {

    private final Vendedor instancia;

    public VendedorBuilder() { this.instancia = new Vendedor(); }

    public VendedorBuilder comDadosPessoais(String id, String nome, String sobrenome, Long tempoDeServicoEmAnos, Long matricula, GrupoSanguineo grupoSanguineo) {
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

    public VendedorBuilder comEndereco(String cep, String logradouro, String numero, String bairro, String cidade ) {
        Endereco endereco = new Endereco();
        endereco.setCep(cep);
        endereco.setLogradouro(logradouro);
        endereco.setNumero(numero);
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        this.instancia.setEndereco(endereco);
        return this;
    }

    public VendedorBuilder comQuantidadeDeVendas(Long quantidadeDeVendas) {
        this.instancia.setQuantidadeDeVendas(quantidadeDeVendas);
        return this;
    }

    public VendedorBuilder comCursos(Integer numero, String nome) {
        if (this.instancia.getCursos() == null) {
            this.instancia.setCursos(new HashMap<>());
        }
        this.instancia.getCursos().put(numero, nome);
        return this;
    }

    public Vendedor construir() { return this.instancia; }
}

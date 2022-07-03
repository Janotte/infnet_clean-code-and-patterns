package br.com.exemplo.solid.builders;

import br.com.exemplo.solid.models.*;

import java.math.BigDecimal;
import java.util.ArrayList;

public class FuncionarioTerceirizadoBuilder {

    private FuncionarioTerceirizado instancia;
    private DadosDoFuncionario dadosDoFuncionario = new DadosDoFuncionario();

    public FuncionarioTerceirizadoBuilder() {
        this.instancia = new FuncionarioTerceirizado();
    }

    public FuncionarioTerceirizadoBuilder com(String nome, Cargo cargo, Setor setor, BigDecimal salario) {
        dadosDoFuncionario.setNome(nome);
        dadosDoFuncionario.setCargo(cargo);
        dadosDoFuncionario.setSetor(setor);
        dadosDoFuncionario.setSalario(salario);
        instancia.setDadosDoFuncionario(dadosDoFuncionario);
        return this;
    }

    public FuncionarioTerceirizadoBuilder comEndereco(String cep, String logradouro, String numero, String complemento,
                                          String bairro, String cidade) {
        Endereco endereco = new Endereco();
        endereco.setCep(cep);
        endereco.setLogradouro(logradouro);
        endereco.setNumero(numero);
        endereco.setComplemento(complemento);
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        instancia.getDadosDoFuncionario().setEndereco(endereco);
        return this;
    }

    public FuncionarioTerceirizadoBuilder comTelefone(TipoTelefone tipoTelefone, String numero) {
        Telefone telefone = new Telefone();
        telefone.setTipoTelefone(tipoTelefone);
        telefone.setNumero(numero);

        if (this.instancia.getDadosDoFuncionario().getTelefones() == null) {
            this.instancia.getDadosDoFuncionario().setTelefones(new ArrayList<Telefone>());
        }

        this.instancia.getDadosDoFuncionario().getTelefones().add(telefone);

        return this;
    }

    public FuncionarioTerceirizadoBuilder comEmpresa(String empresaContratada) {
        instancia.setEmpresaContratada(empresaContratada);
        return this;
    }

    public FuncionarioTerceirizadoBuilder comTempoPrevistoDePermanencia(String tempoPrevistoDePermanencia) {
        instancia.setTempoPrevistoDePermanencia(tempoPrevistoDePermanencia);
        return this;
    }

    public FuncionarioTerceirizado construir() {
        return this.instancia;
    }
}

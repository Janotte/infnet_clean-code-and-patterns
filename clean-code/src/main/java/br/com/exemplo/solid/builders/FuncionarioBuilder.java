package br.com.exemplo.solid.builders;

import br.com.exemplo.solid.models.*;

import java.math.BigDecimal;
import java.util.ArrayList;

public class FuncionarioBuilder {

    private Funcionario instancia;
    private DadosDoFuncionario dadosDoFuncionario = new DadosDoFuncionario();

    public FuncionarioBuilder() {
        this.instancia = new Funcionario();
    }

    public FuncionarioBuilder com(String nome, Cargo cargo, Setor setor, BigDecimal salario) {
        dadosDoFuncionario.setNome(nome);
        dadosDoFuncionario.setCargo(cargo);
        dadosDoFuncionario.setSetor(setor);
        dadosDoFuncionario.setSalario(salario);
        instancia.setDadosDoFuncionario(dadosDoFuncionario);
        return this;
    }

    public FuncionarioBuilder estagiario(String nome, BigDecimal salario) {
        dadosDoFuncionario.setNome(nome);
        dadosDoFuncionario.setCargo(Cargo.ESTAGIARIO);
        dadosDoFuncionario.setSetor(Setor.DESENVOLVIMENTO);
        dadosDoFuncionario.setSalario(salario);
        instancia.setDadosDoFuncionario(dadosDoFuncionario);
        return this;
    }

    public FuncionarioBuilder junior(String nome, BigDecimal salario) {
        dadosDoFuncionario.setNome(nome);
        dadosDoFuncionario.setCargo(Cargo.JUNIOR);
        dadosDoFuncionario.setSetor(Setor.DESENVOLVIMENTO);
        dadosDoFuncionario.setSalario(salario);
        instancia.setDadosDoFuncionario(dadosDoFuncionario);
        return this;
    }

    public FuncionarioBuilder pleno(String nome, BigDecimal salario) {
        dadosDoFuncionario.setNome(nome);
        dadosDoFuncionario.setCargo(Cargo.PLENO);
        dadosDoFuncionario.setSetor(Setor.DEVOPS);
        dadosDoFuncionario.setSalario(salario);
        instancia.setDadosDoFuncionario(dadosDoFuncionario);
        return this;
    }

    public FuncionarioBuilder senior(String nome, BigDecimal salario) {
        dadosDoFuncionario.setNome(nome);
        dadosDoFuncionario.setCargo(Cargo.SENIOR);
        dadosDoFuncionario.setSetor(Setor.BANCO_DE_DADOS);
        dadosDoFuncionario.setSalario(salario);
        instancia.setDadosDoFuncionario(dadosDoFuncionario);
        return this;
    }

    public FuncionarioBuilder comEndereco(String cep, String logradouro, String numero, String complemento,
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

    public FuncionarioBuilder comTelefone(TipoTelefone tipoTelefone, String numero) {
        Telefone telefone = new Telefone();
        telefone.setTipoTelefone(tipoTelefone);
        telefone.setNumero(numero);

        if (this.instancia.getDadosDoFuncionario().getTelefones() == null) {
            this.instancia.getDadosDoFuncionario().setTelefones(new ArrayList<Telefone>());
        }

        this.instancia.getDadosDoFuncionario().getTelefones().add(telefone);

        return this;
    }

    public Funcionario construir() {
        return this.instancia;
    }
}

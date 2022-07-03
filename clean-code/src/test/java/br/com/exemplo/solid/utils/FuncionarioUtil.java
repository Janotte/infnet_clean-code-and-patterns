package br.com.exemplo.solid.utils;

import br.com.exemplo.solid.builders.FuncionarioBuilder;
import br.com.exemplo.solid.models.Funcionario;
import br.com.exemplo.solid.models.TipoTelefone;

import java.math.BigDecimal;

public class FuncionarioUtil {

    private static final String NOME = "Nome do Funcionário";
    private static final String CEP = "88.888-88";
    private static final String LOGRADOURO = "Logradouro do Funcionário";
    private static final String NUMERO = "888";
    private static final String COMPLEMENTO = "Apto 8";
    private static final String BAIRRO = "Bairro do Funcionário";
    private static final String CIDADE = "Cidade do Funcionário";
    private static final String TELEFONE_MOVEL = "(47) 99999-9999";
    private static final String TELEFONE_RESIDENCIAL = "(47) 3434-1234";
    private static final String TELEFONE_COMERCIAL = "(47) 3434-9999";

    public static Funcionario criarEstagiario() {
        Funcionario estagiario = new FuncionarioBuilder()
                .estagiario(NOME, new BigDecimal(1000))
                .comEndereco(CEP, LOGRADOURO,NUMERO, COMPLEMENTO, BAIRRO, CIDADE)
                .comTelefone(TipoTelefone.MOVEL, TELEFONE_MOVEL)
                .comTelefone(TipoTelefone.RESIDENCIAL,TELEFONE_RESIDENCIAL)
                .comTelefone(TipoTelefone.COMERCIAL, TELEFONE_COMERCIAL)
                .construir();
        return estagiario;
    }

    public static Funcionario criarJunior() {
        Funcionario junior = new FuncionarioBuilder()
                .junior(NOME, new BigDecimal(2000))
                .comEndereco(CEP, LOGRADOURO,NUMERO, COMPLEMENTO, BAIRRO, CIDADE)
                .comTelefone(TipoTelefone.MOVEL, TELEFONE_MOVEL)
                .comTelefone(TipoTelefone.RESIDENCIAL,TELEFONE_RESIDENCIAL)
                .comTelefone(TipoTelefone.COMERCIAL, TELEFONE_COMERCIAL)
                .construir();
        return junior;
    }

    public static  Funcionario criarPleno() {
        Funcionario pleno = new FuncionarioBuilder()
                .pleno(NOME, new BigDecimal(3000))
                .comEndereco(CEP, LOGRADOURO,NUMERO, COMPLEMENTO, BAIRRO, CIDADE)
                .comTelefone(TipoTelefone.MOVEL, TELEFONE_MOVEL)
                .comTelefone(TipoTelefone.RESIDENCIAL,TELEFONE_RESIDENCIAL)
                .comTelefone(TipoTelefone.COMERCIAL, TELEFONE_COMERCIAL)
                .construir();
        return pleno;
    }

    public static Funcionario criarSenior() {
        Funcionario senior = new FuncionarioBuilder()
                .senior(NOME, new BigDecimal(4000))
                .comEndereco(CEP, LOGRADOURO,NUMERO, COMPLEMENTO, BAIRRO, CIDADE)
                .comTelefone(TipoTelefone.MOVEL, TELEFONE_MOVEL)
                .comTelefone(TipoTelefone.RESIDENCIAL,TELEFONE_RESIDENCIAL)
                .comTelefone(TipoTelefone.COMERCIAL, TELEFONE_COMERCIAL)
                .construir();
        return senior;
    }
}

package br.com.exemplo.solid.utils;

import br.com.exemplo.solid.builders.FuncionarioTerceirizadoBuilder;
import br.com.exemplo.solid.models.*;

import java.math.BigDecimal;

public class FuncionarioTerceirizadoUtil {

    public static FuncionarioTerceirizado criarTerceirizado() {
        FuncionarioTerceirizado terceirizado = new FuncionarioTerceirizadoBuilder()
                .com("Nome do Funcionário Terceirizado",
                        Cargo.SENIOR,
                        Setor.BANCO_DE_DADOS,
                        new BigDecimal(7000))
                .comEndereco("89.999-99",
                        "Logradouro do Funcionário Terceirizado",
                        "7000",
                        "Apto 07",
                        "Bairro do Terceirizado",
                        "Cidade do Terceirizado")
                .comTelefone(TipoTelefone.MOVEL, "(48) 99700-7000")
                .comTelefone(TipoTelefone.RESIDENCIAL,"(48) 4231-7000")
                .comTelefone(TipoTelefone.COMERCIAL, "(48) 4231-8000")
                .comEmpresa("Empresa do Terceirizado")
                .comTempoPrevistoDePermanencia("12 meses")
                .construir();
        return terceirizado;
    }
}

package br.com.exemplo.solid;

import br.com.exemplo.solid.models.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static br.com.exemplo.solid.utils.FuncionarioTerceirizadoUtil.criarTerceirizado;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionarioTerceirizadoBuilderTest {

    @Test
    void deveInstanciarUmFuncionarioTerceirizado() {
        FuncionarioTerceirizado terceirizado = criarTerceirizado();

        assertEquals("Nome do Funcionário Terceirizado", terceirizado.getDadosDoFuncionario().getNome());
        assertEquals(Cargo.SENIOR, terceirizado.getDadosDoFuncionario().getCargo());
        assertEquals(Setor.BANCO_DE_DADOS, terceirizado.getDadosDoFuncionario().getSetor());
        assertEquals(new BigDecimal(7000), terceirizado.getDadosDoFuncionario().getSalario());
        assertEquals("89.999-99", terceirizado.getDadosDoFuncionario().getEndereco().getCep());
        assertEquals("Logradouro do Funcionário Terceirizado", terceirizado.getDadosDoFuncionario().getEndereco().getLogradouro());
        assertEquals("7000", terceirizado.getDadosDoFuncionario().getEndereco().getNumero());
        assertEquals("Apto 07", terceirizado.getDadosDoFuncionario().getEndereco().getComplemento());
        assertEquals("Bairro do Terceirizado", terceirizado.getDadosDoFuncionario().getEndereco().getBairro());
        assertEquals("Cidade do Terceirizado", terceirizado.getDadosDoFuncionario().getEndereco().getCidade());
        assertEquals(TipoTelefone.MOVEL, terceirizado.getDadosDoFuncionario().getTelefones().get(0).getTipoTelefone(TipoTelefone.MOVEL));
        assertEquals("(48) 99700-7000",terceirizado.getDadosDoFuncionario().getTelefones().get(0).getNumero());
        assertEquals(TipoTelefone.RESIDENCIAL, terceirizado.getDadosDoFuncionario().getTelefones().get(1).getTipoTelefone(TipoTelefone.RESIDENCIAL));
        assertEquals("(48) 4231-7000",terceirizado.getDadosDoFuncionario().getTelefones().get(1).getNumero());
        assertEquals(TipoTelefone.COMERCIAL, terceirizado.getDadosDoFuncionario().getTelefones().get(2).getTipoTelefone(TipoTelefone.COMERCIAL));
        assertEquals("(48) 4231-8000",terceirizado.getDadosDoFuncionario().getTelefones().get(2).getNumero());

    }
}

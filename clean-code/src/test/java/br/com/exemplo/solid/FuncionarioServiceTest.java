package br.com.exemplo.solid;

import br.com.exemplo.solid.models.Funcionario;
import br.com.exemplo.solid.services.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static br.com.exemplo.solid.utils.FuncionarioUtil.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FuncionarioServiceTest {

    List<ValidaReajuste> reajustes = Arrays.asList(new ValidaReajusteImpl());
    List<ValidaBeneficio> beneficios = Arrays.asList(new ValidaBeneficioImpl());
    FuncionarioService funcionarioService = new FuncionarioService(reajustes, beneficios);

    @Test
    void deveCalcularReajusteDeSalarioParaFuncionarios() {

        Funcionario estagiario = criarEstagiario();
        BigDecimal salarioEsperadoParaEstagiario = new BigDecimal(1200);
        Funcionario junior =  criarJunior();
        BigDecimal salarioEsperadoParaJunior = new BigDecimal(2600);
        Funcionario pleno = criarPleno();
        BigDecimal salarioEsperadoParaPleno = new BigDecimal(3900);
        Funcionario senior = criarSenior();
        BigDecimal salarioEsperadoParaSenior = new BigDecimal(5280);

        funcionarioService.reajustarSalario(estagiario, new BigDecimal(20));
        funcionarioService.reajustarSalario(junior, new BigDecimal(30));
        funcionarioService.reajustarSalario(pleno, new BigDecimal(25));
        funcionarioService.reajustarSalario(senior, new BigDecimal(25));

        assertEquals(salarioEsperadoParaEstagiario, estagiario.getDadosDoFuncionario().getSalario());
        assertEquals(salarioEsperadoParaJunior, junior.getDadosDoFuncionario().getSalario());
        assertEquals(salarioEsperadoParaPleno, pleno.getDadosDoFuncionario().getSalario());
        assertEquals(salarioEsperadoParaSenior, senior.getDadosDoFuncionario().getSalario());
    }

    @Test
    void deveCalcularBeneficiosParaFuncionarios() {
        Funcionario estagiario = criarEstagiario();
        BigDecimal salarioComBeneficiosParaEstagiario = new BigDecimal(2300);

        Funcionario junior = criarJunior();
        BigDecimal salarioComBeneficiosParaJunior = new BigDecimal(3400);

        Funcionario pleno = criarPleno();
        BigDecimal salarioComBeneficiosParaPleno = new BigDecimal(4000);

        Funcionario senior = criarSenior();
        BigDecimal salarioComBeneficiosParaSenior = new BigDecimal(5000);

        funcionarioService.calcularBeneficios(estagiario);
        funcionarioService.calcularBeneficios(junior);
        funcionarioService.calcularBeneficios(pleno);
        funcionarioService.calcularBeneficios(senior);

        assertEquals(salarioComBeneficiosParaEstagiario, estagiario.getDadosDoFuncionario().getSalario());
        assertEquals(salarioComBeneficiosParaJunior, junior.getDadosDoFuncionario().getSalario());
        assertEquals(salarioComBeneficiosParaPleno, pleno.getDadosDoFuncionario().getSalario());
        assertEquals(salarioComBeneficiosParaSenior, senior.getDadosDoFuncionario().getSalario());
    }

}

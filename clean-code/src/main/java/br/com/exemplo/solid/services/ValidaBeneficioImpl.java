package br.com.exemplo.solid.services;

import br.com.exemplo.solid.models.Cargo;
import br.com.exemplo.solid.models.Funcionario;

public class ValidaBeneficioImpl implements ValidaBeneficio {

    BeneficiosParaEstagiariosImpl beneficiosParaEstagiarios = new BeneficiosParaEstagiariosImpl();
    BeneficiosParaJuniorsImpl beneficiosParaJuniors = new BeneficiosParaJuniorsImpl();
    BeneficiosParaPlenosImpl beneficiosParaPlenos = new BeneficiosParaPlenosImpl();
    BeneficiosParaSeniorsImpl beneficiosParaSeniors = new BeneficiosParaSeniorsImpl();

    public ValidaBeneficioImpl() {
    }

    public void calcularBeneficio(Funcionario funcionario) {

        if(funcionario.getDadosDoFuncionario().getCargo().equals(Cargo.ESTAGIARIO)) {
            funcionario.adicionarBeneficio(beneficiosParaEstagiarios.valorDoAuxilioAlimentacao());
            funcionario.adicionarBeneficio(beneficiosParaEstagiarios.valorDoAuxilioEducacao());
            funcionario.adicionarBeneficio(beneficiosParaEstagiarios.valorDoAuxilioTransporte());
        }

        if(funcionario.getDadosDoFuncionario().getCargo().equals(Cargo.JUNIOR)) {
           funcionario.adicionarBeneficio(beneficiosParaJuniors.valorDoAuxilioAlimentacao());
           funcionario.adicionarBeneficio(beneficiosParaJuniors.valorDoAuxilioEducacao());
           funcionario.adicionarBeneficio(beneficiosParaJuniors.valorDoAuxilioTransporte());
        }

        if(funcionario.getDadosDoFuncionario().getCargo().equals(Cargo.PLENO)) {
           funcionario.adicionarBeneficio(beneficiosParaPlenos.valorDoAuxilioAlimentacao());
           funcionario.adicionarBeneficio(beneficiosParaPlenos.valorDoAuxilioTransporte());
        }

        if(funcionario.getDadosDoFuncionario().getCargo().equals(Cargo.SENIOR)) {
          funcionario.adicionarBeneficio(beneficiosParaSeniors.valorDoAuxilioAlimentacao());
        }
    }
}

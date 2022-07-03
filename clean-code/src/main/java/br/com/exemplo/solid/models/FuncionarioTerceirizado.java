package br.com.exemplo.solid.models;

public class FuncionarioTerceirizado {

    private DadosDoFuncionario dadosDoFuncionario;
    private String empresaContratada;
    private String tempoPrevistoDePermanencia;

    public DadosDoFuncionario getDadosDoFuncionario() {
        return dadosDoFuncionario;
    }

    public void setDadosDoFuncionario(DadosDoFuncionario dadosDoFuncionario) {
        this.dadosDoFuncionario = dadosDoFuncionario;
    }

    public String getEmpresaContratada() {
        return empresaContratada;
    }

    public void setEmpresaContratada(String empresaContratada) {
        this.empresaContratada = empresaContratada;
    }

    public String getTempoPrevistoDePermanencia() {
        return tempoPrevistoDePermanencia;
    }

    public void setTempoPrevistoDePermanencia(String tempoPrevistoDePermanencia) {
        this.tempoPrevistoDePermanencia = tempoPrevistoDePermanencia;
    }
}

package br.com.exemplo.solid.models;

public class Telefone {

    private TipoTelefone tipoTelefone;
    private String numero;

    public Telefone(TipoTelefone tipoTelefone, String numero) {
        this.tipoTelefone = tipoTelefone;
        this.numero = numero;
    }

    public Telefone() {

    }

    public TipoTelefone getTipoTelefone(TipoTelefone movel) {
        return tipoTelefone;
    }

    public void setTipoTelefone(TipoTelefone tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
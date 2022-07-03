package br.com.exemplo.solid.models;

public enum TipoTelefone {

    COMERCIAL("Comercial"),
    RESIDENCIAL("Residêncial"),
    MOVEL("Móvel");

    private final String descricao;

    TipoTelefone(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

package br.com.exemplo.solid.models;

public enum Setor {
    DESENVOLVIMENTO("Desenvolvimento"),
    DEVOPS("Devops"),
    BANCO_DE_DADOS("Banco de dados");

    private final String descricao;

    Setor(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

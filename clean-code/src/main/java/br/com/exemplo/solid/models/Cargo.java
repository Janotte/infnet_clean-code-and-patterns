package br.com.exemplo.solid.models;

public enum Cargo {
    ESTAGIARIO("Estagiário"),
    JUNIOR("Júnior"),
    PLENO("Pleno"),
    SENIOR("Sénior");

    private final String descricao;

    Cargo(String descricao) { this.descricao = descricao; }

    public String getDescricao() {
        return descricao;
    }
}

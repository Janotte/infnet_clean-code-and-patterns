package br.com.infnet.projetofinal.empresaacme.modelos;

public enum GrupoSanguineo {
    O(1),
    A(2),
    B(3),
    AB(4);

    private int numero;

    GrupoSanguineo(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

}

package br.com.infnet.projetofinal.empresaacme.modelos;

public class QualificacoesEngenheiro {

    private boolean temMestrado;
    private Integer notaMestrado;
    private boolean temDoutorado;
    private Integer notaDoutorado;
    private boolean fluenteEmIngles;

    public boolean isTemMestrado() {
        return temMestrado;
    }

    public void setTemMestrado(boolean temMestrado) {
        this.temMestrado = temMestrado;
    }

    public Integer getNotaMestrado() {
        return notaMestrado;
    }

    public void setNotaMestrado(Integer notaMestrado) {
        this.notaMestrado = notaMestrado;
    }

    public boolean isTemDoutorado() {
        return temDoutorado;
    }

    public void setTemDoutorado(boolean temDoutorado) {
        this.temDoutorado = temDoutorado;
    }

    public Integer getNotaDoutorado() {
        return notaDoutorado;
    }

    public void setNotaDoutorado(Integer notaDoutorado) {
        this.notaDoutorado = notaDoutorado;
    }

    public boolean isFluenteEmIngles() {
        return fluenteEmIngles;
    }

    public void setFluenteEmIngles(boolean fluenteEmIngles) {
        this.fluenteEmIngles = fluenteEmIngles;
    }
}

package br.com.infnet.projetofinal.empresaacme.modelos;

public class DadosPessoais {

    private String id;
    private String nome;
    private String sobrenome;
    private Long tempoDeServicoEmAnos;
    private Long matricula;
    private GrupoSanguineo grupoSanguineo;

    public String getId() { return id; }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Long getTempoDeServicoEmAnos() {
        return tempoDeServicoEmAnos;
    }

    public void setTempoDeServicoEmAnos(Long tempoDeServicoEmAnos) {
        this.tempoDeServicoEmAnos = tempoDeServicoEmAnos;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public GrupoSanguineo getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(GrupoSanguineo grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

}

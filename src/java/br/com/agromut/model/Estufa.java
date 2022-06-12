package br.com.agromut.model;

public class Estufa {
     private Integer idEstufa; 
     private UsuarioAdm idUsuarioAdm;
     private String descricaoEstufa;
     private String capacidadeEstufa;
     private String statusEstufa;
     

    public Estufa() {
    }

    public Estufa(Integer idEstufa) {
        this.idEstufa = idEstufa;
    }

    
    public Estufa(Integer idEstufa, UsuarioAdm idUsuarioAdm, String descricaoEstufa, String capacidadeEstufa, String statusEstufa) {
        this.idEstufa = idEstufa;
        this.idUsuarioAdm = idUsuarioAdm;
        this.descricaoEstufa = descricaoEstufa;
        this.capacidadeEstufa = capacidadeEstufa;
        this.statusEstufa = statusEstufa;
    }

    public Integer getIdEstufa() {
        return idEstufa;
    }

    public void setIdEstufa(Integer idEstufa) {
        this.idEstufa = idEstufa;
    }

    public UsuarioAdm getIdUsuarioAdm() {
        return idUsuarioAdm;
    }

    public void setIdUsuarioAdm(UsuarioAdm idUsuarioAdm) {
        this.idUsuarioAdm = idUsuarioAdm;
    }

    public String getDescricaoEstufa() {
        return descricaoEstufa;
    }

    public void setDescricaoEstufa(String descricaoEstufa) {
        this.descricaoEstufa = descricaoEstufa;
    }

    public String getCapacidadeEstufa() {
        return capacidadeEstufa;
    }

    public void setCapacidadeEstufa(String capacidadeEstufa) {
        this.capacidadeEstufa = capacidadeEstufa;
    }

    public String getStatusEstufa() {
        return statusEstufa;
    }

    public void setStatusEstufa(String statusEstufa) {
        this.statusEstufa = statusEstufa;
    }

    
}

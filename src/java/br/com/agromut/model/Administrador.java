package br.com.agromut.model;

public class Administrador {
    private Integer idAdministrador;
    private String nomeAdministrador;
    private String loginAdministrador;
    private String senhaAdministrador;

    public Administrador() {
    }

    public Administrador(Integer idAdmnistrador, String nomeAdministrador, String loginAdministrador, String senhaAdministrador) {
        this.idAdministrador = idAdmnistrador;
        this.nomeAdministrador = nomeAdministrador;
        this.loginAdministrador = loginAdministrador;
        this.senhaAdministrador = senhaAdministrador;
    }

    public Administrador(Integer idAdmnistrador) {
        this.idAdministrador = idAdmnistrador;
    }

    public Administrador(String nomeAdministrador) {
        this.nomeAdministrador = nomeAdministrador;
    }
    
    public Integer getIdAdmnistrador() {
        return idAdministrador;
    }

    public void setIdAdmnistrador(Integer idAdmnistrador) {
        this.idAdministrador = idAdmnistrador;
    }

    public String getNomeAdministrador() {
        return nomeAdministrador;
    }

    public void setNomeAdministrador(String nomeAdministrador) {
        this.nomeAdministrador = nomeAdministrador;
    }

    public String getLoginAdministrador() {
        return loginAdministrador;
    }

    public void setLoginAdministrador(String loginAdministrador) {
        this.loginAdministrador = loginAdministrador;
    }

    public String getSenhaAdministrador() {
        return senhaAdministrador;
    }

    public void setSenhaAdministrador(String senhaAdministrador) {
        this.senhaAdministrador = senhaAdministrador;
    }

   
    
}

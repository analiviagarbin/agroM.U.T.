package br.com.agromut.model;

import java.util.Date;

public class Usuario {
    private Integer idUsuario;
    private String codigoUsuario;
    private String nomeUsuario;
    private String emailUsuario;
    private String celularUsuario;
    private String cepUsuario;
    private String cpfUsuario;
    private String loginUsuario;
    private String senhaUsuario;
    private Date datanascUsuario; 
    private String ufUsuario;
    private String cidadeUsuario;
    private String bairroUsuario;
    private String ruaUsuario;
    private String numUsuario;

    public Usuario() {
    }

    public Usuario(Integer idUsuario, String codigoUsuario, String nomeUsuario, String emailUsuario, String celularUsuario, String cepUsuario, String cpfUsuario, String loginUsuario, String senhaUsuario, Date datanascUsuario, String ufUsuario, String cidadeUsuario, String bairroUsuario, String ruaUsuario, String numUsuario) {
        this.idUsuario = idUsuario;
        this.codigoUsuario = codigoUsuario;
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.celularUsuario = celularUsuario;
        this.cepUsuario = cepUsuario;
        this.cpfUsuario = cpfUsuario;
        this.loginUsuario = loginUsuario;
        this.senhaUsuario = senhaUsuario;
        this.datanascUsuario = datanascUsuario;
        this.ufUsuario = ufUsuario;
        this.cidadeUsuario = cidadeUsuario;
        this.bairroUsuario = bairroUsuario;
        this.ruaUsuario = ruaUsuario;
        this.numUsuario = numUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getCelularUsuario() {
        return celularUsuario;
    }

    public void setCelularUsuario(String celularUsuario) {
        this.celularUsuario = celularUsuario;
    }

    public String getCepUsuario() {
        return cepUsuario;
    }

    public void setCepUsuario(String cepUsuario) {
        this.cepUsuario = cepUsuario;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public Date getDatanascUsuario() {
        return datanascUsuario;
    }

    public void setDatanascUsuario(Date datanascUsuario) {
        this.datanascUsuario = datanascUsuario;
    }

    public String getUfUsuario() {
        return ufUsuario;
    }

    public void setUfUsuario(String ufUsuario) {
        this.ufUsuario = ufUsuario;
    }

    public String getCidadeUsuario() {
        return cidadeUsuario;
    }

    public void setCidadeUsuario(String cidadeUsuario) {
        this.cidadeUsuario = cidadeUsuario;
    }

    public String getBairroUsuario() {
        return bairroUsuario;
    }

    public void setBairroUsuario(String bairroUsuario) {
        this.bairroUsuario = bairroUsuario;
    }

    public String getRuaUsuario() {
        return ruaUsuario;
    }

    public void setRuaUsuario(String ruaUsuario) {
        this.ruaUsuario = ruaUsuario;
    }

    public String getNumUsuario() {
        return numUsuario;
    }

    public void setNumUsuario(String numUsuario) {
        this.numUsuario = numUsuario;
    }

  

  
   
}
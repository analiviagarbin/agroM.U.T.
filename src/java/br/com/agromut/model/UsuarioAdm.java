
package br.com.agromut.model;

import java.util.Date;

public class UsuarioAdm extends Usuario{
    private Integer idUsuarioAdm;
    private String cnpjUsuarioAdm;
    private String tipoUsuarioAdm;
    private String statusUsuarioAdm;

    public UsuarioAdm() {
    }
    
    

    public UsuarioAdm(Integer idUsuarioAdm, String cnpjUsuarioAdm, String tipoUsuarioAdm, String statusUsuarioAdm) {
        this.idUsuarioAdm = idUsuarioAdm;
        this.cnpjUsuarioAdm = cnpjUsuarioAdm;
        this.tipoUsuarioAdm = tipoUsuarioAdm;
        this.statusUsuarioAdm = statusUsuarioAdm;
    }

    public UsuarioAdm(Integer idUsuarioAdm) {
        this.idUsuarioAdm = idUsuarioAdm;
    }

    public UsuarioAdm(String statusUsuarioAdm) {
        this.statusUsuarioAdm = statusUsuarioAdm;
    }
    
    

    public Integer getIdUsuarioAdm() {
        return idUsuarioAdm;
    }

    public void setIdUsuarioAdm(Integer idUsuarioAdm) {
        this.idUsuarioAdm = idUsuarioAdm;
    }

    public String getCnpjUsuarioAdm() {
        return cnpjUsuarioAdm;
    }

    public void setCnpjUsuarioAdm(String cnpjUsuarioAdm) {
        this.cnpjUsuarioAdm = cnpjUsuarioAdm;
    }

    public String getTipoUsuarioAdm() {
        return tipoUsuarioAdm;
    }

    public void setTipoUsuarioAdm(String tipoUsuarioAdm) {
        this.tipoUsuarioAdm = tipoUsuarioAdm;
    }

    public String getStatusUsuarioAdm() {
        return statusUsuarioAdm;
    }

    public void setStatusUsuarioAdm(String statusUsuarioAdm) {
        this.statusUsuarioAdm = statusUsuarioAdm;
    }

   

  
    
 }
package br.com.agromut.model;

import java.util.Date;

public class UsuarioFunc extends Usuario {
    private Integer idUsuarioFunc;
    private String salarioUsuarioFunc;
    private String statusUsuarioFunc; 

    public UsuarioFunc() {
    }

    public UsuarioFunc(Integer idUsuarioFunc, String salarioUsuarioFunc, String statusUsuarioFunc) {
        this.idUsuarioFunc = idUsuarioFunc;
        this.salarioUsuarioFunc = salarioUsuarioFunc;
        this.statusUsuarioFunc = statusUsuarioFunc;
    }

    public Integer getIdUsuarioFunc() {
        return idUsuarioFunc;
    }

    public void setIdUsuarioFunc(Integer idUsuarioFunc) {
        this.idUsuarioFunc = idUsuarioFunc;
    }

    public String getSalarioUsuarioFunc() {
        return salarioUsuarioFunc;
    }

    public void setSalarioUsuarioFunc(String salarioUsuarioFunc) {
        this.salarioUsuarioFunc = salarioUsuarioFunc;
    }

    public String getStatusUsuarioFunc() {
        return statusUsuarioFunc;
    }

    public void setStatusUsuarioFunc(String statusUsuarioFunc) {
        this.statusUsuarioFunc = statusUsuarioFunc;
    }

  
    
}

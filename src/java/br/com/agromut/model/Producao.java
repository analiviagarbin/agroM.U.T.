package br.com.agromut.model;

import java.sql.Date;

public class Producao {
    private Estufa idEstufa;
    private Produto idProduto;
    private Date dataplantioProducao;
    private Integer producaoesperadaProducao;

    public Producao() {
    }

    public Producao(Estufa idEstufa, Produto idProduto, Date dataplantioProducao, Integer producaoesperadaProducao) {
        this.idEstufa = idEstufa;
        this.idProduto = idProduto;
        this.dataplantioProducao = dataplantioProducao;
        this.producaoesperadaProducao = producaoesperadaProducao;
    }

    public Estufa getIdEstufa() {
        return idEstufa;
    }

    public void setIdEstufa(Estufa idEstufa) {
        this.idEstufa = idEstufa;
    }

    public Produto getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Produto idProduto) {
        this.idProduto = idProduto;
    }

    public Date getDataplantioProducao() {
        return dataplantioProducao;
    }

    public void setDataplantioProducao(Date dataplantioProducao) {
        this.dataplantioProducao = dataplantioProducao;
    }

    public Integer getProducaoesperadaProducao() {
        return producaoesperadaProducao;
    }

    public void setProducaoesperadaProducao(Integer producaoesperadaProducao) {
        this.producaoesperadaProducao = producaoesperadaProducao;
    }
    
    
    
}

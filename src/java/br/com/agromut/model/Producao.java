package br.com.agromut.model;

import java.sql.Date;

public class Producao {
    private Estufa idEstufa;
    private Produto idProduto;
    private Date dataPlantioProducao;
    private Integer producaoEsperada;

    

    public Producao() {
    }

    public Producao(Estufa idEstufa, Produto idProduto, Date dataPlantioProducao, Integer producaoEsperada) {
        this.idEstufa = idEstufa;
        this.idProduto = idProduto;
        this.dataPlantioProducao = dataPlantioProducao;
        this.producaoEsperada = producaoEsperada;
    }

    public Producao(Estufa idEstufa) {
        this.idEstufa = idEstufa;
    }

    public Producao(Produto idProduto) {
        this.idProduto = idProduto;
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

    public Date getDataPlantioProducao() {
        return dataPlantioProducao;
    }

    public void setDataPlantioProducao(Date dataPlantioProducao) {
        this.dataPlantioProducao = dataPlantioProducao;
    }

    public Integer getProducaoEsperada() {
        return producaoEsperada;
    }

    public void setProducaoEsperada(Integer producaoEsperada) {
        this.producaoEsperada = producaoEsperada;
    }

   
    
    
}

package br.com.agromut.model;

import java.sql.Date;

public class Producao {
    private Estufa idEstufa;
    private Produto produtoProducao;
    private Date dataPlantioProducao;

    public Producao() {
    }

    public Producao(Produto produtoProducao) {
        this.produtoProducao = produtoProducao;
    }

    public Producao(Estufa idEstufa) {
        this.idEstufa = idEstufa;
    }

    public Producao(Estufa idEstufa, Produto produtoProducao, Date dataPlantioProducao) {
        this.idEstufa = idEstufa;
        this.produtoProducao = produtoProducao;
        this.dataPlantioProducao = dataPlantioProducao;
    }

    public Estufa getIdEstufa() {
        return idEstufa;
    }

    public void setIdEstufa(Estufa idEstufa) {
        this.idEstufa = idEstufa;
    }

    public Produto getProdutoProducao() {
        return produtoProducao;
    }

    public void setProdutoProducao(Produto produtoProducao) {
        this.produtoProducao = produtoProducao;
    }

    public Date getDataPlantioProducao() {
        return dataPlantioProducao;
    }

    public void setDataPlantioProducao(Date dataPlantioProducao) {
        this.dataPlantioProducao = dataPlantioProducao;
    }

    
}

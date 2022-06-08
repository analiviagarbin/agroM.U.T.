package br.com.agromut.model;

public class Produto {
    private Integer idProduto;
    private UsuarioAdm idUsuarioAdm;
    private String especieProduto;
    private Integer tempocultivoProduto;
    private String temperaturaProduto;
    private String umidadeProduto;
    private String descricaoProduto;
    private Integer unidadeProduto;
    private String statusProduto;

    public Produto() {
    }

    public Produto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Produto(UsuarioAdm idUsuarioAdm) {
        this.idUsuarioAdm = idUsuarioAdm;
    }

    public Produto(Integer idProduto, UsuarioAdm idUsuarioAdm, String especieProduto, Integer tempocultivoProduto, String temperaturaProduto, String umidadeProduto, String descricaoProduto, Integer unidadeProduto, String statusProduto) {
        this.idProduto = idProduto;
        this.idUsuarioAdm = idUsuarioAdm;
        this.especieProduto = especieProduto;
        this.tempocultivoProduto = tempocultivoProduto;
        this.temperaturaProduto = temperaturaProduto;
        this.umidadeProduto = umidadeProduto;
        this.descricaoProduto = descricaoProduto;
        this.unidadeProduto = unidadeProduto;
        this.statusProduto = statusProduto;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public UsuarioAdm getIdUsuarioAdm() {
        return idUsuarioAdm;
    }

    public void setIdUsuarioAdm(UsuarioAdm idUsuarioAdm) {
        this.idUsuarioAdm = idUsuarioAdm;
    }

    public String getEspecieProduto() {
        return especieProduto;
    }

    public void setEspecieProduto(String especieProduto) {
        this.especieProduto = especieProduto;
    }

    public Integer getTempocultivoProduto() {
        return tempocultivoProduto;
    }

    public void setTempocultivoProduto(Integer tempocultivoProduto) {
        this.tempocultivoProduto = tempocultivoProduto;
    }

    public String getTemperaturaProduto() {
        return temperaturaProduto;
    }

    public void setTemperaturaProduto(String temperaturaProduto) {
        this.temperaturaProduto = temperaturaProduto;
    }

    public String getUmidadeProduto() {
        return umidadeProduto;
    }

    public void setUmidadeProduto(String umidadeProduto) {
        this.umidadeProduto = umidadeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Integer getUnidadeProduto() {
        return unidadeProduto;
    }

    public void setUnidadeProduto(Integer unidadeProduto) {
        this.unidadeProduto = unidadeProduto;
    }

    public String getStatusProduto() {
        return statusProduto;
    }

    public void setStatusProduto(String statusProduto) {
        this.statusProduto = statusProduto;
    }

 


}
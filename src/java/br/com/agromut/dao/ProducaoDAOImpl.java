package br.com.agromut.dao;

import br.com.agromut.model.Estufa;
import br.com.agromut.model.Producao;
import br.com.agromut.model.Produto;
import br.com.agromut.model.UsuarioAdm;
import br.com.agromut.utill.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProducaoDAOImpl implements GenericDAO {

    private Connection conn;

    public ProducaoDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {

        Producao producao = (Producao) object;
        PreparedStatement stmt = null;
        String sql = "insert into producao(id_produto, id_estufa, dataplantio_producao) values (?, ?, ?);"; //retornando algo (returning)
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, producao.getProdutoProducao().getIdProduto());
            stmt.setInt(2, producao.getIdEstufa().getIdEstufa());
            stmt.setDate(3, new java.sql.Date(producao.getDataPlantioProducao().getTime()));
            stmt.execute(); //insert retornando alguma coisa (result set) / insert normal= result
            return true;
        } catch (SQLException ex) {
            System.err.println("Problemas ao cadastrar! Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.err.println("Problemas ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Object> listar() {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Object> listarprodutoestufa() {
        List<Object> producaolist = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = " select * from produto, estufa, producao"
                + " where estufa.id_estufa = producao.id_estufa"
                + " and produto.id_produto = producao.id_produto;";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Producao producao = new Producao();
                
                Produto produto = new Produto();
                produto.setIdProduto(rs.getInt("id_produto"));
                produto.setDescricaoProduto(rs.getString("descricao_produto"));
                produto.setTempocultivoProduto(rs.getInt("tempocultivo_produto"));
                produto.setTemperaturaProduto(rs.getString("temperatura_produto"));
                produto.setUmidadeProduto(rs.getString("umidade_produto"));
                produto.setStatusProduto(rs.getString("status_produto"));
                produto.setUnidadeProduto(rs.getInt("unidade_produto"));
                produto.setEspecieProduto(rs.getString("especie_produto"));
                produto.setIdUsuarioAdm(new UsuarioAdm(rs.getInt("id_usuarioadm")));                
                
                producao.setProdutoProducao(produto);
                
                Estufa estufa = new Estufa();
                estufa.setIdEstufa(rs.getInt("id_estufa"));                
                producao.setIdEstufa(estufa);
                producao.setDataPlantioProducao(rs.getDate("dataplantio_producao"));
                
                
                producaolist.add(producao);
            }
        } catch (Exception ex) {
            System.out.println("Problemas ao listar produtos ativos! Erro: " + ex.getMessage());
            ex.printStackTrace();

        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return producaolist;
    }

    @Override
    public Object carregar(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean alterar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

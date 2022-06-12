package br.com.agromut.dao;

import br.com.agromut.model.Estufa;
import br.com.agromut.model.Producao;
import br.com.agromut.model.Produto;
import br.com.agromut.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        String sql = "insert into producao(id_produto, id_estufa, dataplatio_producao) values (?, ?, ?);"; //retornando algo (returning)
         try{
             stmt = conn.prepareStatement(sql);
             stmt.setInt(1, producao.getProdutoProducao().getIdProduto());
             stmt.setInt(2, producao.getIdEstufa().getIdEstufa());
             stmt.setDate(3,  new java.sql.Date(producao.getDataPlantioProducao().getTime()));
             stmt.execute(); //insert retornando alguma coisa (result set) / insert normal= result
             return true;
         }catch (SQLException ex){
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

    @Override
    public Object carregar(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean alterar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  

  }

package br.com.agromut.dao;

import br.com.agromut.model.Estufa;
import br.com.agromut.model.Produto;
import br.com.agromut.model.UsuarioAdm;
import br.com.agromut.utill.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAOImpl implements GenericDAO {

    private Connection conn;

    public ProdutoDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {

        Produto produto = (Produto) object;
        PreparedStatement stmt = null;

        String sql = "insert into produto(descricao_produto, especie_produto, unidade_produto, tempocultivo_produto, "
                + "temperatura_produto, umidade_produto, status_produto, id_usuarioadm) values(?, ?, ?, ?, ?, ?, ?, ?);";

        try {

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, produto.getDescricaoProduto());
            stmt.setString(2, produto.getEspecieProduto());
            stmt.setInt(3, produto.getUnidadeProduto());
            stmt.setInt(4, produto.getTempocultivoProduto());
            stmt.setString(5, produto.getTemperaturaProduto());
            stmt.setString(6, produto.getUmidadeProduto());
            stmt.setString(7, "T");
            stmt.setInt(8, produto.getIdUsuarioAdm().getIdUsuarioAdm());
            stmt.execute();
            return true;

        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar produto! Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;

        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    /* @Override
    public List<Object> listar() {
        List<Object> produtos = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "select * from produto;";

        try {
            stmt = conn.prepareStatement((sql));
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setIdProduto(rs.getInt("id_produto"));
                produto.setUnidadeProduto(rs.getInt("unidade_produto"));
                produto.setEspecieProduto(rs.getString("especie_produto"));
                produto.setTempocultivoProduto(rs.getInt("tempocultivo_produto"));
                produto.setTemperaturaProduto(rs.getDouble("temperatura_produto"));
                produto.setUmidadeProduto(rs.getDouble("umidade_produto"));
                produto.setDescricaoProduto(rs.getString("descricao_produto"));
                produto.setStatusProduto(rs.getString("status_produto"));
                produto.setIdUsuarioAdm(new UsuarioAdm(rs.getInt("id_usuarioadm")));

                produtos.add(produto);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar produtos! Erro:" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + e.getMessage());
                e.printStackTrace();
            }

        }
        return produtos;
    }
     */
    @Override
    public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Produto produto = null;
        String sql = "select * from produto where id_produto = ?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();

            while (rs.next()) {
                produto = new Produto();
                produto.setIdProduto(rs.getInt("id_produto"));
                produto.setIdUsuarioAdm(new UsuarioAdm(rs.getInt("id_usuarioadm")));
                produto.setUnidadeProduto(rs.getInt("unidade_produto"));
                produto.setEspecieProduto(rs.getString("especie_produto"));
                produto.setTempocultivoProduto(rs.getInt("tempocultivo_produto"));
                produto.setTemperaturaProduto(rs.getString("temperatura_produto"));
                produto.setUmidadeProduto(rs.getString("umidade_produto"));
                produto.setDescricaoProduto(rs.getString("descricao_produto"));
                produto.setStatusProduto(rs.getString("status_produto"));

            }

        } catch (Exception ex) {
            System.out.println("Problemas ao excluir o produto! Erro" + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return produto;
    }

    @Override
    public Boolean alterar(Object object) {
        Produto produto = (Produto) object;
        PreparedStatement stmt = null;
        String sql = "update produto set especie_produto = ?, tempocultivo_produtivo = ?, umidade_produto = ?, temperatura_produto = ?,"
                + " descricao_produto = ?, unidade_produto = ?, status_produto = ?, where id_produto = ?, id_usuarioadm = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, produto.getEspecieProduto());
            stmt.setInt(2, produto.getTempocultivoProduto());
            stmt.setString(3, produto.getUmidadeProduto());
            stmt.setString(4, produto.getTemperaturaProduto());
            stmt.setString(5, produto.getDescricaoProduto());
            stmt.setInt(6, produto.getUnidadeProduto());
            stmt.setString(7, produto.getStatusProduto());
            stmt.setInt(8, produto.getIdProduto());
            stmt.setInt(6, produto.getIdUsuarioAdm().getIdUsuarioAdm());
            stmt.executeUpdate();
            return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao alterar o produto! Erro" + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + e.getMessage());
                e.printStackTrace();
            }
        }

    }

    public Boolean ativarproduto(Object object) {
        Produto produto = (Produto) object;
        PreparedStatement stmt = null;
        String sql = "update produto set status_produto = ? where id_produto = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "T");
            stmt.setInt(2, produto.getIdProduto());

            stmt.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Problemas ao alterar status! Erro: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    public Boolean inativarproduto(Object object) {
        Produto produto = (Produto) object;
        PreparedStatement stmt = null;
        String sql = "update produto set status_produto = ? where id_produto = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "F");
            stmt.setInt(2, produto.getIdProduto());

            stmt.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Problemas ao alterar status! Erro: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    public List<Object> listarInativosProduto() {
        List<Object> produtos = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "select p.* from produto p where p.status_produto = 'F';";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setIdProduto(rs.getInt("id_produto"));
                produto.setEspecieProduto(rs.getString("especie_produto"));
                produto.setTempocultivoProduto(rs.getInt("tempocultivo_produto"));
                produto.setTemperaturaProduto(rs.getString("temperatura_produto"));
                produto.setUmidadeProduto(rs.getString("umidade_produto"));
                produto.setDescricaoProduto(rs.getString("descricao_produto"));
                produto.setUnidadeProduto(rs.getInt("unidade_produto"));
                produto.setStatusProduto(rs.getString("status_produto"));
                produto.setIdUsuarioAdm(new UsuarioAdm(rs.getInt("id_usuarioadm")));

                produtos.add(produto);
            }
        } catch (Exception ex) {
            System.out.println("Problemas ao listar usuários administradores inativos! Erro: " + ex.getMessage());
            ex.printStackTrace();

        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return produtos;
    }

    public List<Object> listarAtivosProduto() {
        List<Object> produtos = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "select p.* from produto p where status_produto = 'T';";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
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

                produtos.add(produto);
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
        return produtos;
    }

@Override
    public List<Object> listar() {
        List<Object> nomeprodutos = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String sql = "select * from produto where status_produto = 'T' order by descricao_produto;";
        
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setIdProduto(rs.getInt("id_produto"));
                produto.setDescricaoProduto(rs.getString("descricao_produto"));
                nomeprodutos.add(produto);
            }   
            } catch (Exception ex) {
            System.out.println("Problemas ao listar produtos! Erro: " + ex.getMessage());
            ex.printStackTrace();
                    
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage()); 
                e.printStackTrace();
            }
        }
        return nomeprodutos;
}

}

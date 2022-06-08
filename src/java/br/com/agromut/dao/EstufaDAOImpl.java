package br.com.agromut.dao;

import br.com.agromut.model.Estufa;
import br.com.agromut.model.Produto;
import br.com.agromut.model.Estufa;
import br.com.agromut.model.UsuarioAdm;
import br.com.agromut.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstufaDAOImpl implements GenericDAO {

    private Connection conn;

    public EstufaDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        {

            Estufa estufa = (Estufa) object;
            PreparedStatement stmt = null;

            String sql = "insert into estufa(capacidade_estufa, temperatura_estufa, umidade_estufa,"
                    + "status_estufa, id_usuarioadm) values(?, ?, ?, ?, ?);";

            try {

                stmt = conn.prepareStatement(sql);
                stmt.setString(1, estufa.getCapacidadeEstufa());
                stmt.setString(2,estufa.getDescricaoEstufa());
                stmt.setString(3, estufa.getTemperaturaEstufa());
                stmt.setString(4, estufa.getUmidadeEstufa());
                stmt.setString(5, "T");
                stmt.setInt(6, estufa.getIdEstufa());
                stmt.setInt(7, estufa.getIdUsuarioAdm().getIdUsuarioAdm());
                stmt.execute();
                return true;

            } catch (Exception ex) {
                System.out.println("Problemas ao cadastrar estufa! Erro: " + ex.getMessage());
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
    }

    /*@Override
    public List<Object> listar() {
        List<Object> estufas = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "select * from estufa;";

        try {
            stmt = conn.prepareStatement((sql));
            rs = stmt.executeQuery();

            while (rs.next()) {
                Estufa estufa = new Estufa();
                estufa.setIdEstufa(rs.getInt("id_estufa"));
                estufa.setCapacidadeEstufa(rs.getString("capacidade_estufa"));
                estufa.setTemperaturaEstufa(rs.getDouble("temperatura_estufa"));
                estufa.setUmidadeEstufa(rs.getDouble("umidade_estufa"));
                estufa.setStatusEstufa(rs.getString("status_estufa"));
                estufa.setIdEstufa(new Estufa(rs.getInt("id_usuarioadm")));

                estufas.add(estufa);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar estufas! Erro:" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + e.getMessage());
                e.printStackTrace();
            }

        }
        return estufas;
    }*/
    @Override
    public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Estufa estufa = null;
        String sql = "select * from estufa where id_estufa = ?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();

            while (rs.next()) {
                estufa = new Estufa();
                estufa.setIdEstufa(rs.getInt("id_estufa"));
                estufa.setIdUsuarioAdm(new UsuarioAdm(rs.getInt("id_usuarioadm")));
                estufa.setCapacidadeEstufa(rs.getString("capacidade_estufa"));
                estufa.setTemperaturaEstufa(rs.getString("temperatura_estufa"));
                estufa.setUmidadeEstufa(rs.getString("umidade_estufa"));
                estufa.setStatusEstufa(rs.getString("temperatura_produto"));

            }

        } catch (Exception ex) {
            System.out.println("Problemas ao excluir o estufa! Erro" + ex.getMessage());
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
        return estufa;
    }

    @Override
    public Boolean alterar(Object object) {
        Estufa estufa = (Estufa) object;
        PreparedStatement stmt = null;
        String sql = "update estufa set capacidade_estufa = ?, temperatura_estufa = ?, umidade_estufa = ?, status_estufa = ?,"
                + " where id_estufa = ?, id_usuarioadm = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, estufa.getCapacidadeEstufa());
            stmt.setString(2, estufa.getTemperaturaEstufa());
            stmt.setString(3, estufa.getUmidadeEstufa());
            stmt.setString(4, estufa.getStatusEstufa());
            stmt.setInt(5, estufa.getIdEstufa());
            stmt.setInt(6, estufa.getIdUsuarioAdm().getIdUsuarioAdm());

            stmt.executeUpdate();
            return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao alterar o estufa! Erro" + ex.getMessage());
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

    public Boolean ativarestufa(Object object) {
        Estufa estufa = (Estufa) object;
        PreparedStatement stmt = null;
        String sql = "update estufa set status_estufa = ? where id_estufa = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "T");
            stmt.setInt(2, estufa.getIdEstufa());

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

    public Boolean inativarestufa(Object object) {
        Estufa estufa = (Estufa) object;
        PreparedStatement stmt = null;
        String sql = "update estufa set status_estufa = ? where id_estufa = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "F");
            stmt.setInt(2, estufa.getIdEstufa());

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

    public List<Object> listarInativosEstufa() {
        List<Object> estufas = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "select e.* from estufa e where e.id_estufa and status_estufa = 'F';";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Estufa estufa = new Estufa();
                estufa.setIdEstufa(rs.getInt("id_estufa"));
                estufa.setDescricaoEstufa(rs.getString("descricao_estufa"));
                estufa.setCapacidadeEstufa(rs.getString("capacidade_estufa"));
                estufa.setTemperaturaEstufa(rs.getString("temperatura_estufa"));
                estufa.setUmidadeEstufa(rs.getString("umidade_estufa"));
                estufa.setStatusEstufa(rs.getString("status_estufa"));
                estufa.setIdUsuarioAdm(new UsuarioAdm(rs.getInt("id_usuarioadm")));

                estufas.add(estufa);
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
        return estufas;
    }

    public List<Object> listarAtivosEstufa() {
        List<Object> estufas = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "select e.* from estufa e where e.id_estufa and status_estufa = 'T';";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Estufa estufa = new Estufa();
                estufa.setIdEstufa(rs.getInt("id_estufa"));
                estufa.setDescricaoEstufa(rs.getString("descricao_estufa"));
                estufa.setCapacidadeEstufa(rs.getString("capacidade_estufa"));
                estufa.setTemperaturaEstufa(rs.getString("temperatura_estufa"));
                estufa.setUmidadeEstufa(rs.getString("umidade_estufa"));
                estufa.setStatusEstufa(rs.getString("status_estufa"));
                estufa.setIdUsuarioAdm(new UsuarioAdm(rs.getInt("id_usuarioadm")));

                estufas.add(estufa);
            }
        } catch (Exception ex) {
            System.out.println("Problemas ao listar usuários administradores ativos! Erro: " + ex.getMessage());
            ex.printStackTrace();

        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return estufas;
    }

    @Override
    public List<Object> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

package br.com.agromut.dao;

import br.com.agromut.model.UsuarioAdm;
import br.com.agromut.util.Conversoes;
import br.com.agromut.util.ConnectionFactory;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioAdmDAOImpl implements GenericDAO {

    private Connection conn;

    public UsuarioAdmDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    /*PRONTO*/
    public Object logarUsuarioAdm(String login, String senha) {

        PreparedStatement stmt = null;
        ResultSet rs = null; //exibir resultado tirado do banco

        UsuarioAdm usuarioadm = null;

        String sql = "select u.*, ua.* from usuario u, usuarioadm ua where u.id_usuario = ua.id_usuario and login_usuario = ? and senha_usuario = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();

            while (rs.next()) {
                usuarioadm = new UsuarioAdm();
                usuarioadm.setIdUsuarioAdm(rs.getInt("id_usuarioadm"));
                usuarioadm.setIdUsuario(rs.getInt("id_usuario"));
                usuarioadm.setLoginUsuario(rs.getString("login_usuario"));
                usuarioadm.setSenhaUsuario(rs.getString("senha_usuario"));
                usuarioadm.setNomeUsuario(rs.getString("nome_usuario"));
                usuarioadm.setCepUsuario(rs.getString("cep_usuario"));
                usuarioadm.setCidadeUsuario(rs.getString("cidade_usuario"));
                usuarioadm.setBairroUsuario(rs.getString("bairro_usuario"));
                usuarioadm.setCelularUsuario(rs.getString("celular_usuario"));
                usuarioadm.setEmailUsuario(rs.getString("email_usuario"));
                usuarioadm.setNumUsuario(rs.getString("num_usuario"));
                usuarioadm.setRuaUsuario(rs.getString("rua_usuario"));
                usuarioadm.setUfUsuario(rs.getString("uf_usuario"));
                usuarioadm.setStatusUsuarioAdm(rs.getString("status_usuarioadm"));
            }
        } catch (Exception ex) { //tratamento de erros
            System.out.println("Problemas ao encontrar usuarioadm! Erro: " + ex.getMessage());
            ex.printStackTrace();

        } finally { // obrigatório, para haver a segurança dos dados presentes no banco
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return usuarioadm;
    }

    /*PRONTO*/
    @Override
    public Boolean cadastrar(Object object) {

        UsuarioAdm usuarioadm = (UsuarioAdm) object;
        PreparedStatement stmt = null;

        String sql = "insert into usuarioadm(cnpj_usuarioadm, tipo_usuarioadm, status_usuarioadm, id_usuario) values(?, ?, ?, ?);";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuarioadm.getCnpjUsuarioAdm());
            stmt.setString(2, usuarioadm.getTipoUsuarioAdm());
            stmt.setString(3, "F");
            stmt.setInt(4, new UsuarioDAOImpl().cadastrar(usuarioadm));
            stmt.execute();
            return true;

        } catch (Exception ex) {
            System.out.println("Problemas ao enviar o formulário! Erro: " + ex.getMessage());
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

    public Boolean ativaradm(Object object) {
        UsuarioAdm usuarioadm = (UsuarioAdm) object;
        PreparedStatement stmt = null;
        String sql = "update usuarioadm set status_usuarioadm = ? where id_usuarioadm = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "T");
            stmt.setInt(2, usuarioadm.getIdUsuarioAdm());

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

    public Boolean inativaradm(Object object) {
        UsuarioAdm usuarioadm = (UsuarioAdm) object;
        PreparedStatement stmt = null;
        String sql = "update usuarioadm set status_usuarioadm = ? where id_usuarioadm = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "F");
            stmt.setInt(2, usuarioadm.getIdUsuarioAdm());

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

    public List<Object> listarInativosAdm() {
        List<Object> usuariosAdm = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "select u.*, ua.* from usuario u, usuarioadm ua where u.id_usuario = ua.id_usuario and status_usuarioadm = 'F';";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                UsuarioAdm usuarioAdm = new UsuarioAdm();
                usuarioAdm.setIdUsuarioAdm(rs.getInt("id_usuarioadm"));
                usuarioAdm.setNomeUsuario(rs.getString("nome_usuario"));
                usuarioAdm.setEmailUsuario(rs.getString("email_usuario"));
                usuarioAdm.setCelularUsuario(rs.getString("celular_usuario"));
                usuarioAdm.setCpfUsuario(rs.getString("cpf_usuario"));
                usuarioAdm.setCnpjUsuarioAdm(rs.getString("cnpj_usuarioadm"));
                usuarioAdm.setStatusUsuarioAdm(rs.getString("status_usuarioadm"));
                usuarioAdm.setIdUsuario(rs.getInt("id_usuario"));

                usuariosAdm.add(usuarioAdm);
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
        return usuariosAdm;
    }

    public List<Object> listarAtivosAdm() {
        List<Object> usuariosAdm = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "select u.*, ua.* from usuario u, usuarioadm ua where u.id_usuario = ua.id_usuario and status_usuarioadm = 'T';";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                UsuarioAdm usuarioAdm = new UsuarioAdm();
                usuarioAdm.setIdUsuarioAdm(rs.getInt("id_usuarioadm"));
                usuarioAdm.setNomeUsuario(rs.getString("nome_usuario"));
                usuarioAdm.setEmailUsuario(rs.getString("email_usuario"));
                usuarioAdm.setCelularUsuario(rs.getString("celular_usuario"));
                usuarioAdm.setCpfUsuario(rs.getString("cpf_usuario"));
                usuarioAdm.setCnpjUsuarioAdm(rs.getString("cnpj_usuarioadm"));
                usuarioAdm.setStatusUsuarioAdm(rs.getString("status_usuarioadm"));
                usuarioAdm.setIdUsuario(rs.getInt("id_usuario"));

                usuariosAdm.add(usuarioAdm);
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
        return usuariosAdm;
    }

    @Override
    public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        UsuarioAdm usuarioadm = null;
        String sql = "select u.*, ua.* from usuario u, usuarioadm ua where u.id_usuario = ua.id_usuario and ua.id_usuario = ?;";
        // String sql = "select * from aluno where idaluno = ?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();

            while (rs.next()) {
                usuarioadm = new UsuarioAdm();
                usuarioadm.setIdUsuarioAdm(rs.getInt("id_usuarioadm"));
                usuarioadm.setNomeUsuario(rs.getString("nome_usuario"));
                usuarioadm.setEmailUsuario(rs.getString("email_usuario"));
                usuarioadm.setCelularUsuario(rs.getString("celular_usuario"));
                usuarioadm.setLoginUsuario(rs.getString("login_usuario"));
                usuarioadm.setSenhaUsuario(rs.getString("senha_usuario"));
                usuarioadm.setCepUsuario(rs.getString("cep_usuario"));
                usuarioadm.setUfUsuario(rs.getString("uf_usuario"));
                usuarioadm.setCidadeUsuario(rs.getString("cidade_usuario"));
                usuarioadm.setBairroUsuario(rs.getString("bairro_usuario"));
                usuarioadm.setRuaUsuario(rs.getString("rua_usuario"));
                usuarioadm.setNumUsuario(rs.getString("num_usuario"));
                usuarioadm.setIdUsuario(rs.getInt("id_usuario"));
            }
        } catch (SQLException ex) {
            System.err.println("Problemas ao carregar usuario adm! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.err.println("Problemas ao fechar a conexão! Erro: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return usuarioadm;
    }

/*public Boolean alterarUsuarioAdm(Object object) {
        UsuarioAdm usuarioadm = (UsuarioAdm) object;
        PreparedStatement stmt = null;
        String sql = "update usuario set nome_usuario = ?, email_usuario = ?, celular_usuario = ?, login_usuario = ?,"
                + " senha_usuario = ?, cep_usuario = ?, uf_usuario = ?, cidade_usuario = ?, bairro_usuario = ?, rua_usuario = ?, num_usuario = ? where id_usuario = ?;";
   
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuarioadm.getNomeUsuario());
            stmt.setString(2, usuarioadm.getEmailUsuario());
            stmt.setString(3, usuarioadm.getCelularUsuario());
            stmt.setString(4, usuarioadm.getLoginUsuario());      
            stmt.setString(5, usuarioadm.getSenhaUsuario());      
            stmt.setString(6, usuarioadm.getCepUsuario());      
            stmt.setString(7, usuarioadm.getUfUsuario());      
            stmt.setString(8, usuarioadm.getCidadeUsuario());      
            stmt.setString(9, usuarioadm.getBairroUsuario());      
            stmt.setString(10, usuarioadm.getRuaUsuario());      
            stmt.setString(11, usuarioadm.getNumUsuario());
            stmt.setInt(12, usuarioadm.getIdUsuario());
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
  }*/

    @Override
    public List<Object> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean alterar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

package br.com.agromut.dao;

import br.com.agromut.model.Estufa;
import br.com.agromut.model.UsuarioAdm;
import br.com.agromut.model.UsuarioFunc;
import br.com.agromut.model.UsuarioFunc;
import br.com.agromut.utill.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class UsuarioFuncDAOImpl implements GenericDAO {
    
    private Connection conn;

    public UsuarioFuncDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
      
    @Override
    public Boolean cadastrar(Object object) {
        UsuarioFunc usuariofunc = (UsuarioFunc) object;
        PreparedStatement stmt = null;

        String sql = "insert into usuariofunc(salario_usuariofunc, status_usuariofunc, id_usuario) values (?,?,?);";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuariofunc.getSalarioUsuarioFunc());
            stmt.setString(2, "T");
            stmt.setInt(3, new UsuarioDAOImpl().cadastrar(usuariofunc) );
            stmt.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar funcionário! Erro:" + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro");
                e.printStackTrace();
            }
        }
    }
   public Boolean ativarfunc (Object object) {
        UsuarioFunc usuariofunc = (UsuarioFunc) object;
        PreparedStatement stmt = null;
        String sql = "update usuariofunc set status_usuariofunc = ? where id_usuariofunc = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "T");
            stmt.setInt(2,usuariofunc.getIdUsuarioFunc());

            stmt.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Problemas ao ativar usuario! Erro: " + e.getMessage());
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
    
     public Boolean inativarfunc (Object object) {
        UsuarioFunc usuariofunc = (UsuarioFunc) object;
        PreparedStatement stmt = null;
        String sql = "update usuariofunc set status_usuariofunc = ? where id_usuariofunc = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "F");
            stmt.setInt(2,usuariofunc.getIdUsuarioFunc());

            stmt.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Problemas ao inativar funcinário! Erro: " + e.getMessage());
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
     
     public List<Object> listarInativosFunc() {
        List<Object> usuariosFunc = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "select u.*, uf.* from usuario u, usuariofunc uf where u.id_usuario = uf.id_usuario and status_usuariofunc = 'F';";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                UsuarioFunc usuarioFunc = new UsuarioFunc();
                usuarioFunc.setIdUsuarioFunc(rs.getInt("id_usuariofunc"));
                usuarioFunc.setNomeUsuario(rs.getString("nome_usuario"));
                usuarioFunc.setEmailUsuario(rs.getString("email_usuario"));
                usuarioFunc.setCelularUsuario(rs.getString("celular_usuario"));
                usuarioFunc.setCpfUsuario(rs.getString("cpf_usuario"));
                usuarioFunc.setSalarioUsuarioFunc(rs.getString("salario_usuariofunc"));
                usuarioFunc.setStatusUsuarioFunc(rs.getString("status_usuariofunc"));
                usuarioFunc.setIdUsuario(rs.getInt("id_usuario"));
            
                usuariosFunc.add(usuarioFunc);
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
        return usuariosFunc;
    }
    
    public List<Object> listarAtivosFunc() {
        List<Object> usuariosFunc = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "select u.*, uf.* from usuario u, usuariofunc uf where u.id_usuario = uf.id_usuario and status_usuariofunc = 'T';";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                UsuarioFunc usuarioFunc = new UsuarioFunc();
                usuarioFunc.setIdUsuarioFunc(rs.getInt("id_usuariofunc"));
                usuarioFunc.setNomeUsuario(rs.getString("nome_usuario"));
                usuarioFunc.setEmailUsuario(rs.getString("email_usuario"));
                usuarioFunc.setCelularUsuario(rs.getString("celular_usuario"));
                usuarioFunc.setSalarioUsuarioFunc(rs.getString("salario_usuariofunc"));
                usuarioFunc.setCpfUsuario(rs.getString("cpf_usuario"));
                usuarioFunc.setStatusUsuarioFunc(rs.getString("status_usuariofunc"));
                usuarioFunc.setIdUsuario(rs.getInt("id_usuario"));
            
                usuariosFunc.add(usuarioFunc);
            } 
            } catch (Exception ex) {
            System.out.println("Problemas ao listar usuários funcionários ativos! Erro: " + ex.getMessage());
            ex.printStackTrace();

        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return usuariosFunc;
    }
    
     public Object logarUsuarioFunc(String login, String senha) {

        PreparedStatement stmt = null;
        ResultSet rs = null; //exibir resultado tirado do banco

        UsuarioFunc usuariofunc = null;

        String sql = "select u.*, uf.* from usuario u, usuariofunc uf where u.id_usuario = uf.id_usuario and login_usuario = ? and senha_usuario = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();

            while (rs.next()) {
                usuariofunc = new UsuarioFunc();
                usuariofunc.setLoginUsuario(rs.getString("login_usuario"));
                usuariofunc.setSenhaUsuario(rs.getString("senha_usuario"));
                usuariofunc.setNomeUsuario(rs.getString("nome_usuario"));
                usuariofunc.setStatusUsuarioFunc(rs.getString("status_usuariofunc"));
            }
        } catch (Exception ex) { //tratamento de erros
            System.out.println("Problemas ao encontrar usuariofunc! Erro: " + ex.getMessage());
            ex.printStackTrace();

        } finally { // obrigatório, para haver a segurança dos dados presentes no banco
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return usuariofunc;
    }
    

    @Override
    public List<Object> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean alterar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        UsuarioFunc usuariofunc = null;
        String sql = "select u.*, uf.* from usuario u, usuariofunc uf where u.id_usuario = uf.id_usuario and uf.id_usuario = ?;";
        // String sql = "select * from aluno where idaluno = ?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();

            while (rs.next()) {
                usuariofunc = new UsuarioFunc();
                usuariofunc.setIdUsuarioFunc(rs.getInt("id_usuariofunc"));
                usuariofunc.setNomeUsuario(rs.getString("nome_usuario"));
                usuariofunc.setEmailUsuario(rs.getString("email_usuario"));
                usuariofunc.setCelularUsuario(rs.getString("celular_usuario"));
                usuariofunc.setLoginUsuario(rs.getString("login_usuario"));
                usuariofunc.setSenhaUsuario(rs.getString("senha_usuario"));
                usuariofunc.setCepUsuario(rs.getString("cep_usuario"));
                usuariofunc.setUfUsuario(rs.getString("uf_usuario"));
                usuariofunc.setCidadeUsuario(rs.getString("cidade_usuario"));
                usuariofunc.setBairroUsuario(rs.getString("bairro_usuario"));
                usuariofunc.setRuaUsuario(rs.getString("rua_usuario"));
                usuariofunc.setNumUsuario(rs.getString("num_usuario"));
                usuariofunc.setSalarioUsuarioFunc(rs.getString("salario_usuario"));
                usuariofunc.setIdUsuario(rs.getInt("id_usuario"));
            }
        } catch (SQLException ex) {
            System.err.println("Problemas ao carregar usuario func! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.err.println("Problemas ao fechar a conexão! Erro: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return usuariofunc;
    }
    
}



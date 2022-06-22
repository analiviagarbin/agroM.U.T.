package br.com.agromut.dao;

import br.com.agromut.model.Usuario;
import br.com.agromut.utill.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;


public class UsuarioDAOImpl{

    private Connection conn;

    public UsuarioDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    
    public Integer cadastrar(Usuario usuario) {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Integer idUsuario = null;
       
        String sql = "insert into usuario(nome_usuario, email_usuario, "
                + "celular_usuario, login_usuario, senha_usuario, datanasc_usuario, "
                + "cpf_usuario, cep_usuario, uf_usuario, cidade_usuario, bairro_usuario, "
                + "rua_usuario, num_usuario, codigo_usuario) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) returning id_usuario;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNomeUsuario());
            stmt.setString(2, usuario.getEmailUsuario());
            stmt.setString(3, usuario.getCelularUsuario());
            stmt.setString(4, usuario.getLoginUsuario());
            stmt.setString(5, usuario.getSenhaUsuario());
            stmt.setDate(6,  new java.sql.Date(usuario.getDatanascUsuario().getTime()));
            stmt.setString(7, usuario.getCpfUsuario());
            stmt.setString(8, usuario.getCepUsuario());
            stmt.setString(9, usuario.getUfUsuario());
            stmt.setString(10, usuario.getCidadeUsuario());
            stmt.setString(11, usuario.getBairroUsuario());
            stmt.setString(12, usuario.getRuaUsuario());
            stmt.setString(13, usuario.getNumUsuario());
            stmt.setString(14, usuario.getCodigoUsuario());
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                idUsuario = rs.getInt("id_usuario");
            }
            
        } catch (Exception ex) {
            System.out.println("Problemas ao enviar o formulário! Erro: " + ex.getMessage());
            ex.printStackTrace();
          
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return idUsuario;
    }
    
    public Boolean alterar(Object object) {
        Usuario usuario = (Usuario) object;
        PreparedStatement stmt = null;
        String sql = "update usuario set nome_usuario = ?, email_usuario = ?, celular_usuario = ?, login_usuario = ?,"
                + " senha_usuario = ?, cep_usuario = ?, uf_usuario = ?, cidade_usuario = ?, bairro_usuario = ?, rua_usuario = ?, num_usuario = ? where id_usuario = ?;";
   
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNomeUsuario());
            stmt.setString(2, usuario.getEmailUsuario());
            stmt.setString(3, usuario.getCelularUsuario());
            stmt.setString(4, usuario.getLoginUsuario());      
            stmt.setString(5, usuario.getSenhaUsuario());      
            stmt.setString(6, usuario.getCepUsuario());      
            stmt.setString(7, usuario.getUfUsuario());      
            stmt.setString(8, usuario.getCidadeUsuario());      
            stmt.setString(9, usuario.getBairroUsuario());      
            stmt.setString(10, usuario.getRuaUsuario());      
            stmt.setString(11, usuario.getNumUsuario());
            stmt.setInt(12, usuario.getIdUsuario());
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

    /* public Object logarUsuario(String login, String senha) {

        PreparedStatement stmt = null;
        ResultSet rs = null; //exibir resultado tirado do banco

        Usuario usuario = null;

        String sql = "select * from usuario where login_usuario = ? and senha_usuario = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();

            while (rs.next()) {
                usuario = new Usuario();
                usuario.setLoginUsuario(rs.getString("login_usuario"));
                usuario.setSenhaUsuario(rs.getString("senha_usuario"));
                usuario.setCodigoUsuario(rs.getString("codigo_usuario"));
                usuario.setNomeUsuario(rs.getString("nome_usuario"));
            }
        } catch (Exception ex) { //tratamento de erros
            System.out.println("Problemas ao encontrar usuario! Erro: " + ex.getMessage());
            ex.printStackTrace();

        } finally { // obrigatório, para haver a segurança dos dados presentes no banco
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return usuario;
    }
*/
 

}

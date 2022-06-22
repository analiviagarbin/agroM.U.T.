package br.com.agromut.dao;

import br.com.agromut.model.Administrador;
import br.com.agromut.utill.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class AdmDAOImpl {

     private Connection conn;

    public AdmDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
    
    public Object logarAdm (String login, String senha) {

    PreparedStatement stmt = null;
    ResultSet rs = null; //exibir resultado tirado do banco

    Administrador administrador = null;

    String sql = "select a.* from administrador a where login_adm = ? and senha_adm = ?";

    
        try {
            stmt = conn.prepareStatement(sql);
        stmt.setString(1, login);
        stmt.setString(2, senha);
        rs = stmt.executeQuery();

        while (rs.next()) {
            administrador = new Administrador();
            administrador.setLoginAdministrador(rs.getString("login_adm"));
            administrador.setSenhaAdministrador(rs.getString("senha_adm"));
            administrador.setNomeAdministrador(rs.getString("nome_adm"));
        }
    }
    catch (Exception ex

    
        ) { //tratamento de erros
            System.out.println("Problemas ao encontrar administrador! Erro: " + ex.getMessage());
        ex.printStackTrace();

    }
    
        finally { // obrigatório, para haver a segurança dos dados presentes no banco
            try {
            ConnectionFactory.closeConnection(conn, stmt);
        } catch (Exception ex) {
            System.out.println("Problemas ao fechar a conexão! Erro: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    return administrador ;
}

 
    
}

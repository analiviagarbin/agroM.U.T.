package br.com.agromut.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {
    
      //criar o método que retorna uma conexão
    
    public static Connection getConnection() throws Exception{
        try{
            //carrega do driver do postegresql
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/bdagromut", "postgres", "postdba");
        } catch(Exception e){
            //manda uma mensagem de erro
            throw new Exception(e.getMessage());
        }
    }

public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) throws Exception{
    close(conn, stmt, rs);
}
public static void closeConnection(Connection conn, Statement stmt) throws Exception{
    close(conn, stmt, null);
}
public static void closeConnection(Connection conn) throws Exception{
    close(conn, null, null);
}

private static void close(Connection conn, Statement stmt, ResultSet rs) throws Exception{
    try{
        if(rs != null) rs.close();
        if(stmt != null) stmt.close();
        if(conn != null) conn.close();
    }catch(SQLException e){
        throw new Exception(e.getMessage());
    }
}
    
}
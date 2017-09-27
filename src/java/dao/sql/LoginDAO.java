/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author informatica
 */
public class LoginDAO {
    
     private static final String STRING_CONEXAO = "jdbc:mysql://localhost/forum?"
            + "user=root&password=alunoifc";
    
    public void verificaUsu(String user, int cod){
        try{
	    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	    Connection conn = DriverManager.getConnection(STRING_CONEXAO);
	    String sql = "select (login, senha) from forum";
	    PreparedStatement p = conn.prepareStatement(sql);
	    // definir o valor de cada um dos parâmetros...
	    p.setString(1, user);
	    p.setInt(2, cod);
	    p.execute();
	    conn.close();
	}catch(SQLException e){
	    System.out.println("Erro ao verificar usuário no banco de dados.");
	}
    }
    
}

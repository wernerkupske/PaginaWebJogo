
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class forumDAO {
    private static final String STRING_CONEXAO = "jdbc:mysql://localhost/forum?"
            + "user=root&password=alunoifc";
    
    public forumDTO insereDados (String nome, String txt) throws SQLException{
        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql = "insert into forum values (?,?)";
        return null;
    }
    
    public forumDTO carregaDados(){
        
    }
}

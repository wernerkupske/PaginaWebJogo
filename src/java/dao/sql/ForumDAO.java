package dao.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.ForumDTO;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author informatica
 */
public class ForumDAO {

    private static final String STRING_CONEXAO = "jdbc:mysql://localhost/forum?"
            + "user=root&password=alunoifc";

    public void insereDados(String nome, String txt) throws SQLException {
        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql = "insert into forum values (?,?)";
        PreparedStatement p = conn.prepareStatement(sql);
        // definir o valor de cada um dos parâmetros...
        ResultSet rs = p.executeQuery();
        ForumDTO forumDTO;
        forumDTO = null;
        if (rs.next()) {
            forumDTO = new ForumDTO();
            forumDTO.setNome(rs.getString(1));
            forumDTO.setMensag(rs.getString(2));
        }
        conn.close();
    }

    public ForumDTO carregaDados() throws SQLException {
        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql = "select * from forum";
        return null;
    }
}

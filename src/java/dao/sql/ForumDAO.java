package dao.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    
    public void insereDados(String nome, String txt, String horario){
        try{
	    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	    Connection conn = DriverManager.getConnection(STRING_CONEXAO);
	    String sql = "insert into forum(nome, msg, strData) values (?,?,?)";
	    PreparedStatement p = conn.prepareStatement(sql);
	    // definir o valor de cada um dos parâmetros...
	    p.setString(1, nome);
	    p.setString(2, txt);
	    p.setString(3, horario);
	    p.execute();
	    conn.close();
	}catch(SQLException e){
	    System.out.println("Erro ao inserir dados no banco.");
	}
	
    }

    public ArrayList<ForumDTO> carregaDados() throws SQLException {
	ArrayList<ForumDTO> ret = new ArrayList();
	try{
	    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	    Connection conn = DriverManager.getConnection(STRING_CONEXAO);
	    String sql = "select * from forum";
	    PreparedStatement p = conn.prepareStatement(sql);
	    ResultSet rs = p.executeQuery();
	    while (rs.next()) {
		ForumDTO dto = new ForumDTO(rs.getString("nome"), rs.getString("msg"), rs.getString("strData"));
		ret.add(dto);
	    }
	}catch(SQLException e){
	    System.out.println("Erro ao carregar mensagens do banco.");
	}
        return ret;
    }
    
}

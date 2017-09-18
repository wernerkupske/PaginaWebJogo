package dao.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.RankingDTO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author informatica
 */
public class RankingDAO {

    private static final String STRING_CONEXAO = "jdbc:mysql://localhost/forum?"
            + "user=root&password=alunoifc";

    public ArrayList carregaPontucao() {
        ArrayList<RankingDTO> listaRetorno = new ArrayList();
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection conn = DriverManager.getConnection(STRING_CONEXAO);
            String sql = "select nome, score from pontuacao \n"
                    + "order by score desc";
            // enviar o select para ser analisado pelo banco
            // de dados...
            PreparedStatement p = conn.prepareStatement(sql);
            // definir o valor de cada um dos parâmetros...
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                RankingDTO rankingDTO = new RankingDTO(rs.getString("nome"), rs.getInt("score"));
                listaRetorno.add(rankingDTO);
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao carregar pontuação.");
            e.printStackTrace();
        }
        return listaRetorno;
    }
}
    
    /*public void inserePontuacao(String nome, int scr){
	try {
	    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	    Connection conn = DriverManager.getConnection(STRING_CONEXAO);
	    String sql = "insert into pontuacao(nome, score) values(?, ?)";
	    // enviar o select para ser analisado pelo banco
	    // de dados...
	    PreparedStatement p = conn.prepareStatement(sql);
	    p.setString(1, nome);
	    p.setInt(2, scr);
	    p.execute();
	    conn.close();
	} catch (SQLException e) {
	    System.out.println("Erro ao inserir pontuação.");
	    e.printStackTrace();
	}
    }

}
*/

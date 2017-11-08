package dao.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.RankingDTO;

public class RankingDAO {

    private static final String STRING_CONEXAO = "jdbc:mysql://localhost/forum?"
            + "user=root&password=alunoifc";

    public ArrayList carregaPontucao() {
        ArrayList<RankingDTO> listaRetorno = new ArrayList();
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection conn = DriverManager.getConnection(STRING_CONEXAO);
            String sql = "select j.nickname, j.id_jogador, p.score, p.modo_jogo from jogador j "
                    + "inner join jogada p on j.id_jogador = p.id_jogador"
                    + "group by score desc";
            // enviar o select para ser analisado pelo banco
            // de dados...
            PreparedStatement p = conn.prepareStatement(sql);
            // definir o valor de cada um dos parâmetros...
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                RankingDTO rankingDTO = new RankingDTO(rs.getInt("idJogador"), rs.getString("nome"), rs.getInt("score"), rs.getString("modoDeJogo"));
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

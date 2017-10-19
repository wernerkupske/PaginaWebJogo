package dao.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.RankingInfinitoDTO;

public class RankingInfinitoDAO {

    private static final String STRING_CONEXAO = "jdbc:mysql://localhost/forum?"
            + "user=root&password=alunoifc";

    public ArrayList carregaPontuacao() throws SQLException {
        ArrayList<RankingInfinitoDTO> listaRetorno = new ArrayList();
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            try (Connection conn = DriverManager.getConnection(STRING_CONEXAO)) {
                String sql = "select nome, score from pontuacaoInfinito \n"
                        + "order by score desc";
                PreparedStatement p = conn.prepareStatement(sql);
                ResultSet rs = p.executeQuery();
                while (rs.next()) {
                    RankingInfinitoDTO rankingInfinitoDTO = new RankingInfinitoDTO(rs.getString("nome"), rs.getInt("scoreInf"));
                    listaRetorno.add(rankingInfinitoDTO);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao carregar pontuação.");
        }
        return listaRetorno;
    }
}

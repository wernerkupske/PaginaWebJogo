
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
     
      public ArrayList<RankingDTO> montaListaProdutos() throws SQLException, Exception {
        ArrayList<RankingDTO> listaRetorno = new ArrayList();
        // estabelecer a conexão...mysql-connector-java-5.1.42-bin.jar
        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql = "select codProd, nomeProd, precoProd, qtdProd from Produtos";
        // enviar o select para ser analisado pelo banco
        // de dados...
        PreparedStatement p = conn.prepareStatement(sql);
        // definir o valor de cada um dos parâmetros...
        ResultSet rs = p.executeQuery();
        while (rs.next()) {
            RankingDTO rankingDTO = new RankingDTO();
            rankingDTO.setNome(rs.getString(1));
            rankingDTO.setPontuacao(rs.getInt(2));
            listaRetorno.add(rankingDTO);
        }
        conn.close();
        return listaRetorno;
    }
      
}

package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class User {

    public Connection conectarBd() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://8809/forum?user=root&password=alunoifc";
            conn = DriverManager.getConnection(url);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex) {

        }
        return conn;
    }

    public String nome = "";
    public boolean result = false;

    public boolean verificarUsuario(String login, String senha) throws SQLException {
        String sql = "";
        Connection conn = conectarBd();
        sql += "select nome from login ";
        sql += "where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "';";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                result = false;
                nome = rs.getString("nome");
            }
        } catch (SQLException ex) {

        }
        return result ;
    }
    
}

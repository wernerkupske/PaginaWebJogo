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
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            //Class.forName("com.mysql.Driver.Manager").newInstance();
            //String url = "jdbc:mysql://forum?user=root&password=alunoifc";
            //String url = "jdbc:mysql://8809/forum?user=root&password=alunoifc";
            String serverName = "localhost";
            String mydatabase = "forum";
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String userName = "root";
            String password = "alunoifc";

            conn = DriverManager.getConnection(url, userName, password);
            //conn = DriverManager.getConnection(url);
        } catch (ClassNotFoundException ex) {
            System.out.println("erro ao conectar: " + ex.getMessage());
        }
        return conn;
    }

    public String nome = "";
    public boolean result = false;

    public boolean verificarUsuario(String login, String senha) throws SQLException {
        String sql = "";
        Connection conn = conectarBd();
        sql += "select login, senha from login ";
        sql += "where login = " + "'" + login + "'";
        sql += " and senha = " + "" + senha + ";";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
        } catch (SQLException ex) {

        }
        return result;
    }

}

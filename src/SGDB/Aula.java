package SGDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Aula {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/servidor", "root", "1234");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int Inserir(String disciplinaAssociada, String salaAssociada, String alunosPresentes, String conteudoProgramatico) {

        Connection con = new Aula().getConnection();

        String sql = "INSERT INTO aula(disciplinaAssociada, , salaAulaAssociada, alunosPResentes, conteudoProgramatico) VALUES(?,?,?,?)";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, disciplinaAssociada);
            stmt.setString(2, salaAssociada);
            stmt.setString(3, alunosPresentes);
            stmt.setString(4, conteudoProgramatico);
            stmt.execute();
            stmt.close();
            return 0;

        } catch (SQLException u) {
            return 1;
        }
    }

    public int Editar(String idAula, String disciplinaAssociada, String salaAssociada, String alunosPesentes, String conteudoProgramatico) {

        Connection con = new Aula().getConnection();

        String sql = "UPDATE aula SET disciplinaAssociada = ?, salaAssociada = ?, alunosPrsentes = ?, conteudoProgramatico = ? WHERE idAula = ?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, disciplinaAssociada);
            stmt.setString(2, salaAssociada);
            stmt.setString(3, alunosPesentes);
            stmt.setString(4, conteudoProgramatico);
            stmt.setInt(5, Integer.parseInt(idAula));
            stmt.execute();
            stmt.close();
            return 0;
        } catch (SQLException u) {
            return 1;
        }
    }

    public int Deletar(String id) {
        Connection con = new Aula().getConnection();

        String sql = "DELETE FROM aula WHERE idAula = ?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(id));
            stmt.execute();
            stmt.close();
            return 0;
        } catch (SQLException u) {
            return 1;
        }

    }

    public String ConsultarAula(String id) {

        Connection con = new Aula().getConnection();
        String sql = "SELECT * FROM aula where idAula = ?";
        String mensagem = "04#";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(id));
            ResultSet resultado = stmt.executeQuery();
            resultado.next();
            mensagem = mensagem + resultado.getInt("idAula") + "#"
                    + resultado.getString("disciplinaAssociada") + "#"
                    + resultado.getString("salaAssociada") + "#"
                    + resultado.getString("aluosPresentes") + "#"
                    + resultado.getString("conteudoProgramatico") + "#";
            stmt.close();
            return mensagem;

        } catch (SQLException u) {
            return "1#";
        }

    }

    public String ConsultarAula() {
        String mensagem = "05#";
        Connection con = new Aula().getConnection();
        String sql = "SELECT * FROM aula ORDER BY disciplinaAssociada";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                mensagem = mensagem + resultado.getString("idAula") + "#" + resultado.getString("disciplinaAssociada") + "#";
            }
            stmt.close();
            return mensagem;

        } catch (SQLException u) {
            mensagem = "1#";
            return mensagem;
        }
    }
}

package SGDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//Início da classe de conexão//
public class Professor {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/servidor", "root", "1234");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int Inserir(String ra, String nome, String idade, String endereco, String departamento, String disciplinasMinistra, String linhasPesquisa) {

        Connection con = new Professor().getConnection();

        String sql = "INSERT INTO professor(RA, nome, idade, endereco, departamento, disciplinasMinistra, linhasPesquisa) VALUES(?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(ra));
            stmt.setString(2, nome);
            stmt.setInt(3, Integer.parseInt(idade));
            stmt.setString(4, endereco);
            stmt.setString(5, departamento);
            stmt.setString(6, disciplinasMinistra);
            stmt.setString(7, linhasPesquisa);
            stmt.execute();
            stmt.close();
            return 0;

        } catch (SQLException u) {
            return 1;
        }
    }

    public int Editar(String cod, String ra, String nome, String idade, String endereco, String departamento, String disciplinasMinistra, String linhasPesquisa) {

        Connection con = new Professor().getConnection();

        String sql = "UPDATE professor SET RA = ?, nome = ?, idade = ?, endereco = ?, departamento = ?, disciplinasMinistra = ?, linhasPesquisa = ? WHERE idProfessor = ?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(ra));
            stmt.setString(2, nome);
            stmt.setInt(3, Integer.parseInt(idade));
            stmt.setString(4, endereco);
            stmt.setString(5, departamento);
            stmt.setString(6, disciplinasMinistra);
            stmt.setString(7, linhasPesquisa);
            stmt.setInt(8, Integer.parseInt(cod));
            stmt.execute();
            stmt.close();
            return 0;
        } catch (SQLException u) {
            return 1;
        }
    }

    public int Deletar(String id) {
        Connection con = new Professor().getConnection();

        String sql = "DELETE FROM professor WHERE idAula = ?";

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

    public String ConsultarProfessor(String id) {

        Connection con = new Professor().getConnection();
        String sql = "SELECT * FROM professor where idProfessor = ?";
        String mensagem = "04#";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(id));
            ResultSet resultado = stmt.executeQuery();
            resultado.next();
            mensagem = mensagem + resultado.getInt("idProfessor") + "#"
                    + resultado.getInt("RA") + "#"
                    + resultado.getString("nome") + "#"
                    + resultado.getInt("idade") + "#"
                    + resultado.getString("endereco") + "#"
                    + resultado.getString("departamento") + "#"
                    + resultado.getString("disciplinasMinistra") + "#"
                    + resultado.getString("linhasPesquisa") + "#";
            stmt.close();
            return mensagem;

        } catch (SQLException u) {
            return "1#";
        }

    }

    public String ConsultarProfessor() {
        String mensagem = "05#";
        Connection con = new Professor().getConnection();
        String sql = "SELECT * FROM professor ORDER BY nome";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                mensagem = mensagem + resultado.getString("idProfessor") + "#" + resultado.getString("nome") + "#";
            }
            stmt.close();
            return mensagem;

        } catch (SQLException u) {
            mensagem = "1#";
            return mensagem;
        }
    }

}

package SGDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Aluno {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/Integrador", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int Inserir(String ra, String nome, String idade, String endereco, String curso, String anoDeEntradaCurso, String disciplinasMatriculadas, String disciplinasConcluidas) {
        Connection con = new Aluno().getConnection();

        String sql = "INSERT INTO aluno(RA,nome,idade,endereco,curso,"
                + "anoDeEntradaCurso,disciplinasMatriculadas,disciplinasConcluidas) "
                + "VALUES(?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(ra));
            stmt.setString(2, nome);
            stmt.setInt(3, Integer.parseInt(idade));
            stmt.setString(4, endereco);
            stmt.setString(5, curso);
            stmt.setInt(6, Integer.parseInt(anoDeEntradaCurso));
            stmt.setString(7, disciplinasMatriculadas);
            stmt.setString(8, disciplinasConcluidas);
            stmt.execute();
            stmt.close();
            return 0;
        } catch (SQLException e) {
            return 1;
        }
    }

    public int Editar(String cod, String ra, String nome, String idade, 
            String endereco, String curso, String anoDeEntradaCurso, 
            String disciplinasMatriculadas, String disciplinasConcluidas) {
       
        Connection con = new Aluno().getConnection();    
        String sql = "UPDATE aluno SET RA = ?, nome = ?, idade = ?, "
                + "endereco = ?, curso = ?, anoDeEntradaCurso = ?, "
                + "disciplinasMatriculadas = ?, disciplinasConcluidas = ? "
                + "WHERE idAluno  = ?";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(ra));
            stmt.setString(2, nome);
            stmt.setInt(3, Integer.parseInt(idade));
            stmt.setString(4, endereco);
            stmt.setString(5, curso);
            stmt.setInt(6, Integer.parseInt(anoDeEntradaCurso));
            stmt.setString(7, disciplinasMatriculadas);
            stmt.setString(8, disciplinasConcluidas);
            stmt.setInt(9, Integer.parseInt(cod));
            stmt.execute();
            stmt.close();
            return 0;
        } catch (SQLException e) {
            return 1;
        }
    }
    
    public int Deletar(String id) {
        Connection con = new Aluno().getConnection();

        String sql = "DELETE FROM aluno WHERE idAluno = ?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(id));
            stmt.execute();
            stmt.close();
            return 0;
        } catch (SQLException e) {
            return 1;
        }
    }

    public String ConsultarAluno(String id) {
        Connection con = new Aluno().getConnection();
        String sql = "SELECT * FROM aluno WHERE idAluno = ?";
        String mensagem = "04#";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(id));
            ResultSet resultado = stmt.executeQuery();
            resultado.next();
            mensagem = mensagem + resultado.getInt("idAluno") + "#"
                    + resultado.getInt("RA") + "#"
                    + resultado.getString("nome") + "#"
                    + resultado.getString("endereco") + "#"
                    + resultado.getString("curso") + "#"
                    + resultado.getInt("anoDeEntradaCurso") + "#"
                    + resultado.getString("disciplinasMatriculadas") + "#"
                    + resultado.getString("disciplinaConcluidas") + "#";
            stmt.close();
            return mensagem;
        } catch (SQLException e) {
            return "1#";
        }
    }

    public String ConsultarProfessor() {
        String mensagem = "05#";
        Connection con = new Professor().getConnection();
        String sql = "SELECT * FROM aluno ORDER BY nome";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                mensagem = mensagem + resultado.getString("idAluno") + "#" + resultado.getString("nome") + "#";
            }
            stmt.close();
            return mensagem;
        } catch (SQLException e) {
            mensagem= "1#";
            return mensagem;
        }
    }
}

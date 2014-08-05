/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SGDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Marcelo
 */
public class Disciplinas {
 public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/servidor", "root", "1234");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int Inserir(String Titulo, String PreRequisitos, String Avaliacao, String Ementa, String Dependencias) {

        Connection con = new Disciplinas().getConnection();

        String sql = "INSERT INTO disciplinas(titulo, preRequisitos, metodoAvaliacao, ementa, disciplinasDependentes) VALUES(?,?,?,?,?)";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, Titulo);
            stmt.setString(2, PreRequisitos);
            stmt.setString(3, Avaliacao);
            stmt.setString(4, Ementa);
            stmt.setString(5, Dependencias);
            stmt.execute();
            stmt.close();
            return 0;

        } catch (SQLException u) {
            return 1;
        }
    }

    public void Editar(String IdDisciplina, String Titulo, String PreRequisitos, String Avaliacao, String Ementa, String Dependencias) {

        Connection con = new Disciplinas().getConnection();

        String sql = "UPDATE disciplinas SET titulo = ?, preRequisitos = ?, metodoAvaliacao = ?, ementa = ?, disciplinasDependentes = ? WHERE idDisciplina = ?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, Titulo);
            stmt.setString(2, PreRequisitos);
            stmt.setString(3, Avaliacao);
            stmt.setString(4, Ementa);
            stmt.setString(5, Dependencias);
            stmt.setInt(6, Integer.parseInt(IdDisciplina));
            stmt.execute();
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void Deletar(int id) {
        Connection con = new Professor().getConnection();

        String sql = "DELETE FROM disciplinas WHERE idDisciplina = ?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }

    }

    public String ConsultarDisciplina(int id) {

        Connection con = new Disciplinas().getConnection();
        String sql = "SELECT * FROM disciplinas where idDisciplina = ?";
        String mensagem = "04#";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet resultado = stmt.executeQuery();
            resultado.next();
            mensagem = mensagem + resultado.getInt("idDisciplina") + "#"
                    + resultado.getString("titulo") + "#"
                    + resultado.getString("preRequisitos") + "#"
                    + resultado.getString("metodoAvaliacao") + "#"
                    + resultado.getString("ementa") + "#"
                    + resultado.getString("disciplinasDependentes") + "#";
            stmt.close();
            return mensagem;

        } catch (SQLException u) {
            return "1#";
        }

    }

    public String ConsultarDisciplinas() {
        String mensagem = "05#";
        Connection con = new Disciplinas().getConnection();
        String sql = "SELECT * FROM disciplinas ORDER BY nome";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                mensagem = mensagem + resultado.getString("idDisciplina") + "#" + resultado.getString("titulo") + "#";
            }
            stmt.close();
            return mensagem;

        } catch (SQLException u) {
            mensagem = "1#";
            return mensagem;
        }
    }

}


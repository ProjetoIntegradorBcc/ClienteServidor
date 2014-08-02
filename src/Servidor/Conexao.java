package Servidor;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//Início da classe de conexão//
public class Conexao {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/servidor", "root", "1234");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void Inserir(int ra, String nome, int idade, String endereco, String departamento, String disciplinasMinistra, String linhasPesquisa) {

        Connection con = new Conexao().getConnection();

        String sql = "INSERT INTO professor(RA, nome, idade, endereco, departamento, disciplinasMinistra, linhasPesquisa) VALUES(?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, ra);
            stmt.setString(2, nome);
            stmt.setInt(3, idade);
            stmt.setString(4, endereco);
            stmt.setString(5, departamento);
            stmt.setString(6, disciplinasMinistra);
            stmt.setString(7, linhasPesquisa);
            stmt.execute();
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void Editar(int cod, int ra, String nome, int idade, String endereco, String departamento, String disciplinasMinistra, String linhasPesquisa) {

        Connection con = new Conexao().getConnection();

        String sql = "UPDATE professor SET RA = ?, nome = ?, idade = ?, endereco = ?, departamento = ?, disciplinasMinistra = ?, linhasPesquisa = ? WHERE idProfessor = ?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, ra);
            stmt.setString(2, nome);
            stmt.setInt(3, idade);
            stmt.setString(4, endereco);
            stmt.setString(5, departamento);
            stmt.setString(6, disciplinasMinistra);
            stmt.setString(7, linhasPesquisa);
            stmt.setInt(8, cod);
            stmt.execute();
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void Deletar(int id) {
        Connection con = new Conexao().getConnection();

        String sql = "DELETE FROM professor WHERE idAula = ?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }

    }

    public int ConsultarProfessor(int RA) {

        int codigo;
        Connection con = new Conexao().getConnection();
        String sql = "SELECT idProfessor FROM professor where RA = ?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            System.out.println(""+RA);
            stmt.setInt(1, RA);
            ResultSet resultado = stmt.executeQuery();
            resultado.next();
            codigo = resultado.getInt("idProfessor");
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return codigo;
    }

    public void ConsultarProfessor() {

       
        ArrayList<vo.ProfessorVO> lista = new ArrayList<vo.ProfessorVO>();
        Connection con = new Conexao().getConnection();
        String sql = "SELECT * FROM professor";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                vo.ProfessorVO prof = new vo.ProfessorVO();
                prof.setCodigo(resultado.getInt("idProfessor"));
                prof.setRa(resultado.getInt("RA"));
                prof.setNome(resultado.getString("nome"));
                prof.setIdade(resultado.getInt("idade"));
                prof.setEndereco(resultado.getString("endereco"));
                prof.setDepartamento(resultado.getString("departamento"));
                prof.setDisciplinas(resultado.getString("disciplinasMinistra"));
                prof.setPesquisa(resultado.getString("linhasPesquisa"));

                lista.add(prof);
            }
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

}

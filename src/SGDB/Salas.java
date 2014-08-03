package SGDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Início da classe de conexão//
public class Salas {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/servidor", "root", "1234");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int Inserir(String descricaoLaboratorio, String numeroComputadores, String recursosDidaticos, String departamento, String capacidadeMaxima) {

        Connection con = new Professor().getConnection();

        String sql = "INSERT INTO salas(descricaoLaboratorio, numeroComputadores, recursosDidaticos, departamento, capacidadeMaxima) VALUES(?,?,?,?,?)";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, descricaoLaboratorio);
            stmt.setInt(2, Integer.parseInt(numeroComputadores));
            stmt.setString(3, recursosDidaticos);
            stmt.setString(4, departamento);
            stmt.setInt(5, Integer.parseInt(capacidadeMaxima));
            stmt.execute();
            stmt.close();
            return 0;

        } catch (SQLException u) {
            return 1;
        }
    }

    public int Editar(String id, String descricaoLaboratorio, String numeroComputadores, String recursosDidaticos, String departamento, String capacidadeMaxima) {

        Connection con = new Professor().getConnection();

        String sql = "UPDATE salas SET descricaoLaboratorio = ?, numeroComputadores = ?, recursosDidaticos = ?, departamento = ?, capacidadeMaxima = ? WHERE idSala = ?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, descricaoLaboratorio);
            stmt.setInt(2, Integer.parseInt(numeroComputadores));
            stmt.setString(3, recursosDidaticos);
            stmt.setString(4, departamento);
            stmt.setInt(5, Integer.parseInt(capacidadeMaxima));
            stmt.setInt(6, Integer.parseInt(id));
            stmt.execute();
            stmt.close();
            return 0;

        } catch (SQLException u) {
            return 1;
        }
    }

    public int Deletar(String id) {
        Connection con = new Professor().getConnection();

        String sql = "DELETE FROM salas WHERE idSala = ?";

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

    public void Consultar() {

    }

}

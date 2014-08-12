package SGDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jonas
 */
public class Salas {

    /**
     * variavel utilizada numero 1.
     */
    public static final int NUMERO1 = 1;
    /**
     * variavel utilizada numero 2.
     */
    public static final int NUMERO2 = 2;
    /**
     * variavel utilizada numero 3.
     */
    public static final int NUMERO3 = 3;
    /**
     * variavel utilizada numero 4.
     */
    public static final int NUMERO4 = 4;
    /**
     * variavel utilizada numero 5.
     */
    public static final int NUMERO5 = 5;
    /**
     * variavel utilizada numero 6.
     */
    public static final int NUMERO6 = 6;

    /**
     * Classe de conexao com o banco de dados.
     *
     * @return retorno
     */
    public final Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql:"
                    + "//localhost/servidor", "root", "1234");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Classe de inserção no banco de dados.
     * @param descricaoLaboratorio
     * @param numeroComputadores
     * @param recursosDidaticos
     * @param departamento
     * @param capacidadeMaxima
     *
     * @return 0.
     */
    public final int inserir(String descricaoLaboratorio,
            String numeroComputadores,
            String recursosDidaticos,
            String departamento,
            String capacidadeMaxima) {

        Connection con = new Salas().getConnection();

        String sql = "INSERT INTO salas(descricaoLaboratorio,"
                + " numeroComputadores, recursosDidaticos"
                + ", departamento, capacidadeMaxima) VALUES(?,?,?,?,?)";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(NUMERO1, descricaoLaboratorio);
            stmt.setInt(NUMERO2, Integer.parseInt(numeroComputadores));
            stmt.setString(NUMERO3, recursosDidaticos);
            stmt.setString(NUMERO4, departamento);
            stmt.setInt(NUMERO5, Integer.parseInt(capacidadeMaxima));
            stmt.execute();
            stmt.close();
            return 0;

        } catch (SQLException u) {
            return 1;
        }
    }
    /**
     * Classe de edicao no banco de dados.
     *
     * @param id
     * @param descricaoLaboratorio
     * @param numeroComputadores
     * @param recursosDidaticos
     * @param departamento
     * @param capacidadeMaxima
     * @return 0.
     */
    public int editar(String id,
            String descricaoLaboratorio,
            String numeroComputadores,
            String recursosDidaticos,
            String departamento,
            String capacidadeMaxima) {

        Connection con = new Professor().getConnection();

        String sql = "UPDATE salas SET descricaoLaboratorio = ?,"
                + " numeroComputadores = ?, recursosDidaticos = ?,"
                + " departamento = ?, capacidadeMaxima = ? WHERE idSala = ?";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(NUMERO1, descricaoLaboratorio);
            stmt.setInt(NUMERO2, Integer.parseInt(numeroComputadores));
            stmt.setString(NUMERO3, recursosDidaticos);
            stmt.setString(NUMERO4, departamento);
            stmt.setInt(NUMERO5, Integer.parseInt(capacidadeMaxima));
            stmt.setInt(NUMERO6, Integer.parseInt(id));
            stmt.execute();
            stmt.close();
            return 0;

        } catch (SQLException u) {
            return 1;
        }
    }

    /**
     * Classe de delecao no banco de dados.
     *
     * @param id
     * @return 0.
     */
    public int deletar(String id) {
        Connection con = new Professor().getConnection();

        String sql = "DELETE FROM salas WHERE idSala = ?";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, Integer.parseInt(id));
            stmt.execute();
            stmt.close();
            return 0;
        } catch (SQLException u) {
            return 1;
        }

    }

    /**
     * Classe de consultar Salas no banco de dados.
     *
     * @param id
     * @return mensagem.
     */
    public String consultarSalas(int id) {
        Connection con = new Professor().getConnection();
        String sql = "SELECT * FROM salas where idSala = ?";
        String mensagem = "04#";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet resultado = stmt.executeQuery();
            resultado.next();
            mensagem = mensagem + resultado.getInt("idSala") + "#"
                    + resultado.getString("descricaoLaboratorio") + "#"
                    + resultado.getInt("numeroComputadores") + "#"
                    + resultado.getString("recursosDidaticos") + "#"
                    + resultado.getString("departamento") + "#"
                    + resultado.getInt("capacidadeMaxima") + "#";
            stmt.close();
            return mensagem;

        } catch (SQLException u) {
            return "1#";
        }

    }
    /**
     * Classe de consultar Salas no banco de dados.
     * @return mensagem.
     */
    public final String consultarSalas() {
        String mensagem = "05#";
        Connection con = new Professor().getConnection();
        String sql = "SELECT * FROM salas";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                mensagem = mensagem
                        + resultado.getString("idSala")
                        + "#" + resultado.getString("descricaoLaboratorio")
                        + "#";
            }
            stmt.close();
            return mensagem;

        } catch (SQLException u) {
            mensagem = "1#";
            return mensagem;
        }
    }

}

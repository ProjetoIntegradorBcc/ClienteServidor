/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import servidor.Banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Jonas
 */
public class ServidorSalas {

    public static void main(String[] args) {
        Banco con = new Banco();
        //con.Inserir(1234, "Joao", 34, "Rua das palmeiras", "DAINF", "Matemárica e afins", "doutor");
        //con.Deletar(2);
        //con.Editar(3,1234, "JONASAAA", 34, "Rua das palmeiras OLIVEEIRA", "DAINFSSEM", "MAAAAAAAAatemárica e afins", "douEEEEEEEEtor");
        //System.out.println(""+con.ConsultarProfessor(1234));
    }
}

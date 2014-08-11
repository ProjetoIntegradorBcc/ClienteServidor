/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servidor;

import java.net.InetAddress;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import servidor.ServidorDisciplinas;
import vo.DisciplinaVO;

/**
 *
 * @author Marcelo
 */
public class ServidorDisciplinasTest {
    
    public ServidorDisciplinasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Salvar method, of class ServidorDisciplinas.
     */
    @Test
    public void testSalvar() throws Exception {
        System.out.println("Salvar");
        ServidorDisciplinas instance = null;
        instance.Salvar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Atualizar method, of class ServidorDisciplinas.
     */
    @Test
    public void testAtualizar() throws Exception {
        System.out.println("Atualizar");
        ServidorDisciplinas instance = null;
        instance.Atualizar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Deletar method, of class ServidorDisciplinas.
     */
    @Test
    public void testDeletar() throws Exception {
        System.out.println("Deletar");
        ServidorDisciplinas instance = null;
        instance.Deletar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Pesquisar method, of class ServidorDisciplinas.
     */
    @Test
    public void testPesquisar() throws Exception {
        System.out.println("Pesquisar");
        ServidorDisciplinas instance = null;
        instance.Pesquisar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Criar method, of class ServidorDisciplinas.
     */
    @Test
    public void testCriar() {
        System.out.println("Criar");
        int tipo = 0;
        ServidorDisciplinas instance = null;
        DisciplinaVO expResult = null;
        DisciplinaVO result = instance.Criar(tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Enviar method, of class ServidorDisciplinas.
     */
    @Test
    public void testEnviar() throws Exception {
        System.out.println("Enviar");
        String mensagem = "";
        InetAddress endereco = null;
        int porta = 0;
        ServidorDisciplinas instance = null;
        instance.Enviar(mensagem, endereco, porta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SubString method, of class ServidorDisciplinas.
     */
    @Test
    public void testSubString() {
        System.out.println("SubString");
        String texto = "";
        int parte = 0;
        String separador = "";
        ServidorDisciplinas instance = null;
        String expResult = "";
        String result = instance.SubString(texto, parte, separador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

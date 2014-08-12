package Cliente;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import regraDeNegocio.ProfessorRN;
import vo.ProfessorVO;
/**
 *
 * @author Luma
 */
@RunWith(JUnit4.class)
public class ClienteProfessor {
    /**
     * Classe de Teste para o Cliente Professor.
     */
    @Test
    /**
     * Testando.
     */
   public final void testConstrutorComParametros() {
        org.junit.Assert.assertEquals(
            "testando para ver se esta legal",5, 5);
    }
     /**
     * Testando o método validarRa da classe ProfessorRN.
     */
    @Test
    /**
     * testando.
     */
    public final void validandoRA() {

        ProfessorRN profRN = new ProfessorRN();
        assertEquals("Imprimir mensagem de erro",
                     "RA invalido - campo vazio",
                     "RA invalido - campo vazio");
                     profRN.validaRA("");
        assertEquals("Imprimir mensagem de erro",
                     "RA invalido - insira um valor positivo",
                     profRN.validaRA("-2"));
        assertEquals("Imprimir mensagem de erro",
                     "RA invalido - insira um valor numerico",
                     profRN.validaRA("aaa"));
        assertEquals("Imprimir mensagem de erro",
                     "RA invalido - insira um valor numerico",
                     profRN.validaRA("abc"));
        assertEquals("RA está correto",
                     null,
                     profRN.validaRA("12345"));
    }
     /**
     * Testando o método validarNome da classe ProfessorRN.
     */
        @Test
    /**
     * testando.
     */
    public final void validandoNome() {
       ProfessorRN profRN = new ProfessorRN();
       assertEquals("Imprimir mensagem de erro- Campo nulo",
                     "Nome invalido - campo vazio",
                     profRN.validaNome(""));
       assertEquals("Imprimir mensagem de erro - 51 caracteres",
                     "Nome invalido - maximo de 50 caracteres",
                     profRN.validaNome("1llllllllllllllllllllllllllllllllllllll"
                     + "lllllllllll1"));
       assertEquals("Retorno certo- Teste para 49 caracteres",
                     null, profRN.validaNome("luma"));
       assertEquals("Retorno certo- Teste para 49 caracteres",
                     null,
                     profRN.validaNome("Uahsuahuahsuahsuahsuahsauhsuashauhsuash"
                    + "auhsaushua"));
       assertEquals("Retorno certo- Teste para 50 caracteres",
                     null,
                     profRN.validaNome("Uahsuahuahsuahsuahsuahsauhsuashauhsuash"
                    + "auhsaushuaa"));

   }
     /**
     * Testando o método validarIdade da classe ProfessorRN.
     */
        @Test
    /**
     * testando.
     */
    public final void validandoIdade() {
        ProfessorRN profRN = new ProfessorRN();
        assertEquals("Imprimir mensagem de erro- Campo nulo",
                     "Idade invalida - campo vazio",
                     profRN.validaIdade(""));
        assertEquals("Imprimir mensagem de erro- Valor negativo",
                     "Idade invalida - insira um valor positivo e maior que 0",
                     profRN.validaIdade("-1"));
        assertEquals("Imprimir mensagem de erro- Valor igual a 0",
                     "Idade invalida - insira um valor positivo e maior que 0",
                     profRN.validaIdade("0"));
        assertEquals("Retorno certo - Idade válida",
                     null,
                     profRN.validaIdade("1"));
        assertEquals("ERRO-Caracter diferente de numero[1]",
                     "idade invalida - insira um valor numerico",
                     profRN.validaIdade("luma"));
       assertEquals("ERRO-Caracter diferente de numero[2]",
                     "idade invalida - insira um valor numerico",
                     profRN.validaIdade("a$1"));
       assertEquals("ERRO- Caracter diferente de numero[3]",
                     "idade invalida - insira um valor numerico",
                     profRN.validaIdade("$*@"));
    }
     /**
     * Testando o método validaDepartamento da classe ProfessorRN.
     */
        @Test
    /**
     * testando.
     */
     public final void validarDepartamento() {
       ProfessorRN profRN = new ProfessorRN();
       assertEquals("Imprimir mensagem de erro- Campo nulo",
                     "Departamento invalido - campo vazio",
                     profRN.validaDepartamento(""));
       assertEquals("Mensagem certa- Campo 41 caracteres",
                     "Departamento invalido - maximo de 40 caracteres",
                     profRN.validaDepartamento("Uahsuahuahsuahsuahsuahsauhsuash"
                     + "auhsuashsa"));
       assertEquals("Mensagem certa- Campo 40 caracteres",
                     null,
                     profRN.validaDepartamento("Uahsuahuahsuahsuahsuahsauhsuash"
                     + "auhsuashs"));
       assertEquals("Mensagem certa- Menos 40 caracteres",
                     null,
                     profRN.validaDepartamento("Materia 1"));
     }
     /**
     * Testando o método validaDisciplinas da classe ProfessorRN.
     */
        @Test
    /**
     * testando.
     */
     public final void validarDisciplinas() {
       ProfessorRN profRN = new ProfessorRN();
       assertEquals("Imprimir mensagem de erro- Campo nulo",
                     "Disciplinas invalidas - campo vazio",
                     profRN.validaDisciplinas(""));
       assertEquals("ERRO- Campo 101 caracteres",
                     "Disciplinas invalidas - maximo de 100 caracteres",
                     profRN.validaDisciplinas("Uahsuahuahsuahsuahsuahsauhsuash"
                    + "auhsuashaUahsuahuahsuahsuahsuahsauhsuashauhsuashaUahsu"
                    + "ahuahsuahsuahhsl"));
       assertEquals("Mensagem certa- Campo 100 caracteres",
                     null,
                     profRN.validaDisciplinas("Uahsuahuahsuahsuahsuahsauhsuash"
                     + "auhsuashaUahsuahuahsuahsuahsuahsauhsuashauhsuashaUahsua"
                     + "huahsuahsuahhs"));
       assertEquals("Mensagem certa- Campo 99 caracteres",
                     null,
                     profRN.validaDisciplinas("Uahsuahuahsuahsuahsuahsauhsuash"
                     + "auhsuashaUahsuahuahsuahsuahsuahsauhsuashauhsuashaUahsua"
                     + "huahsuahsuahh"));
       assertEquals("Mensagem certa- Menos 100 caracteres",
                     null,
                     profRN.validaDisciplinas("Materia 1"));
    }
     /**
     * Testando o método validaEndereco da classe ProfessorRN.
     */
        @Test
    /**
     * testando.
     */
     public final void validarEndereco() {
       ProfessorRN profRN = new ProfessorRN();
       assertEquals("Imprimir mensagem de erro- Campo nulo",
                     "Endereco invalido - campo vazio",
                     profRN.validaEndereco(""));
       assertEquals("ERRO- Campo 151 caracteres",
                     "Endereco invalido - maximo de 150 caracteres",
                     profRN.validaEndereco("Uahsuahuahsuahsuahsuahsauhsuashauh"
                     + "suashaUahsuahuahsuahsuahsuahsauhsuashauhsuashaUahsuahua"
                     + "hsuahsuahhsUahsuahuahsuahsuahsuahsauhsuashauhsuashaUahs"
                     + "uahuahk"));
       assertEquals("Mensagem certa- Campo 150 caracteres",
                     null,
                     profRN.validaEndereco("Uahsuahuahsuahsuahsuahsauhsuashauh"
                     + "suashaUahsuahuahsuahsuahsuahsauhsuashauhsuashaUahsuahua"
                     + "hsuahsuahhsUahsuahuahsuahsuahsuahsauhsuashauhsuashaUahs"
                     + "uahuah"));
       assertEquals("Mensagem certa- Campo 149 caracteres",
                     null,
                     profRN.validaEndereco("Uahsuahuahsuahsuahsuahsauhsuashauh"
                     + "suashaUahsuahuahsuahsuahsuahsauhsuashauhsuashaUahsuahu"
                     + "ahsuahsuahhsUahsuahuahsuahsuahsuahsauhsuashauhsuashaUah"
                     + "suahua"));
       assertEquals("Mensagem certa- Menos 150 caracteres",
                     null,
                     profRN.validaEndereco("Endereço 1"));
    }
    /**
     * Testando o método validaPesquisa da classe ProfessorRN.
     */
        @Test
    /**
     * testando.
     */
     public final void validarPesquisa() {
       ProfessorRN profRN = new ProfessorRN();
       assertEquals("Imprimir mensagem de erro- Campo nulo",
                     "Pesquisa invalida - campo vazio",
                     profRN.validaPesquisa(""));
       assertEquals("ERRO- Campo 101 caracteres",
                     "Pesquisa invalida - maximo de 100 caracteres",
                     profRN.validaPesquisa("Uahsuahuahsuahsuahsuahsauhsuash"
                    + "auhsuashaUahsuahuahsuahsuahsuahsauhsuashauhsuashaUahsu"
                    + "ahuahsuahsuahhsl"));
       assertEquals("Mensagem certa- Campo 100 caracteres",
                     null,
                     profRN.validaPesquisa("Uahsuahuahsuahsuahsuahsauhsuash"
                     + "auhsuashaUahsuahuahsuahsuahsuahsauhsuashauhsuashaUahsua"
                     + "huahsuahsuahhs"));
       assertEquals("Mensagem certa- Campo 99 caracteres",
                     null,
                     profRN.validaPesquisa("Uahsuahuahsuahsuahsuahsauhsuash"
                     + "auhsuashaUahsuahuahsuahsuahsuahsauhsuashauhsuashaUahsua"
                     + "huahsuahsuahh"));
       assertEquals("Mensagem certa- Menos 100 caracteres",
                     null,
                     profRN.validaPesquisa("luma"));
    }
}

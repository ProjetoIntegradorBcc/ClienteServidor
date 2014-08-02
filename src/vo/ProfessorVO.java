/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vo;

/**
 *
 * @author diogo
 */
public class ProfessorVO {

    /**
     * campos numericos da tabela professor.
     */
    private int codigo, ra, idade;
    /**
     * campos string da tabela professor.
     */
    private String nome, endereco, departamento, disciplinas, pesquisa;
    /**
     * @return codigo do professor
     */
    public int getCodigo(){
        return this.codigo;
    }
    /**
     * @param codigo novo codigo para o professor
     */
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    /**
     * 
     * @return ra do professor
     */
    public int getRa(){
        return this.ra;
    }

    /**
     * @param ra novo numero de ra para o professor
     */
    public void setRa(int ra) {
        this.ra = ra;
    }

    /**
     * @return idade do professor.
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade nova idade para o professor
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return nome do professor
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome novo nome para o professor
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return endereco do professor
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco novo endereco para o professor
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return departamento do professor
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento novo departamento para o professor
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return disciplinas que o professor ministra
     */
    public String getDisciplinas() {
        return disciplinas;
    }

    /**
     * @param disciplinas novas disciplinas que o professor ministra
     */
    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

    /**
     * @return pesquisa em que professor atua
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa novas linhas de pesquisa que o professor atua
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
}

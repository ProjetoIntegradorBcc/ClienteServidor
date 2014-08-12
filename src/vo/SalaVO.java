/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vo;

/**
 *
 * @author Marcelo
 */
public class SalaVO {
    private String IdSala;
    private String Descricao;
    private String NumComputadores;
    private String Recursos;
    private String Departamento;
    private String Capacidade;

    /**
     * @return the IdSala
     */
    public String getIdSala() {
        return IdSala;
    }

    /**
     * @param IdSala the IdSala to set
     */
    public void setIdSala(String IdSala) {
        this.IdSala = IdSala;
    }

    /**
     * @return the Descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @param Descricao the Descricao to set
     */
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    /**
     * @return the NumComputadores
     */
    public String getNumComputadores() {
        return NumComputadores;
    }

    /**
     * @param NumComputadores the NumComputadores to set
     */
    public void setNumComputadores(String NumComputadores) {
        this.NumComputadores = NumComputadores;
    }

    /**
     * @return the Recursos
     */
    public String getRecursos() {
        return Recursos;
    }

    /**
     * @param Recursos the Recursos to set
     */
    public void setRecursos(String Recursos) {
        this.Recursos = Recursos;
    }

    /**
     * @return the Departamento
     */
    public String getDepartamento() {
        return Departamento;
    }

    /**
     * @param Departamento the Departamento to set
     */
    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    /**
     * @return the Capacidade
     */
    public String getCapacidade() {
        return Capacidade;
    }

    /**
     * @param Capacidade the Capacidade to set
     */
    public void setCapacidade(String Capacidade) {
        this.Capacidade = Capacidade;
    }
}

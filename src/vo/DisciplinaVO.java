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
public class DisciplinaVO {
    private int IdDisciplina;
    private String Titulo;
    private String PreRequisitos;
    private String Avaliacao;
    private String Ementa;
    private String Dependencias;
    
    /**
     * @return the IdDisciplina
     */
    public int getIdDisciplina() {
        return IdDisciplina;
    }

    /**
     * @param IdDisciplina the IdDisciplina to set
     */
    public void setIdDisciplina(int IdDisciplina) {
        this.IdDisciplina = IdDisciplina;
    }

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /**
     * @return the PreRequisitos
     */
    public String getPreRequisitos() {
        return PreRequisitos;
    }

    /**
     * @param PreRequisitos the PreRequisitos to set
     */
    public void setPreRequisitos(String PreRequisitos) {
        this.PreRequisitos = PreRequisitos;
    }

    /**
     * @return the Avaliacao
     */
    public String getAvaliacao() {
        return Avaliacao;
    }

    /**
     * @param Avaliacao the Avaliacao to set
     */
    public void setAvaliacao(String Avaliacao) {
        this.Avaliacao = Avaliacao;
    }

    /**
     * @return the Ementa
     */
    public String getEmenta() {
        return Ementa;
    }

    /**
     * @param Ementa the Ementa to set
     */
    public void setEmenta(String Ementa) {
        this.Ementa = Ementa;
    }

    /**
     * @return the Dependencias
     */
    public String getDependencias() {
        return Dependencias;
    }

    /**
     * @param Dependencias the Dependencias to set
     */
    public void setDependencias(String Dependencias) {
        this.Dependencias = Dependencias;
    }
}


package vo;

public class AulaVO {
    private DisciplinaVO disciplina;
    private SalaVO sala;
    private String alunosPresentes;
    private String conteudoProgramatico;
   
    public DisciplinaVO getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(DisciplinaVO disciplina) {
        this.disciplina = disciplina;
    }

    public SalaVO getSala() {
        return sala;
    }

    public void setSala(SalaVO sala) {
        this.sala = sala;
    }

    public String getAlunosPresentes() {
        return alunosPresentes;
    }

    public void setAlunosPresentes(String alunosPresentes) {
        this.alunosPresentes = alunosPresentes;
    }

    public String getConteudoProgramatico() {
        return conteudoProgramatico;
    }

    public void setConteudoProgramatico(String conteudoProgramatico) {
        this.conteudoProgramatico = conteudoProgramatico;
    }
    
    
    
}

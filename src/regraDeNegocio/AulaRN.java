
package regraDeNegocio;

import vo.AulaVO;

public class AulaRN {
    String validaCampos(AulaVO AVO) {
        String mensagemCampoInvalido = validaDisciplina(AVO.getDisciplina().toString());
        if(mensagemCampoInvalido != null){
            return mensagemCampoInvalido;
        }
        mensagemCampoInvalido = validaSala(AVO.getSala().toString());
        if(mensagemCampoInvalido != null){
            return mensagemCampoInvalido;
        }
        mensagemCampoInvalido = validaAlunosPresentes(AVO.getAlunosPresentes());
        if(mensagemCampoInvalido != null){
            return mensagemCampoInvalido;
        }
        mensagemCampoInvalido = validaConteudoProgramatico(AVO.getConteudoProgramatico());
        if(mensagemCampoInvalido != null){
            return mensagemCampoInvalido;
        }
        return null;
    }
    
    private String validaAlunosPresentes(String campoAluno) {
        int numAlunos;
        if(campoAluno.isEmpty()){
            return "Número de alunos inválido - campo vazio";
        }
        else{
            try{
                numAlunos = Integer.parseInt(campoAluno);
                if(numAlunos < 0){
                    return "Número de alunos inválido - insira um valor positivo";
                }
                else{
                    return null;
                }
            }
            catch(NumberFormatException e){
                return "Número de alunos inválido - insira um valor numerico";
            }
        }
    }
    
    private String validaDisciplina(String campoDisciplina) {
        if(campoDisciplina.equals("Escolha uma Disciplina")){
            return "Disciplina associada inválida - escolha uma disciplina";
        }
        else{
            return null;
        }
    }
    
    private String validaSala(String campoSala) {
       if(campoSala.equals("Escolha uma Sala")){
            return "Sala associada inválida - escolha uma sala";
        }
        else{
            return null;
        }
    }
    
    public String validaConteudoProgramatico(String campoConteudo) {
        if(campoConteudo.isEmpty()){
            return "Conteudo Programático invalido - campo vazio";
        }
        else{
            return null;
        }
    }
}

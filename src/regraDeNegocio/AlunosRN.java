/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package regraDeNegocio;

/**
 *
 * @author Rafael
 */
import vo.AlunosVO;
public class AlunosRN {
    String validarCampos(AlunosVO alunoVO) {
        String mensagem = validaRaAluno(alunoVO.getRA().toString());
        if(mensagem != null){
            return mensagem;
        }
        
        return null;
    }
    
    //validacao de campos
    public String validaRaAluno(String RaAluno) {
        if(RaAluno.isEmpty()){
            return "RA invalido - campo vazio";
        }
        else{
            return null;
        }
    }
    public String validarNome(String NomeAluno) {
        if(NomeAluno.isEmpty()){
            return "Nome invalido - campo vazio";
        }
        else{
            return null;
        }
    }
    public String validarDataNasc(String DataNascAluno) {
        if(DataNascAluno.isEmpty()){
            return "Data Nascimento invalido - campo vazio";
        }
        else{
            return null;
        }
    }
    public String validarCurso(String CursoAluno) {
        if(CursoAluno.isEmpty()){
            return "Curso invalido - campo vazio";
        }
        else{
            return null;
        }
    }
    
    public String validarAnoEntrada(String AnoEntradaAluno) {
        if(AnoEntradaAluno.isEmpty()){
            return "Ano de Entrada invalido - campo vazio";
        }
        else{
            return null;
        }
    }
    
}

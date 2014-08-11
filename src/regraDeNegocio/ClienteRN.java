/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package regraDeNegocio;

import conexao.ConexaoServidor;
import java.util.ArrayList;
import vo.AlunosVO;
import vo.AulaVO;
import vo.DisciplinaVO;
import vo.SalaVO;
import vo.ProfessorVO;

/**
 *
 * @author diogo
 */
public class ClienteRN {
    
    ConexaoServidor conexao = new ConexaoServidor();
    /**
     * Verifica os campos da interface
     * @param PVO Objeto professor recebido da interface
     * @return dadada
     */
    public String insereProfessor(ProfessorVO PVO) {
        ProfessorRN PRN = new ProfessorRN();
        
        String mensagemVOInvalido = PRN.validaCampos(PVO);
        if(mensagemVOInvalido != null){
            return mensagemVOInvalido;
        }
        else{
            return conexao.enviaDataGrama(PVO);
        }
    }
    
    public String insereAula(AulaVO AVO) {
        AulaRN ARN = new AulaRN();
        
        String mensagemVOInvalido = ARN.validaCampos(AVO);
        if(mensagemVOInvalido != null){
            return mensagemVOInvalido;
        }
        else{
            return conexao.enviaDataGrama(AVO); 
        }
    }
    public String insereAlunos(AlunosVO alunoVO) {
        AlunosRN alunoRN = new AlunosRN();
        
        String mensagemVOInvalido = alunoRN.validarCampos(alunoVO);
        if(mensagemVOInvalido != null){
            return mensagemVOInvalido;
        }
        else{
            return conexao.enviaDataGrama(alunoVO); 
        }
    }
    
    public String insereSalas(SalaVO SVO) {
        SalaRN SRN = new SalaRN();
        
        String mensagemVOInvalido = SRN.validaCampos(SVO);
        if(mensagemVOInvalido != null){
            return mensagemVOInvalido;
        }
        else{
            return conexao.enviaDataGrama(SVO); 
        }
    }
    
     public String insereDisciplina(DisciplinaVO DVO) {
         DisciplinaRN DRN= new DisciplinaRN();
        
        String mensagemVOInvalido = DRN.validaCampos(DVO);
        if(mensagemVOInvalido != null){
            return mensagemVOInvalido;
        }
        else{
            return conexao.enviaDataGrama(DVO); 
        }
    }
    
    public String alteraProfessor(ProfessorVO PVO){
        return "mensagem";
    }
    public String validaConexao(String ip, String porta) {
        return conexao.estabeleceConexao(ip, porta);
    }
    
    public String validaIP(String campoIP){
        ValidadorIP vip = new ValidadorIP();
        if(vip.validaIP(campoIP)){
            return "";
        }
        else{
            return "IP invalido";
        }
    }
    
    public String validaPorta(String campoPorta){
        int porta;
        if(campoPorta.isEmpty()){
            return "Porta invalida - campo vazio";
        }
        else{
             try{
                porta = Integer.parseInt(campoPorta);
                if(porta < 0){
                    return "Porta invalida - insira um valor positivo";
                }
                else{
                    return "";
                }
            }
            catch(NumberFormatException e){
                return "Porta invalida - insira um valor numerico";
            }
        }
    }

    public ArrayList<ProfessorVO> buscaProfessor() {
        System.out.println("Busca Professor");
        return conexao.buscaProfessor();
    }
    
    public ProfessorVO pesquisaProfessor(String id) {
        System.out.println("Pesquisa Professor");
        return conexao.pesquisaProfessor(id);
    }
    
    public ArrayList<AulaVO> buscaAula() {
        System.out.println("Busca Aula");
        return conexao.buscaAula();
    }
    
     public ArrayList<DisciplinaVO> buscaDisciplina() {
        System.out.println("Busca Disciplina");
        return conexao.buscaDisciplina();
    }
}

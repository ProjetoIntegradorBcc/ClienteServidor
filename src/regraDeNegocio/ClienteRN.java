/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package regraDeNegocio;

import vo.ProfessorVO;
import conexao.ConexaoServidor;

/**
 *
 * @author diogo
 */
public class ClienteRN {
    /**
     * Verifica os campos da interface
     * @param PVO Objeto professor recebido da interface
     * @return dadada
     */
    public String insereProfessor(ProfessorVO PVO) {
        ProfessorRN PRN = new ProfessorRN();
        ConexaoServidor conexao = new ConexaoServidor();
        
        String mensagemVOInvalido = PRN.validaCampos(PVO);
        if(mensagemVOInvalido != null){
            return mensagemVOInvalido;
        }
        else{
            return conexao.enviaDataGrama(PVO);
        }
    }
    /**
     * 
     * @param PVO
     * @return mensagem 
     */
    public String alteraProfessor(ProfessorVO PVO){
        return "mensagem";
    }
}

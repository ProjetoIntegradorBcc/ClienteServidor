/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package regraDeNegocio;

import vo.ProfessorVO;

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
        return PRN.validaCampos(PVO);
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

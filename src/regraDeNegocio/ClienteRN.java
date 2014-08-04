/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package regraDeNegocio;

import conexao.ConexaoServidor;
import java.util.ArrayList;
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
    /**
     * 
     * @param PVO
     * @return mensagem 
     */
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
}

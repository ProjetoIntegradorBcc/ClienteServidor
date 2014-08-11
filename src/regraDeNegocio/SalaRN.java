/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package regraDeNegocio;

/**
 *
 * @author Marcelo
 */
import vo.SalaVO;

public class SalaRN {
    String validaCampos(SalaVO SVO) {
        String mensagemCampoInvalido = validaDescricao(SVO.getDescricao());
        if(mensagemCampoInvalido != null){
            return mensagemCampoInvalido;
        }
        mensagemCampoInvalido = validaComputadores(SVO.getNumComputadores());
        if(mensagemCampoInvalido != null){
            return mensagemCampoInvalido;
        }
        mensagemCampoInvalido = validaRecursos(SVO.getRecursos());
        if(mensagemCampoInvalido != null){
            return mensagemCampoInvalido;
        }
        mensagemCampoInvalido = validaDepartamento(SVO.getDepartamento());
        if(mensagemCampoInvalido != null){
            return mensagemCampoInvalido;
        }
        mensagemCampoInvalido = validaCapacidade(SVO.getCapacidade());
        if(mensagemCampoInvalido != null){
            return mensagemCampoInvalido;
        }
        return null;
    }
    
    public String validaDescricao(String campoDescricao) {
        if(campoDescricao.isEmpty()){
            return "Descricao invalido - campo vazio";
        }
        else if(campoDescricao.length() > 50){
            return "Descricao invalido - maximo de 50 caracteres";
        }
        else{
            return null;
        }
    }
    
    public String validaComputadores(String campoComputadores) {
        if(campoComputadores.isEmpty()){
            return "NumComputadores invalido - campo vazio";
        }
        else{
            return null;
        }
    }
    
    public String validaRecursos(String campoRecursos) {
        if(campoRecursos.isEmpty()){
            return "Recurso invalido - campo vazio";
        }
        else if(campoRecursos.length() > 150){
            return "Recurso invalido - maximo de 150 caracteres";
        }
        else{
            return null;
        }
    }
    
    public String validaCapacidade(String campoCapacidade) {
        if(campoCapacidade.isEmpty()){
            return "Capacidade invalido - campo vazio";
        }
        else{
            return null;
        }
    }
    
    public String validaDepartamento(String campoDepartamento) {
        if(campoDepartamento.isEmpty()){
            return "Departamento invalido - campo vazio";
        }
        else if(campoDepartamento.length() > 50){
            return "Departamento invalido - maximo de 50 caracteres";
        }
        else{
            return null;
        }
    }
    
    private String validaPesquisa(String campoPesquisa) {
        if(campoPesquisa.isEmpty()){
            return "Pesquisa invalida - campo vazio";
        }
        else if(campoPesquisa.length() > 100){
            return "Pesquisa invalida - maximo de 100 caracteres";
        }
        else{
            return null;
        }        
    }
    
}

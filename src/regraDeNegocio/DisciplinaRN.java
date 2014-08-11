

package regraDeNegocio;

import vo.DisciplinaVO;

/**
 *
 * @author leticiacamenar
 */
public class DisciplinaRN {

    /**
     * verifca cada campo do objeto disciplina.
     * @param DVO
     * @return null caso todos os campos estejam validos
     * mensagem de erro referente ao campo invalido
     */
    String validaCampos(DisciplinaVO DVO) {
        
        String mensagemCampoInvalido = validaIdDisciplina(String.valueOf(DVO.getIdDisciplina()));
        if(mensagemCampoInvalido != null){
            return mensagemCampoInvalido;
        }
        mensagemCampoInvalido = validaTitulo(DVO.getTitulo());
        if(mensagemCampoInvalido != null){
            return mensagemCampoInvalido;
        }
        
        mensagemCampoInvalido = validaPreRequisitos(DVO.getPreRequisitos());
        if(mensagemCampoInvalido != null){
            return mensagemCampoInvalido;
        }
        mensagemCampoInvalido = validaAvaliacao(DVO.getAvaliacao());
        if(mensagemCampoInvalido != null){
            return mensagemCampoInvalido;
        }
        mensagemCampoInvalido = validaEmenta(DVO.getEmenta());
        if(mensagemCampoInvalido != null){
            return mensagemCampoInvalido;
        }
        mensagemCampoInvalido = validaDependencias(DVO.getDependencias());
        if(mensagemCampoInvalido != null){
            return mensagemCampoInvalido;
        }
        return null;
    }
    
     /**
     * valida o campo ID da disciplina.
     * Criterios:
     * Nao vazio
     * Numerico positivo
     * @param campoIdDisciplina 
     * @return null em caso de campo valido
     * mensagem de erro em caso de campo invalido
     */
    public String validaIdDisciplina(String campoIdDisciplina){
        int id;
        if(campoIdDisciplina.isEmpty()){
            return "ID invalido - campo vazio";
        }
        else{
            try{
                id = Integer.parseInt(campoIdDisciplina);
                if(id < 0){
                    return "ID invalido - insira um valor positivo";
                }
                else{
                    return null;
                }
            }
            catch(NumberFormatException e){
                return "ID invalido - insira um valor numerico";
            }
        }
    }
    /**
     * Valida o campo Titulo da disciplina.
     * Criterios:
     * Nao vazio
     * Nao ultrapasse o limite de 50 caracteres
     * @param campoTitulo 
     * @return null em caso de campo valido
     * Mensagem de erro em caso de campo invalido
     */
    public String validaTitulo(String campoTitulo) {
        if(campoTitulo.isEmpty()){
            return "Titulo invalido - campo vazio";
        }
        else if(campoTitulo.length() > 50){
            return "Titulo invalido - maximo de 50 caracteres";
        }
        else{
            return null;
        }
    }
    
    /**
     * Valida o campo Pre Requisitos da disciplina.
     * Criterios:
     * Nao vazio
     * Nao ultrapasse o limite de 150 caracteres
     * @param campoPreRequisitos  
     * @return null em caso de campo valido
     * Mensagem de erro em caso de campo invalido
     */
    public String validaPreRequisitos(String campoPreRequisitos) {
        if(campoPreRequisitos.isEmpty()){
            return "Pre requisito invalido - campo vazio";
        }
        else if(campoPreRequisitos.length() > 150){
            return "Pre Requisito invalido - maximo de 150 caracteres";
        }
        else{
            return null;
        }
    }
    
    
    /**
     * Valida o campo Metodo de avaliacao da disciplina.
     * Criterios:
     * Nao vazioo
     * Nao ultrapasse o limite de 150 caracteres
     * @param campoAvaliacao   
     * @return null em caso de campo valido
     * Mensagem de erro em caso de campo invalido
     */
    public String validaAvaliacao(String campoAvaliacao) {
        if(campoAvaliacao.isEmpty()){
            return "Método de avaliação invalido - campo vazio";
        }
        else if(campoAvaliacao.length() > 150){
            return "Metodo de avaliacao invalido - maximo de 150 caracteres";
        }
        else{
            return null;
        }
    }
    
    
    /**
     * Valida o campo Ementa da disciplina.
     * Criterios:
     * Nao vazio
     * Nao ultrapasse o limite de 400 caracteres
     * @param campoEmenta   
     * @return null em caso de campo valido
     * Mensagem de erro em caso de campo invalido
     */
    public String validaEmenta(String campoEmenta) {
        if(campoEmenta.isEmpty()){
            return "Ementa invalida - campo vazio";
        }
        else if(campoEmenta.length() > 400){
            return "Ementa invalida - maximo de 400 caracteres";
        }
        else{
            return null;
        }
    }
    
    
    /**
     * Valida o campo Disciplinas dependentes da disciplina.
     * Criterios:
     * Nao vazio
     * Nao ultrapasse o limite de 150 caracteres
     * @param campoPreRequisitos  
     * @return null em caso de campo valido
     * Mensagem de erro em caso de campo invalido
     */
    public String validaDependencias(String campoDependencias) {
        if(campoDependencias.isEmpty()){
            return "Disciplina dependente invalida - campo vazio";
        }
        else if(campoDependencias.length() > 150){
            return "Disciplinas dependentes invalida - maximo de 150 caracteres";
        }
        else{
            return null;
        }
    }
}

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
public class ProfessorRN {
    /**
     * verifca cada campo do objeto professor.
     * @param PVO
     * @return null caso todos os campos estejam validos
     * mensagem de erro referente ao campo invalido
     */
    String validaCampos(ProfessorVO PVO) {
        String mensagemCampoInvalido = validaRA(PVO.getRa());
        if (mensagemCampoInvalido != null) {
            return mensagemCampoInvalido;
        }
        mensagemCampoInvalido = validaNome(PVO.getNome());
        if (mensagemCampoInvalido != null) {
            return mensagemCampoInvalido;
        }
        mensagemCampoInvalido = validaIdade(PVO.getIdade());
        if (mensagemCampoInvalido != null) {
            return mensagemCampoInvalido;
        }
        mensagemCampoInvalido = validaDepartamento(PVO.getDepartamento());
        if (mensagemCampoInvalido != null) {
            return mensagemCampoInvalido;
        }
        mensagemCampoInvalido = validaDisciplinas(PVO.getDisciplinas());
        if (mensagemCampoInvalido != null) {
            return mensagemCampoInvalido;
        }
        mensagemCampoInvalido = validaEndereco(PVO.getEndereco());
        if (mensagemCampoInvalido != null) {
            return mensagemCampoInvalido;
        }
        mensagemCampoInvalido = validaPesquisa(PVO.getPesquisa());
        if (mensagemCampoInvalido != null) {
            return mensagemCampoInvalido;
        }
        return null;
    }
    /**
     * valida o campo RA do professor.
     * Criterios:
     * Nao vazio
     * Numerico positivo
     * @param campoRA
     * @return null em caso de campo valido
     * mensagem de erro em caso de campo invalido
     */
    public String validaRA(String campoRA){
        int ra;
        if (campoRA.isEmpty()) {
            return "RA invalido - campo vazio";
    } else {
            try {
                ra = Integer.parseInt(campoRA);
                if (ra < 0) {
                    return "RA invalido - insira um valor positivo";
            } else {
                    return null;
                }
            } catch (NumberFormatException e) {
                return "RA invalido - insira um valor numerico";
            }
        }
    }
    /**
     * Valida o campo Nome do professor.
     * Criterios:
     * Nao vazio
     * Nao ultrapasse o limite de 50 caracteres
     * @param campoNome
     * @return null em caso de campo valido
     * Mensagem de erro em caso de campo invalido
     */
    public String validaNome(String campoNome) {
        if (campoNome.isEmpty()) {
            return "Nome invalido - campo vazio";
        } else if (campoNome.length() > 50) {
            return "Nome invalido - maximo de 50 caracteres";
        } else {
            return null;
        }
    }
    /**
     * valida o campo Idade do professor.
     * Criterios:
     * Nao vazio
     * Numerico positivo
     * @param campoIdade
     * @return null em caso de campo valido
     * mensagem de erro em caso de campo invalido
     */
    public String validaIdade(String campoIdade) {
        int idade;
        if (campoIdade.isEmpty()) {
            return "Idade invalida - campo vazio";
        } else {
            try {
                idade = Integer.parseInt(campoIdade);
                if (idade < 0) {
                    return "Idade invalida - insira um valor positivo";
                } else {
                    return null;
                }
            } catch (NumberFormatException e) {
                return "idade invalida - insira um valor numerico";
            }
        }
    }
    /**
     * Valida o campo Departamento do professor.
     * Criterios:
     * Nao vazio
     * Nao ultrapasse o limite de 40 caracteres
     * @param campoDepartamento
     * @return null em caso de campo valido
     * Mensagem de erro em caso de campo invalido
     */
    public String validaDepartamento(String campoDepartamento) {
        if (campoDepartamento.isEmpty()) {
            return "Departamento invalido - campo vazio";
        } else if (campoDepartamento.length() > 40) {
            return "Departamento invalido - maximo de 40 caracteres";
        } else {
            return null;
        }
    }
    /**
     * Valida o campo Disciplinas do professor.
     * Criterios:
     * Nao vazio
     * Nao ultrapassar o limite de 100 caracteres
     * @param campoDisciplinas
     * @return null em caso de campo valido
     * Mensagem de erro em caso de campo invalido
     */
    public String validaDisciplinas(String campoDisciplinas) {
        if (campoDisciplinas.isEmpty()) {
            return "Disciplinas invalidas - campo vazio";
        } else if (campoDisciplinas.length() > 100) {
            return "Disciplinas invalidas - maximo de 100 caracteres";
        } else {
            return null;
        }
    }
    /**
     * Valida o campo Endereco do professor.
     * Criterios:
     * Nao vazio
     * Nao ultrapassar o limite de 150 caracteres
     * @param campoEndereco
     * @return null em caso de campo valido
     * Mensagem de erro em caso de campo invalido
     */
    public String validaEndereco(String campoEndereco) {
        if (campoEndereco.isEmpty()) {
            return "Endereco invalido - campo vazio";
        } else if (campoEndereco.length() > 150) {
            return "Endereco invalido - maximo de 150 caracteres";
        } else {
            return null;
        }
    }
    /**
     * Valida o campo Pesquisa do professor.
     * Criterios:
     * Nao vazio
     * Nao ultrapassar o limite de 100 caracteres
     * @param campoPesquisa
     * @return null em caso de campo valido
     * Mensagem de erro em caso de campo invalido
     */
    public String validaPesquisa(String campoPesquisa) {
        if (campoPesquisa.isEmpty()) {
            return "Pesquisa invalida - campo vazio";
        } else if (campoPesquisa.length() > 100) {
            return "Pesquisa invalida - maximo de 100 caracteres";
        } else {
            return null;
        }
    }
}

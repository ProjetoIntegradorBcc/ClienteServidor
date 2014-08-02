package conexao;

import vo.ProfessorVO;

/**
 *
 * @author diogo
 */
public class ConexaoServidor {

    public String enviaDataGrama(ProfessorVO PVO) {
        String mensagem = VO2DataGrama(PVO);
        return null;
        
    }

    private String VO2DataGrama(ProfessorVO PVO) {
        String mensagem = "21#"+PVO.getRa()+"#"+PVO.getNome()+"#"+PVO.getIdade()
            +"#"+PVO.getEndereco()+"#"+PVO.getDepartamento()+"#"
            +PVO.getDisciplinas()+"#"+PVO.getPesquisa()+"#";
        return mensagem;
    }
}

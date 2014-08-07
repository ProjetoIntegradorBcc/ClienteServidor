/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servidor;

/**
 *
 * @author Marcelo
 */
public class ServidorDisciplinas {
    ServidorGeral servidor;
    String mensagem;    
    ServidorDisciplinas (String mensagem){
        this.mensagem = mensagem;
        int operacao = Integer.getInteger(servidor.SubString(mensagem, 1, "#"));
        switch (operacao){
        case 1: Salvar();break;
        case 2: Atualizar();break;
        case 3: Deletar();break;
        case 4: Pesquisar();break;
        }
    }
    public void Salvar(){
        vo.DisciplinaVO novo = Criar();
    }
    public void Atualizar(){
        
    }
    public void Deletar(){
        
    }
    public void Pesquisar(){
        
    }
    public vo.DisciplinaVO Criar(){
        vo.DisciplinaVO novo = new vo.DisciplinaVO();
        novo.setIdDisciplina(servidor.SubString(mensagem, 2, "#"));
        novo.setAvaliacao(servidor.SubString(mensagem, 5, "#"));
        novo.setDependencias(servidor.SubString(mensagem, 7, "#"));
        novo.setEmenta(servidor.SubString(mensagem, 6, "#"));
        novo.setTitulo(servidor.SubString(mensagem, 3, "#"));
        novo.setPreRequisitos(servidor.SubString(mensagem, 4, "#"));
        return novo;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servidor;

import java.io.IOException;
import java.net.DatagramPacket;

/**
 *
 * @author Marcelo
 */
public class ServidorDisciplinas {
    ServidorGeral servidor;
    DatagramPacket cliente;
    String mensagem;    
    ServidorDisciplinas (DatagramPacket entrada ,String mensagem) throws IOException{
        this.mensagem = mensagem;
        this.cliente = entrada;
        int operacao = Integer.getInteger(servidor.SubString(mensagem, 1, "#"));
        switch (operacao){
        case 1: Salvar();break;
        case 2: Atualizar();break;
        case 3: Deletar();break;
        case 4: Pesquisar();break;
        }
    }
    public void Salvar(){
        vo.DisciplinaVO novo = Criar(1);
        SGDB.Disciplinas disc = new SGDB.Disciplinas();
        disc.Inserir(novo.getTitulo(), novo.getPreRequisitos(), novo.getAvaliacao(), novo.getEmenta(), novo.getDependencias());
    }
    public void Atualizar(){
        vo.DisciplinaVO novo = Criar(3);
        SGDB.Disciplinas disc = new SGDB.Disciplinas();
        disc.Editar(novo.getIdDisciplina() ,novo.getTitulo(), novo.getPreRequisitos(), novo.getAvaliacao(), novo.getEmenta(), novo.getDependencias());
    }
    public void Deletar(){
        vo.DisciplinaVO novo = Criar(2);
        SGDB.Disciplinas disc = new SGDB.Disciplinas();
        disc.Deletar(novo.getIdDisciplina());
    }
    public void Pesquisar() throws IOException{
        SGDB.Disciplinas disc = new SGDB.Disciplinas();
        String ide = servidor.SubString(mensagem, 2, "#");
        String mens;
        if (ide.equals("")) mens = disc.ConsultarDisciplinas();
        else mens = disc.ConsultarDisciplina(Integer.parseInt(ide)); 
        servidor.Enviar(mens, cliente.getAddress(), cliente.getPort());
    }
    public vo.DisciplinaVO Criar(int tipo){
        int count= 2;
        vo.DisciplinaVO novo = new vo.DisciplinaVO();
        if (tipo == 1){
            novo.setIdDisciplina(0);
            count++;
        }
        else if (tipo == 2) {
            novo.setIdDisciplina(Integer.parseInt(servidor.SubString(mensagem, count, "#")));
            return novo;
        }
        else {
            novo.setIdDisciplina(Integer.parseInt(servidor.SubString(mensagem, count, "#")));
            count++;
        }
        
        novo.setTitulo(servidor.SubString(mensagem, count, "#"));
        count++;
        novo.setPreRequisitos(servidor.SubString(mensagem, count, "#"));
        count++;
        novo.setAvaliacao(servidor.SubString(mensagem, count, "#"));
        count++;
        novo.setEmenta(servidor.SubString(mensagem, count, "#"));
        count++;
        novo.setDependencias(servidor.SubString(mensagem, count, "#"));
        return novo;
    }
}

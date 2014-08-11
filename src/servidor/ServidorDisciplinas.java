/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servidor;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author Marcelo
 */
public class ServidorDisciplinas {
    DatagramSocket servidor;
    DatagramPacket cliente;
    String mensagem;
    ServidorDisciplinas (DatagramPacket entrada ,String mensagem)
            throws IOException {
        this.mensagem = mensagem;
        this.cliente = entrada;
        int operacao = Integer.getInteger(SubString(mensagem, 1, "#"));
        switch (operacao) {
        case 1: Salvar(); break;
        case 2: Atualizar(); break;
        case 3: Deletar(); break;
        case 4: Pesquisar(); break;
        default: System.out.println("Erro na mensagem!"); break;
        }
    }
    public void Salvar() throws IOException{
        vo.DisciplinaVO novo = Criar(1);
        SGDB.Disciplinas disc = new SGDB.Disciplinas();
        disc.Inserir(novo.getTitulo(), novo.getPreRequisitos(),
        novo.getAvaliacao(), novo.getEmenta(), novo.getDependencias());
        Enviar("0#", cliente.getAddress(), cliente.getPort());
    }
    public void Atualizar() throws IOException{
        vo.DisciplinaVO novo = Criar(3);
        SGDB.Disciplinas disc = new SGDB.Disciplinas();
        disc.Editar(novo.getIdDisciplina(), novo.getTitulo(),
        novo.getPreRequisitos(), novo.getAvaliacao(), novo.getEmenta(),
        novo.getDependencias());
        Enviar("0#", cliente.getAddress(), cliente.getPort());
    }
    public void Deletar() throws IOException{
        vo.DisciplinaVO novo = Criar(2);
        SGDB.Disciplinas disc = new SGDB.Disciplinas();
        disc.Deletar(novo.getIdDisciplina());
        Enviar("0#", cliente.getAddress(), cliente.getPort());
    }
    public void Pesquisar() throws IOException{
        SGDB.Disciplinas disc = new SGDB.Disciplinas();
        String ide = SubString(mensagem, 2, "#");
        String mens;
        if (ide.equals("")) {
            mens = disc.ConsultarDisciplinas();
        }
        else {
            mens = disc.ConsultarDisciplina(Integer.parseInt(ide));
        }
        Enviar(mens, cliente.getAddress(), cliente.getPort());
    }
    public vo.DisciplinaVO Criar(int tipo){
        int count = 2;
        vo.DisciplinaVO novo = new vo.DisciplinaVO();
        if (tipo == 1) {
            novo.setIdDisciplina(0);
            count++;
        }
        else if (tipo == 2) {
            novo.setIdDisciplina(Integer.parseInt(
                    SubString(mensagem, count, "#")));
            return novo;
        }
        else {
            novo.setIdDisciplina(Integer.parseInt(
                    SubString(mensagem, count, "#")));
            count++;
        }
        novo.setTitulo(SubString(mensagem, count, "#"));
        count++;
        novo.setPreRequisitos(SubString(mensagem, count, "#"));
        count++;
        novo.setAvaliacao(SubString(mensagem, count, "#"));
        count++;
        novo.setEmenta(SubString(mensagem, count, "#"));
        count++;
        novo.setDependencias(SubString(mensagem, count, "#"));
        return novo;
    }
    
    public void Enviar(String mensagem, InetAddress endereco, int porta) throws IOException{
        byte[] buffer = mensagem.getBytes();        
        DatagramPacket saida = new DatagramPacket(buffer, buffer.length, endereco, porta);
        this.servidor.send(saida); 
        //System.out.println("Enviado: "+ mensagem);
    }
    
    public String SubString(String texto, int parte, String separador){
        String[] mensagem = texto.split(separador);
        String resultado="";
        for (int count=0;count<mensagem.length;count++){
           if (count == parte){
               resultado = mensagem[count];
           }
        }
        resultado = resultado.trim();
        return resultado;
    }
}


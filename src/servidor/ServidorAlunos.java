package servidor;

import javax.swing.JOptionPane;
import vo.AlunoVO;
import java.net.*;
import java.io.*;

public class ServidorAlunos {
    DatagramSocket servidor;
    DatagramSocket alunos;
    String mensagem;

    ServidorAlunos(String mensagem) throws IOException{
        this.mensagem = mensagem;
        int operacao = Integer.getInteger(getMessage(mensagem, 1, "#"));
        
        switch (operacao) {
            case 1:
                Salvar();
                break;
            case 2:
                Atualizar();
                break;
            case 3:
                Deletar();
                break;
            case 4:
                Pesquisar();
                break;
            default:
                System.out.println("Operação inválida");
        }
    }

    private void Salvar() throws IOException{
        vo.AlunoVO novo = CriarAluno();
        SGDB.Aluno aluno = new SGDB.Aluno();
        aluno.Inserir(novo.getRa(), novo.getNome(), novo.getIdade(), novo.getEndereco(), novo.getCurso(), novo.getAnoDeEntrada(), novo.getDisciplinasMatriculadas(), novo.getDisciplinasConcluidas());
        sendMessage("0#", alunos.getInetAddress(), alunos.getPort());
    }

    private void Atualizar() throws IOException {
        vo.AlunoVO novo = CriarAluno();
        SGDB.Aluno aluno = new SGDB.Aluno();
        aluno.Editar(novo.getCodigo(), novo.getRa(), novo.getNome(), novo.getIdade(), 
        novo.getEndereco(), novo.getCurso(), novo.getAnoDeEntrada(), 
        novo.getDisciplinasMatriculadas(), novo.getDisciplinasConcluidas());
        sendMessage("0#", alunos.getInetAddress(), alunos.getPort());
    }

    private void Deletar() throws IOException {
        vo.AlunoVO novo = new AlunoVO();
        SGDB.Aluno aluno  = new SGDB.Aluno();
        aluno.Deletar((novo.getCodigo()));
        sendMessage("0#", alunos.getInetAddress(), alunos.getPort());
    }

    private void Pesquisar() throws IOException {
        vo.AlunoVO novo = new AlunoVO();
        SGDB.Aluno aluno  = new SGDB.Aluno();
        aluno.ConsultarAluno((novo.getCodigo()));
        sendMessage("0#", alunos.getInetAddress(), alunos.getPort());        
    }

    private AlunoVO CriarAluno() {
       vo.AlunoVO novo = new vo.AlunoVO();
       
       novo.setRa(getMessage(mensagem, 2, "#"));
       novo.setNome(getMessage(mensagem, 3, "#"));
       novo.setIdade(getMessage(mensagem, 4, "#"));
       novo.setEndereco(getMessage(mensagem, 5, "#"));
       novo.setCurso(getMessage(mensagem, 6, "#"));
       novo.setAnoDeEntrada(getMessage(mensagem, 7, "#"));
       novo.setDisciplinasMatriculadas(getMessage(mensagem, 8, "#"));
       novo.setDisciplinasConcluidas(getMessage(mensagem, 9, "#"));
       
       return novo;
    }

    private String getMessage(String mensagem, int opcao, String operador){
        String[] msg = mensagem.split(operador);
        String fim = "";
        
        for (int i=0; i<msg.length; i++){
            if (i == opcao)
                fim = msg[i];
        }
        
        fim = fim.trim();
        
        return fim;
    }
    
    private void sendMessage(String msg, InetAddress end, int porta) throws IOException{
        byte[] entrada = msg.getBytes();
        DatagramPacket out = new DatagramPacket(entrada, entrada.length, end, porta);
        this.servidor.send(out);
    }
}
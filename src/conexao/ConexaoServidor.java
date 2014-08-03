package conexao;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import vo.ProfessorVO;

/**
 *
 * @author diogo
 */
public class ConexaoServidor {
    
    private DatagramSocket ds;
    private InetAddress ip;
    private int porta;
    private DatagramPacket pacote;
    
    public String enviaDataGrama(ProfessorVO PVO) {
        
        String mensagem  = VOParaDataGrama(PVO);
        byte[] msg = mensagem.getBytes();
        this.pacote = new DatagramPacket(msg, msg.length, ip, porta);
        try {
            this.ds.send(pacote);
        } catch (IOException ex) {
            return "Erro ao enviar";
        }
        return recebeDataGrama();
    }

    public String recebeDataGrama(){

        byte[] resposta = new byte[256];
        pacote = new DatagramPacket(resposta, resposta.length);
        //tratar tempo limite excedido aqui
            try {
                ds.receive(pacote);
                String r = new String(pacote.getData(), 0, pacote.getLength());
                return r;
            } catch (IOException ex) {
                return "2#";
            }
    }
    
    private String VOParaDataGrama(ProfessorVO PVO) {
        String mensagem = "21#"+PVO.getRa()+"#"+PVO.getNome()+"#"+PVO.getIdade()
            +"#"+PVO.getEndereco()+"#"+PVO.getDepartamento()+"#"
            +PVO.getDisciplinas()+"#"+PVO.getPesquisa()+"#";
        return mensagem;
    }

    public String estabeleceConexao(String ip, String porta) {
        try {
            this.ip = InetAddress.getByName(ip);
        } catch (UnknownHostException ex) {
            return "Erro - ip invalido";
        }
        this.porta = Integer.parseInt(porta);
        try {
            this.ds = new DatagramSocket();
        } catch (SocketException ex) {
            return "Erro na criacao do DatagramSocket";
        }
        return "Conexao Estabelecida";
    }

    public ArrayList<ProfessorVO> buscaProfessor() {
        
        String mensagem = "25#";
        byte[] msg = mensagem.getBytes();
        this.pacote = new DatagramPacket(msg, msg.length, ip, porta);
        try {
            this.ds.send(pacote);
        } catch (IOException ex) {
            return null;
        }
        
        String resposta = recebeDataGrama();
        
        return dataGramaParaVO(resposta);
    }

    private ArrayList<ProfessorVO> dataGramaParaVO(String resposta) {
        switch(resposta.substring(0, 2)){
            case "4#":
                return null;
            case "5#":
                return converteDataGramaPesquisaProfessor(resposta);
            default:
                return null;
        }
    }

    private ArrayList<ProfessorVO> converteDataGramaPesquisaProfessor(String mensagem) {
        String nome = "", id = "";
        ArrayList<ProfessorVO> professores = new ArrayList<>();
        if (!mensagem.isEmpty()) {
            int i = 2;
            while (i < mensagem.length()) {
                ProfessorVO p = new ProfessorVO();
                nome = "";
                id = "";
                while (i < mensagem.length()) {
                    if (!"#".equals(mensagem.substring(i, i + 1))) {
                        id = id + mensagem.substring(i, i + 1);
                    } else {
                        break;
                    }
                    i++;
                }
                i++;
                while (i < mensagem.length()) {
                    if (!"#".equals(mensagem.substring(i, i + 1))) {
                        nome = nome + mensagem.substring(i, i + 1);
                    } else {
                        break;
                    }
                    i++;
                }
                p.setNome(nome);
                p.setCodigo(id);
                professores.add(p);
                i++;
            }
            return professores;
        } else {
            return null;
        }
    }
    
}

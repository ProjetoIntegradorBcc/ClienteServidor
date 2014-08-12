package conexao;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import vo.AlunosVO;
import vo.AulaVO;
import vo.DisciplinaVO;
import vo.SalaVO;
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
    
    public String enviaDataGrama(String idProfessor) {
        
        String mensagem = "23#"+idProfessor+"#";
        byte[] msg = mensagem.getBytes();
        this.pacote = new DatagramPacket(msg, msg.length, ip, porta);
        try {
            this.ds.send(pacote);
        } catch (IOException ex) {
            return "Erro ao enviar";
        }
        return recebeDataGrama();
    }
    
    public String enviaDataGrama(SalaVO SVO) {
        
        String mensagem  = VOParaDataGrama(SVO);
        byte[] msg = mensagem.getBytes();
        this.pacote = new DatagramPacket(msg, msg.length, ip, porta);
        try {
            this.ds.send(pacote);
        } catch (IOException ex) {
            return "Erro ao enviar";
        }
        return recebeDataGrama();
    }
    
    public String enviaDataGrama(AulaVO AVO) {
        
        String mensagem  = VOParaDataGrama(AVO);
        byte[] msg = mensagem.getBytes();
        this.pacote = new DatagramPacket(msg, msg.length, ip, porta);
        try {
            this.ds.send(pacote);
        } catch (IOException ex) {
            return "Erro ao enviar";
        }
        return recebeDataGrama();
    }  
    
     public String enviaDataGrama(AlunosVO alunoVO) {
        
        String mensagem  = VOParaDataGrama(alunoVO);
        byte[] msg = mensagem.getBytes();
        this.pacote = new DatagramPacket(msg, msg.length, ip, porta);
        try {
            this.ds.send(pacote);
        } catch (IOException ex) {
            return "Erro ao enviar";
        }
        return recebeDataGrama();
    }
     
     public String enviaDataGrama(DisciplinaVO DVO) {
        
        String mensagem  = VOParaDataGrama(DVO);
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
        String mensagem;
        if(PVO.getCodigo()==null){
            mensagem = "21#";
        }
        else{
            mensagem = "22#"+PVO.getCodigo()+"#";
        }
        mensagem = mensagem +PVO.getRa()+"#"+PVO.getNome()+"#"+PVO.getIdade()
            +"#"+PVO.getEndereco()+"#"+PVO.getDepartamento()+"#"
            +PVO.getDisciplinas()+"#"+PVO.getPesquisa()+"#";
        return mensagem;
    }
    
    private String VOParaDataGrama(SalaVO SVO) {
        String mensagem = "41#"+SVO.getDescricao()+"#"+SVO.getNumComputadores()+"#"+SVO.getRecursos()+"#"
                +SVO.getDepartamento()+"#"+SVO.getCapacidade();
        return mensagem;
    }
    
    private String VOParaDataGrama(AulaVO AVO) {
        String mensagem = "51#"+AVO.getDisciplina()+"#"+AVO.getSala()+"#"+AVO.getAlunosPresentes()
            +"#"+AVO.getConteudoProgramatico();
        return mensagem;
    }
    
    private String VOParaDataGrama(AlunosVO alunoVO) {
        String mensagem = "21#"+alunoVO.getRA()+"#"+alunoVO.getNome()+"#"+alunoVO.getDatanasc()
            +"#"+alunoVO.getEndereco()+"#"+alunoVO.getCurso()+"#"
            +alunoVO.getAnoDeEntrada()+"#"+alunoVO.getDisciplinasMatriculadas()+"#"+alunoVO.getDisciplinasConcluidas()+"#";
        return mensagem;
    }
    
     private String VOParaDataGrama(DisciplinaVO DVO) {
        String mensagem = "21#"+DVO.getIdDisciplina()+"#"+DVO.getTitulo()+"#"+DVO.getPreRequisitos()
            +"#"+DVO.getAvaliacao()+"#"+DVO.getEmenta()+"#"
            +DVO.getDependencias()+"#";
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
        System.out.println("Enviou");
        String resposta = recebeDataGrama();
        return converteDataGramaBuscaProfessor(resposta);
    }
    
    public ProfessorVO pesquisaProfessor(String id) {
        
        String mensagem = "24#"+id;
        byte[] msg = mensagem.getBytes();
        this.pacote = new DatagramPacket(msg, msg.length, ip, porta);
        try {
            this.ds.send(pacote);
        } catch (IOException ex) {
            return null;
        }
        System.out.println("Enviou");
        String resposta = recebeDataGrama();
        System.out.println(resposta);
        return converteDataGramaPesquisaProfessor(resposta);
    }
    
    public ArrayList<AulaVO> buscaAula() {
        
        String mensagem = "55#";
        byte[] msg = mensagem.getBytes();
        this.pacote = new DatagramPacket(msg, msg.length, ip, porta);
        try {
            this.ds.send(pacote);
        } catch (IOException ex) {
            return null;
        }
        System.out.println("Enviou");
        String resposta = recebeDataGrama();
        System.out.println(resposta);
        System.out.println("***");
        return dataGramaAulaParaVO(resposta);
    }
    
    public ArrayList<DisciplinaVO> buscaDisciplina() {
        
        String mensagem = "25#";
        byte[] msg = mensagem.getBytes();
        this.pacote = new DatagramPacket(msg, msg.length, ip, porta);
        try {
            this.ds.send(pacote);
        } catch (IOException ex) {
            return null;
        }
        System.out.println("Enviou");
        String resposta = recebeDataGrama();
        System.out.println(resposta);
        System.out.println("***");
        return dataGramaDisciplinaParaVO(resposta);
    }

    
    private ArrayList<AulaVO> dataGramaAulaParaVO(String resposta) {
        System.out.println(resposta);
        System.out.println(resposta.substring(0, 3));
        switch(resposta.substring(0, 3)){
            case "04#":
                return null;
            case "05#":
                System.out.println("dt2vo");
                return converteDataGramaPesquisaAula(resposta);
            default:
                return null;
        }
    }
    
    
    private ArrayList<DisciplinaVO> dataGramaDisciplinaParaVO(String resposta) {
        System.out.println(resposta);
        System.out.println(resposta.substring(0, 3));
        switch(resposta.substring(0, 3)){
            case "04#":
                return null;
            case "05#":
                System.out.println("dt2vo");
                return converteDataGramaPesquisaDisciplina(resposta);
            default:
                return null;
        }
    }

    private ArrayList<ProfessorVO> converteDataGramaBuscaProfessor(String mensagem) {
        String nome = "", id = "";
        ArrayList<ProfessorVO> professores = new ArrayList<>();
        if (!mensagem.isEmpty()) {
            int i = 3;
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
    
    private ProfessorVO converteDataGramaPesquisaProfessor(String mensagem) {
        String id = "", ra = "", nome = "", idade = "", endereco = "",
            departamento = "", disciplinasMinistradas = "", linhasPesquisas = "";
        if (!mensagem.isEmpty()) {
            int i = 3;
            ProfessorVO p = new ProfessorVO();
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
                    ra = ra + mensagem.substring(i, i + 1);
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
            i++;
            while (i < mensagem.length()) {
                if (!"#".equals(mensagem.substring(i, i + 1))) {
                    idade = idade + mensagem.substring(i, i + 1);
                } else {
                    break;
                }
                i++;
            }
            i++;
            while (i < mensagem.length()) {
                if (!"#".equals(mensagem.substring(i, i + 1))) {
                    endereco = endereco + mensagem.substring(i, i + 1);
                } else {
                    break;
                }
                i++;
            }
            i++;
            while (i < mensagem.length()) {
                if (!"#".equals(mensagem.substring(i, i + 1))) {
                    departamento = departamento + mensagem.substring(i, i + 1);
                } else {
                    break;
                }
                i++;
            }
            i++;
            while (i < mensagem.length()) {
                if (!"#".equals(mensagem.substring(i, i + 1))) {
                    disciplinasMinistradas = disciplinasMinistradas + mensagem.substring(i, i + 1);
                } else {
                    break;
                }
                i++;
            }
            i++;
            while (i < mensagem.length()) {
                if (!"#".equals(mensagem.substring(i, i + 1))) {
                    linhasPesquisas = linhasPesquisas + mensagem.substring(i, i + 1);
                } else {
                    break;
                }
                i++;
            }
            
            p.setCodigo(id);
            p.setRa(ra);
            p.setNome(nome);
            p.setIdade(idade);
            p.setEndereco(endereco);
            p.setDepartamento(departamento);
            p.setDisciplinas(disciplinasMinistradas);
            p.setPesquisa(linhasPesquisas);
            return p;
        } else {
            return null;
        }
    }
    
    private ArrayList<AulaVO> converteDataGramaPesquisaAula(String mensagem) {
        String disciplina = "", sala = "";
        ArrayList<AulaVO> aulas = new ArrayList<>();
        if (!mensagem.isEmpty()) {
            int i = 3;
            while (i < mensagem.length()) {
                AulaVO a = new AulaVO();
                disciplina = "";
                sala = "";
                while (i < mensagem.length()) {
                    if (!"#".equals(mensagem.substring(i, i + 1))) {
                        sala = sala + mensagem.substring(i, i + 1);
                    } else {
                        break;
                    }
                    i++;
                }
                i++;
                while (i < mensagem.length()) {
                    if (!"#".equals(mensagem.substring(i, i + 1))) {
                        disciplina = disciplina + mensagem.substring(i, i + 1);
                    } else {
                        break;
                    }
                    i++;
                }
                System.out.println(disciplina + " " + sala);
                a.setDisciplina(disciplina);
                a.setSala(sala);
                aulas.add(a);
                i++;
            }
            return aulas;
        } else {
            return null;
        }
    }
    
    
    private ArrayList<DisciplinaVO> converteDataGramaPesquisaDisciplina(String mensagem) {
        String titulo = "", id = "";
        ArrayList<DisciplinaVO> disciplinas = new ArrayList<>();
        if (!mensagem.isEmpty()) {
            int i = 3;
            while (i < mensagem.length()) {
                DisciplinaVO d = new DisciplinaVO();
                titulo = "";
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
                        titulo = titulo + mensagem.substring(i, i + 1);
                    } else {
                        break;
                    }
                    i++;
                }
                System.out.println(titulo + " " + id);
                d.setTitulo(titulo);
                d.setIdDisciplina(Integer.parseInt(id));
                disciplinas.add(d);
                i++;
            }
            return disciplinas;
        } else {
            return null;
        }
    }

    
}

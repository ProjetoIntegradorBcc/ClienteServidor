package servidor;

import SGDB.Professor;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Thread faz o servidor receber um datagrama do cliente.
 *
 * @author Jonas
 */
class ThreadCliente extends Thread {

    /**
     * criando datagrama.
     */
    private DatagramSocket ds;

    public ThreadCliente(DatagramSocket ds) {
        this.ds = ds;
    }

    @Override
    public void run() {
        try {
            String ip;
            int i, porta;
            byte[] msg = new byte[256];
            DatagramPacket pkg = new DatagramPacket(msg, msg.length);

            
            do {
                String mensagem = "";
                ds.receive(pkg);
                porta = pkg.getPort();
                ip = pkg.getAddress().getHostAddress();
                mensagem = new String(pkg.getData(), 0, pkg.getLength());
                switch (mensagem.substring(0, 1)) {
                    case "1":
                        System.out.println("ALUNOS");
                        break;
                    case "2":
                        SGDB.Professor banco = new SGDB.Professor();
                        switch (mensagem.substring(1, 2)) {
                            case "1":
                                String ra = "";
                                String nome = "";
                                String idade = "";
                                String endereco = "";
                                String departamento = "";
                                String disciplinas = "";
                                String linhasPesquisa = "";

                                System.out.println("recebeu:" + mensagem);

                                i = 3;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    ra = (ra + mensagem.substring(i, i + 1));
                                    i++;
                                }
                                i++;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    nome = nome + mensagem.substring(i, i + 1);
                                    i++;
                                }
                                i++;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    idade = idade + mensagem.substring(i, i + 1);
                                    i++;
                                }
                                i++;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    endereco = endereco + mensagem.substring(i, i + 1);
                                    i++;
                                }
                                i++;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    departamento = departamento + mensagem.substring(i, i + 1);
                                    i++;
                                }
                                i++;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    disciplinas = disciplinas + mensagem.substring(i, i + 1);
                                    i++;
                                }
                                i++;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    linhasPesquisa = linhasPesquisa + mensagem.substring(i, i + 1);
                                    i++;
                                }
                                mensagem = banco.Inserir(ra, nome, idade, endereco, departamento, disciplinas, linhasPesquisa) + "#";
                                DatagramPacket pkgo = new DatagramPacket(mensagem.getBytes(), mensagem.getBytes().length, InetAddress.getByName(ip), porta);
                                ds.send(pkgo);
                                System.out.println("enviou:" + mensagem);
                                mensagem = "";
                                break;
                            case "2":
                                System.out.println("PROFESSOR - EDITAR");
                                break;
                            case "3":
                                System.out.println("PROFESSOR - DELETAR");
                                break;
                            case "4":
                                System.out.println("PROFESSOR - CONSULTAR");
                                break;
                            case "5":
                                System.out.println("recebeu:" + mensagem);
                                mensagem = banco.ConsultarProfessor();
                                pkgo = new DatagramPacket(mensagem.getBytes(), mensagem.getBytes().length, InetAddress.getByName(ip), porta);
                                ds.send(pkgo);
                                System.out.println("enviou:" + mensagem);
                                break;
                            default:
                        }
                    break;
                    case "3":
                        System.out.println("DISCIPLINAS");
                        break;
                    case "4":
                        DatagramPacket pacoteSalas;
                        SGDB.Salas salas = new SGDB.Salas();
                        String id4 = "";
                        String descricaoLaboratorio4 = "";
                        String numeroComputadores4 = "";
                        String recursosDidaticos4 = "";
                        String departamento4 = "";
                        String capacidadeMaximaAlunos4 = "";

                        switch (mensagem.substring(1, 2)) {
                            case "1":
                                i = 3;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    descricaoLaboratorio4 = (descricaoLaboratorio4 + mensagem.substring(i, i + 1));
                                    i++;
                                }
                                i++;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    numeroComputadores4 = numeroComputadores4 + mensagem.substring(i, i + 1);
                                    i++;
                                }
                                i++;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    recursosDidaticos4 = recursosDidaticos4 + mensagem.substring(i, i + 1);
                                    i++;
                                }
                                i++;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    departamento4 = departamento4 + mensagem.substring(i, i + 1);
                                    i++;
                                }
                                i++;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    capacidadeMaximaAlunos4 = capacidadeMaximaAlunos4 + mensagem.substring(i, i + 1);
                                    i++;
                                }
                                mensagem = salas.Inserir(descricaoLaboratorio4, numeroComputadores4, recursosDidaticos4, departamento4, capacidadeMaximaAlunos4) + "#";
                                pacoteSalas = new DatagramPacket(mensagem.getBytes(), mensagem.getBytes().length, InetAddress.getByName(ip), porta);
                                ds.send(pacoteSalas);
                                break;
                            case "2":
                                i = 3;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    id4 = (id4 + mensagem.substring(i, i + 1));
                                    i++;
                                }
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    descricaoLaboratorio4 = (descricaoLaboratorio4 + mensagem.substring(i, i + 1));
                                    i++;
                                }
                                i++;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    numeroComputadores4 = numeroComputadores4 + mensagem.substring(i, i + 1);
                                    i++;
                                }
                                i++;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    recursosDidaticos4 = recursosDidaticos4 + mensagem.substring(i, i + 1);
                                    i++;
                                }
                                i++;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    departamento4 = departamento4 + mensagem.substring(i, i + 1);
                                    i++;
                                }
                                i++;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    capacidadeMaximaAlunos4 = capacidadeMaximaAlunos4 + mensagem.substring(i, i + 1);
                                    i++;
                                }

                                mensagem = salas.Editar(id4, descricaoLaboratorio4, numeroComputadores4, recursosDidaticos4, departamento4, capacidadeMaximaAlunos4) + "#";
                                pacoteSalas = new DatagramPacket(mensagem.getBytes(), mensagem.getBytes().length, InetAddress.getByName(ip), porta);
                                ds.send(pacoteSalas);
                                break;
                            case "3":
                                i = 3;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    id4 = (id4 + mensagem.substring(i, i + 1));
                                    i++;
                                }
                                mensagem = salas.Deletar(id4) + "#";
                                pacoteSalas = new DatagramPacket(mensagem.getBytes(), mensagem.getBytes().length, InetAddress.getByName(ip), porta);
                                ds.send(pacoteSalas);
                                break;
                            case "4":
                                i = 3;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    id4 = (id4 + mensagem.substring(i, i + 1));
                                    i++;
                                }
                                mensagem = salas.ConsultarSalas(Integer.parseInt(id4));
                                pacoteSalas = new DatagramPacket(mensagem.getBytes(), mensagem.getBytes().length, InetAddress.getByName(ip), porta);
                                ds.send(pacoteSalas);
                                break;
                            case "5":
                                mensagem = salas.ConsultarSalas();
                                pacoteSalas = new DatagramPacket(mensagem.getBytes(), mensagem.getBytes().length, InetAddress.getByName(ip), porta);
                                ds.send(pacoteSalas);
                                break;
                            default:
                                mensagem = "1#";
                                pacoteSalas = new DatagramPacket(mensagem.getBytes(), mensagem.getBytes().length, InetAddress.getByName(ip), porta);
                                ds.send(pacoteSalas);
                        }
                    break;
                    case "5":{
                        SGDB.Aula bancoAula = new SGDB.Aula();
                        switch (mensagem.substring(1, 2)) {
                            case "1":
                                String disciplinaAssociada = "";
                                String salaAssociada = "";
                                String alunosPresentes = "";
                                String conteudoProgramatico = "";
                                
                                System.out.println("recebeu:" + mensagem);

                                i = 3;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    disciplinaAssociada = (disciplinaAssociada + mensagem.substring(i, i + 1));
                                    i++;
                                }
                                i++;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    salaAssociada = salaAssociada + mensagem.substring(i, i + 1);
                                    i++;
                                }
                                i++;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    alunosPresentes = alunosPresentes + mensagem.substring(i, i + 1);
                                    i++;
                                }
                                i++;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    conteudoProgramatico = conteudoProgramatico + mensagem.substring(i, i + 1);
                                    i++;
                                }
                                mensagem = bancoAula.Inserir(disciplinaAssociada, salaAssociada, alunosPresentes, conteudoProgramatico) + "#";
                                DatagramPacket pkgo = new DatagramPacket(mensagem.getBytes(), mensagem.getBytes().length, InetAddress.getByName(ip), porta);
                                ds.send(pkgo);
                                System.out.println("enviou:" + mensagem);
                                mensagem = "";
                                break;
                            case "2":
                                System.out.println("PROFESSOR - EDITAR");
                                break;
                            case "3":
                                System.out.println("PROFESSOR - DELETAR");
                                break;
                            case "4":
                                System.out.println("PROFESSOR - CONSULTAR");
                                break;
                            case "5":
                                System.out.println("recebeu:" + mensagem);
                                mensagem = bancoAula.ConsultarProfessor();
                                pkgo = new DatagramPacket(mensagem.getBytes(), mensagem.getBytes().length, InetAddress.getByName(ip), porta);
                                ds.send(pkgo);
                                System.out.println("enviou:" + mensagem);
                                break;
                            default:
                        }                   
                    }
                }
            } while (true);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Excecao ocorrida na thread: " + e.getMessage());
            try {
            } catch (Exception ec) {
            }
        }
    }
}

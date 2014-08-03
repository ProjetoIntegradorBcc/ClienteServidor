package servidor;

import SGDB.Professor;
import java.net.*;
import java.io.*;
import java.util.ArrayList;

class ThreadCliente extends Thread {

    private DatagramSocket ds;
    private int porta;

    public ThreadCliente(DatagramSocket ds, int porta) {
        this.porta = porta;
        this.ds = ds;
    }

    @Override
    public void run() {
        try {

            int i;

            byte[] msg = new byte[256];
            DatagramPacket pkg = new DatagramPacket(msg, msg.length);
            int porta;
            String ip;
            String mensagem, pacote;
            do {
                pacote = mensagem = "";
                ds.receive(pkg);
                porta = pkg.getPort();
                ip = pkg.getAddress().getHostAddress();
                mensagem = new String(pkg.getData(), 0, pkg.getLength());
                System.out.println("" + mensagem);
                switch (mensagem.substring(0, 1)) {
                    case "1":
                        System.out.println("ALUNOS");
                        break;
                    case "2":
                        switch (mensagem.substring(1, 2)) {
                            case "1":
                                String RA = "";
                                String nome = "";
                                String idade = "";
                                String endereco = "";
                                String departamento = "";
                                String disciplinas = "";
                                String linhasPesquisa = "";

                                System.out.println("" + mensagem);

                                i = 3;
                                while (!("#".equals(mensagem.substring(i, i + 1))) && (i < mensagem.length())) {
                                    RA = (RA + mensagem.substring(i, i + 1));
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

                                Professor banco = new Professor();
                                mensagem = banco.Inserir(RA, nome, idade, endereco, departamento, disciplinas, linhasPesquisa) + "#" + banco.ConsultarProfessor(Integer.parseInt(RA)) + "#";
                                DatagramPacket pkgo = new DatagramPacket(mensagem.getBytes(), mensagem.getBytes().length, InetAddress.getByName(ip), porta);
                                ds.send(pkgo);
                                System.out.println("" + ip);
                                System.out.println("" + porta);
                                System.out.println("" + mensagem);

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
                            default:
                        }

                        while (true);
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
                                System.out.println("SALAS - CONSULTAR");
                                break;
                            default:
                        }
                        while (true);
                    case "5":
                        System.out.println("AULAS");
                        break;
                    default:

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

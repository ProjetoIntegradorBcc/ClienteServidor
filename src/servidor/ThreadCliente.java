package servidor;

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
                                
                                System.out.println(""+mensagem);

                                int i = 3;
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
                                
                                Banco banco = new Banco();
                                mensagem = banco.Inserir(RA, nome, idade, endereco, departamento, disciplinas, linhasPesquisa)+"#"+banco.ConsultarProfessor(Integer.parseInt(RA))+"#";
                                DatagramPacket pkgo = new DatagramPacket(mensagem.getBytes(), mensagem.getBytes().length, InetAddress.getByName(ip), porta);
                                ds.send(pkgo);
                                System.out.println(""+ip);
                                System.out.println(""+porta);
                                System.out.println(""+mensagem);
                                
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
                        System.out.println("SALAS");
                        break;
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

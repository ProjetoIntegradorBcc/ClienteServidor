package servidor;

import java.net.*;
import java.io.*;

public class ThreadCliente extends Thread {

    private DatagramSocket ds;

    @Override
    public void run() {

        try {
            byte[] msg = new byte[256];
            DatagramPacket pkg = new DatagramPacket(msg, msg.length);
            int porta;
            InetAddress ip;
            String mensagem, pacote;
            do {
                pacote = mensagem = "";
                ds.receive(pkg);
                porta = pkg.getPort();
                ip = pkg.getAddress();
                mensagem = new String(pkg.getData(), 0, pkg.getLength());
                switch (pacote.substring(0, 3)) {
                    case "21#":
                        break;
                    case "22#":
                        break;
                    case "23#":
                        break;
                    case "24#":
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

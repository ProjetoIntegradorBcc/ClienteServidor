/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servidor;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author Marcelo
 */
public class ServidorGeral {
    DatagramSocket servidor = null;
    DatagramPacket entrada = null;
    DatagramPacket saida = null;
    int porta;
    
    public ServidorGeral(int porta) {
        this.porta = porta;
        try{
            this.servidor = new DatagramSocket(this.porta);
            new ThreadServidor(servidor).start();
            
        }catch(SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        }
     }

    public String SubString(String texto, int parte, String separador){
        String[] mensagem = texto.split(separador);
        String resultado="";
        for (int count=0;count<mensagem.length;count++){
           if (count==parte){
               resultado = mensagem[count];
           }
        }
        resultado = resultado.trim();
        return resultado;
    }

}

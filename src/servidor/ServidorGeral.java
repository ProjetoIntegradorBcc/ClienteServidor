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
import java.net.SocketException;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class ServidorGeral {
    DatagramSocket servidor = null;
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
    public static void main(String args[]) {
        int porta = Integer.parseInt(JOptionPane.showInputDialog("Insira o número da porta"));
        ServidorGeral server = new ServidorGeral(porta);
        JOptionPane.showMessageDialog(null, "Servidor ouvindo a porta: "+porta);
        
    }

    

}

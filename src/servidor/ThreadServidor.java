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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author frgalhardonl
 */
public class ThreadServidor extends Thread{
    DatagramSocket servidor = null;
    ServidorGeral Server;
    
    public ThreadServidor (DatagramSocket servidor){
        this.servidor = servidor;
    }
    
    @Override
    public void run() {
        while(true){
            Receber();
        }
    }
    public void Receber(){
        byte[] buffer = new byte[200];
        DatagramPacket entrada = new DatagramPacket(buffer, buffer.length);
        try {
            this.servidor.receive(entrada);
        } catch (IOException ex) {
            Logger.getLogger(ThreadServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        String mensagem = new String(entrada.getData());;
        
        int componente = Integer.getInteger(SubString(mensagem, 0, "#"));
        switch(componente){
            case 1:/*Coloque aqui a chamada para a classe do seu componente*/;break; 
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
}

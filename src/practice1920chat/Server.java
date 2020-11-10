package practice1920chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Server {
    public static int port=9888;
    static HashMap<InetAddress,String>  users=new HashMap<>();
    static DatagramSocket socket;

    static {
        try {
            socket = new DatagramSocket(port);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public Server() throws IOException { }

    public static void main(String[] args) {
        Thread th=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                   byte[] buffer=new byte[50000];
                    DatagramPacket packet=new DatagramPacket(buffer,0,buffer.length);
                    try {
                        socket.receive(packet);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    String message= new String(packet.getData(),0,packet.getLength());
                    if(!users.containsKey(packet.getAddress())){
                        users.put(packet.getAddress(),message);

                    }
                    else{
                        System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date())
                                +" | "+users.get(packet.getAddress())+" : "+message);
                    }
                    System.out.println();
                }
            }
        });
        th.start();
    }
}

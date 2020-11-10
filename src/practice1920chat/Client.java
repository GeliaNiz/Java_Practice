package practice1920chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Client {
    public static final int port=9888;
    public static DatagramSocket socket;

    static {
        try {
            socket = new DatagramSocket(9889);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public static Runnable sending= new Runnable() {
        @Override
        public void run() {
            Scanner sc = new Scanner(System.in);
            String message = sc.nextLine();
            while(true) {
                try {
                    sendMessage(message, "25.57.204.138");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                message = sc.nextLine();
            }
        }
    };
    public static Runnable receiving = new Runnable() {
        @Override
        public void run() {
            while(true) {
                try {
                    receiveMessage();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    };
    public static void main(String[] args) throws IOException{
        Thread th1=new Thread(sending) ;
        Thread th2=new Thread(receiving);
        th1.start();
        th2.start();

    }
    public static void sendMessage(String message,String address) throws IOException {
        byte[] buffer=message.getBytes();
        DatagramPacket packet=new DatagramPacket(buffer,0,buffer.length, InetAddress.getByName(address),port);
        socket.send(packet);
    }
    public static void receiveMessage()throws IOException{
        System.out.println("r");
        byte[] buffer=new byte[5000];
        DatagramPacket packet=new DatagramPacket(buffer,0,buffer.length);
        socket.receive(packet);
        String message=new String(buffer,0,packet.getLength());
        System.out.println(message);

    }
}

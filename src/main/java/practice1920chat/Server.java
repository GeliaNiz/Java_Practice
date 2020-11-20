package practice1920chat;

import java.io.FileWriter;
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
    public static int sendPort=9889;
    static HashMap<InetAddress,String>  users=new HashMap<>();
    static DatagramSocket socket;
    static public FileWriter writer;

    static {
        try {
              writer = new FileWriter("history_of_chat.txt");
            socket = new DatagramSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Server() throws IOException { }
    public static void sendMessage(String message,String address) throws IOException {
        byte[] buffer=message.getBytes();
        DatagramPacket packet=new DatagramPacket(buffer,0,buffer.length, InetAddress.getByName(address.substring(1)),sendPort);
        socket.send(packet);
    }

    public static void main(String[] args) {
        Thread th=new Thread(new Runnable() {
            @Override
            public void run() {

                while (true) {
                    byte[] buffer = new byte[50000];
                    DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length);
                    try {
                        socket.receive(packet);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    String message = new String(packet.getData(), 0, packet.getLength());
                    if (!users.containsKey(packet.getAddress())) {
                        users.put(packet.getAddress(), message);
                        System.out.println(packet.getAddress()+" "+users.get(packet.getAddress()));

                    } else {
                        for (InetAddress i : users.keySet()) {
                            if (!i.toString().equals(packet.getAddress().toString())) {
                                try {
                                    sendMessage((" | " + users.get(packet.getAddress()) + " : " + message), i.toString());

                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        try {
                            writer.write(new SimpleDateFormat("HH:mm:ss").format(new Date())
                                    + " | " + users.get(packet.getAddress()) + " : " + message+"\n");
                            writer.flush();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date())
                                + " | " + users.get(packet.getAddress()) + " : " + message);

                    }
                }
            }
        });
        th.start();

    }
}



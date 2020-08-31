package socketProgramming;

import java.net.*;
import java.io.*;

public class client{
    // initialize socket and input output streams 
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream output = null;

    public client(String address, int port) {
        try{
            // establish a connection 
            socket = new Socket(address,port);
            System.out.println("Client Connected");
            input = new DataInputStream(System.in);
            output = new DataOutputStream(socket.getOutputStream());
        }
        catch(UnknownHostException u){
            System.out.println(u);
        }
        catch(IOException i){
            System.out.println(i);
        }
        String line="";
        // keep reading until "Over" is input 
        while (!line.equals("Over")) {
            try{
                line = input.readLine();
                output.writeUTF(line);
            }
            catch(IOException i){
                System.out.println(i);
            }
        }
        // close the connection
        try{
            input.close();socket.close();output.close();
        }
        catch(IOException i){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        client c = new client("127.0.0.1",3000);
    }
}
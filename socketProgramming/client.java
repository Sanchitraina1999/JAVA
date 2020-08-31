package socketProgramming;

import java.net.*;
import java.io.*;

public class client{
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream output = null;

    public client(String address, int port) {
        try{
            socket = new Socket(address,port);
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
        while (!line.equals("Over")) {
            try{
                line = input.readLine();
                output.writeUTF(line);
            }
            catch(IOException i){
                System.out.println(i);
            }
        }

        try{
            input.close();socket.close();output.close();
        }
        catch(IOException i){
            System.out.println(i);
        }
    }
    public 
}
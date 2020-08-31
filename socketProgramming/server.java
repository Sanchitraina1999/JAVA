package socketProgramming;

import java.net.*;
import java.io.*;

public class server {
    private Socket socket=null;
    private ServerSocket server = null;
    private DataInputStream in = null;
    public Server(int port){
        try{
            server = new ServerSocket(port);
            System.out.println("Server started"); 
            System.out.println("Waiting for a client ..."); 
            
        }
    }
}
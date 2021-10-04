package com.company.module_12;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ServerClient implements Runnable{
    private final Server server;
    private final Socket socket;
    PrintStream out;

    public ServerClient(Socket socket,Server server){
        this.socket = socket;
        this.server = server;
        new Thread(this).start();
    }

    void  receiveMessage(String message, ServerClient senderClient) {
        if(this != senderClient) {
            out.println(message);
        }
    }

    public void run() {
        try {
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            Scanner in = new Scanner(is);
            out = new PrintStream(os);

            out.println("Welcome to chat!");
            String input = in.nextLine();
            while (!input.equals("bye")) {
                server.sendMessage(input,this);
                input = in.nextLine();
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


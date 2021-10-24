package com.company.module_12;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

    ArrayList<ServerClient> clients = new ArrayList<>();

    void runServer() {
        try {
            ServerSocket serverSocket = new ServerSocket(54206);
            while (true) {
                System.out.println("Waiting...");
                // ждем клиента из сети
                Socket socket = serverSocket.accept();
                System.out.println("Client connected!");
                // создаем клиента на своей стороне
                ServerClient client = new ServerClient(socket, this);
                clients.add(client);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void sendMessage(String message, ServerClient senderClient) {
        for (ServerClient client: clients) {
            client.receiveMessage(message, senderClient);
        }
    }

    public static void main(String[] args) throws IOException {
        new Server().runServer();
    }
}




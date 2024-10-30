import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer implements Executor {
    private Socket clientSocket;
    private ServerSocket serverSocket;
    public static final int DEFAULT_PORT = 1010;
    private ExecutorService fixedPool = Executors.newFixedThreadPool(100);
    private final List<ClientHandler> clients;
    private String in;
    private String out;

    public ChatServer() {
        try {
            clients = new CopyOnWriteArrayList<>();
            serverSocket = new ServerSocket(DEFAULT_PORT);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        listen();
    }

    private void listen() {
        while (true) {
            System.out.println("Waiting for connection");
            try {
                clientSocket = serverSocket.accept();
                System.out.println("Connection successful");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            ClientHandler client = new ClientHandler(clientSocket);
            fixedPool.submit(client);
            addClient(client);

        }

    }
    private void addClient(ClientHandler clientHandler) {
        clients.add(clientHandler);
    }
    private void removeClient(ClientHandler clientHandler) {
        clients.remove(clientHandler);
    }
    private String sendMessage(String message) {
        //String in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        //String out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        return message;
    }

    private void broadcast(String message) {
        //for (ClientHandler client: clients) {
            //client.sendMessage(message);
            
        }
    //}

    public void close() {
        try {
            clientSocket.close();
            System.out.println("Connection terminated");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void execute(Runnable command) {

    }
}

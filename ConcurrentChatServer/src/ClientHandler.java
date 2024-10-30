import java.io.*;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private Socket clientSocket;
    private BufferedWriter out;
    private BufferedReader in;

    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            out.write("What's your username? \n");
            handler();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void handler() throws IOException {
        //out.write("What's your message? \n");
        in.readLine();
        out.flush();

    }
}

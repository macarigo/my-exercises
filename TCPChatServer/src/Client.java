import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        String hostName = "localHost";
        int portNumber = 8080;

        Socket clientSocket = new Socket(hostName, portNumber);

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String messageFromTheTerminal = in.readLine();
            out.println(messageFromTheTerminal);
        }
    }
}

import java.io.IOException;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        String hostname = "localhost";
        DatagramSocket socket = new DatagramSocket(1000);

        while (true) {
            byte[] sendBuffer = new byte[1024];
            byte[] recvBuffer;
            System.out.println(sendBuffer + " before");

            DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, InetAddress.getByName(hostname), socket.getPort());
            socket.send(sendPacket);
            System.out.println(sendBuffer + " after");

        }
    }
}

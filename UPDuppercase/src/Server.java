import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {

    public static void main(String[] args) throws IOException {

        String hostname = "localhost";

        DatagramSocket datagramSocket = new DatagramSocket(50000);


        while (true) {

            byte[] sendBuffer;
            byte[] recvBuffer = new byte[1024];
            String uppercase;


            DatagramPacket datagramPacket = new DatagramPacket(recvBuffer, recvBuffer.length);

            datagramSocket.receive(datagramPacket);

            uppercase = new String(recvBuffer, 0, datagramPacket.getLength()).toUpperCase();

            sendBuffer = uppercase.getBytes();
            System.out.println(uppercase);

            String stringToCompare = uppercase.replaceAll("\n", "");
            if (stringToCompare.equalsIgnoreCase("BYE")) {
                return;
            }

            datagramSocket.send(new DatagramPacket(sendBuffer, sendBuffer.length, InetAddress.getByName(hostname), datagramPacket.getPort()));

        }

    }

}

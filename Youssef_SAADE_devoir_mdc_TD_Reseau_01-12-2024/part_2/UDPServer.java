import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
        try (DatagramSocket serverSocket = new DatagramSocket(9876)) {
            byte[] receiveBuffer = new byte[1024];
            System.out.println("UDP Server is running...");

            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                serverSocket.receive(receivePacket);

                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received: " + message);

                // Echo the message back to the client
                DatagramPacket sendPacket = new DatagramPacket(
                    message.getBytes(),
                    message.length(),
                    receivePacket.getAddress(),
                    receivePacket.getPort()
                );
                serverSocket.send(sendPacket);

                if (message.equalsIgnoreCase("exit")) {
                    System.out.println("Server shutting down...");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

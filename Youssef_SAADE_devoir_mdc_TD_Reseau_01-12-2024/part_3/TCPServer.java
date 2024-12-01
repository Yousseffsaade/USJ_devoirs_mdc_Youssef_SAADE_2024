import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(6789)) {
            System.out.println("TCP Server is running...");

            while (true) {
                Socket connectionSocket = serverSocket.accept();
                System.out.println("Client connected!");

                BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
                DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());

                int wordCount = 0;
                String line;

                while (!(line = inFromClient.readLine()).equalsIgnoreCase("xxxx")) {
                    wordCount += line.split("\\s+").length;
                }

                outToClient.writeBytes("Total word count: " + wordCount + "\n");
                connectionSocket.close();
                System.out.println("Client disconnected!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

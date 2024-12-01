import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java TCPClient <filename>");
            return;
        }

        try (Socket clientSocket = new Socket("localhost", 6789);
             BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
             DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
             BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            String line;
            while ((line = fileReader.readLine()) != null) {
                outToServer.writeBytes(line + "\n");
            }
            outToServer.writeBytes("xxxx\n");

            String response = inFromServer.readLine();
            System.out.println("Server response: " + response);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

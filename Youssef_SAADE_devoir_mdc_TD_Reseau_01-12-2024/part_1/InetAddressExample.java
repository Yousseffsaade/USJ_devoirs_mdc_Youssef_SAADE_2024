import java.net.InetAddress;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            // Get and print the IP address and hostname of the local machine
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Hostname: " + localHost.getHostName());
            System.out.println("Local IP Address: " + localHost.getHostAddress());

            // Resolve the hostnames provided in the TD
            String[] hostnames = {"titan", "jupiter", "cnn.com"};
            for (String host : hostnames) {
                try {
                    InetAddress[] addresses = InetAddress.getAllByName(host);
                    System.out.println("Results for: " + host);
                    for (InetAddress addr : addresses) {
                        System.out.println("\t" + addr);
                    }
                } catch (Exception e) {
                    System.out.println("Error resolving " + host + ": " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

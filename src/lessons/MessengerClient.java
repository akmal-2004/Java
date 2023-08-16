package lessons;

import java.io.*;
import java.net.*;

public class MessengerClient {
    private String serverAddress;
    private int serverPort;
    private String username;

    public MessengerClient(String serverAddress, int serverPort) {
        this.serverAddress = serverAddress;
        this.serverPort = serverPort;
    }

    public void start() {
        try {
            Socket socket = new Socket(serverAddress, serverPort);

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter your username:");
            username = inputReader.readLine();
            writer.write(username + "\n");
            writer.flush();

            Thread messageReceiver = new Thread(() -> {
                try {
                    String message;
                    while ((message = reader.readLine()) != null) {
                        System.out.println(message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            messageReceiver.start();

            String message;
            while ((message = inputReader.readLine()) != null) {
                writer.write(message + "\n");
                writer.flush();
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MessengerClient client = new MessengerClient("192.168.10.170", 1234);
        client.start();
    }
}

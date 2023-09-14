package lessons.ticktacktoe_sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    static StringBuilder table = new StringBuilder("0123456789");
    static Scanner sc = new Scanner(System.in);

    static void printTable() {
        System.out.println(
                "╔═════════╦═════════╦═════════╗\n" +
                "║         ║         ║         ║\n" +
                "║    "+table.charAt(1)+"    ║    "+table.charAt(2)+"    ║    "+table.charAt(3)+"    ║\n" +
                "║         ║         ║         ║\n" +
                "╠═════════╬═════════╬═════════╣\n" +
                "║         ║         ║         ║\n" +
                "║    "+table.charAt(4)+"    ║    "+table.charAt(5)+"    ║    "+table.charAt(6)+"    ║\n" +
                "║         ║         ║         ║\n" +
                "╠═════════╬═════════╬═════════╣\n" +
                "║         ║         ║         ║\n" +
                "║    "+table.charAt(7)+"    ║    "+table.charAt(8)+"    ║    "+table.charAt(9)+"    ║\n" +
                "║         ║         ║         ║\n" +
                "╚═════════╩═════════╩═════════╝"
        );
    }

    static boolean insert(char index) {
        switch (index) {
            case '1' -> {
                if (table.charAt(1) == index) {
                    table.replace(1, 2, "x");
                    return true;
                }
            }
            case '2' -> {
                if (table.charAt(2) == index) {
                    table.replace(2, 3, "x");
                    return true;
                }
            }
            case '3' -> {
                if (table.charAt(3) == index) {
                    table.replace(3, 4, "x");
                    return true;
                }
            }
            case '4' -> {
                if (table.charAt(4) == index) {
                    table.replace(4, 5, "x");
                    return true;
                }
            }
            case '5' -> {
                if (table.charAt(5) == index) {
                    table.replace(5, 6, "x");
                    return true;
                }
            }
            case '6' -> {
                if (table.charAt(6) == index) {
                    table.replace(6, 7, "x");
                    return true;
                }
            }
            case '7' -> {
                if (table.charAt(7) == index) {
                    table.replace(7, 8, "x");
                    return true;
                }
            }
            case '8' -> {
                if (table.charAt(8) == index) {
                    table.replace(8, 9, "x");
                    return true;
                }
            }
            case '9' -> {
                if (table.charAt(9) == index) {
                    table.replace(9, 10, "x");
                    return true;
                }
            }
        }
        return false;
    }

    static void go() {
        while (true) {
            printTable();
            System.out.println();
            System.out.print("\nEnter value [1-9]: ");
            if (!insert(sc.next().charAt(0)))
                System.out.println("Please enter correct number [1-9]!");
            else break;
        }
    }

    public static void main(String[] args) {
        final int PORT = 5444;

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server is listening on port " + PORT);

            // Wait for a client to connect
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected from: " + clientSocket.getInetAddress().getHostAddress());

            // Create input and output streams for communication
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Create input stream for server input
//            BufferedReader serverInput = new BufferedReader(new InputStreamReader(System.in));

            // Read and send messages
            String clientMessage;
//            String serverMessage;
            while (true) {
                // Read message from server console input
                go();

                // Send server's message to the client
                out.println(table);

                // Read message from client
                clientMessage = in.readLine();
                if (clientMessage == null) {
                    break; // Exit if the client disconnects
                }

                table = new StringBuilder(clientMessage);
            }

            // Clean up
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

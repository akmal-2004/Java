package lessons.triplesender;

public class Sender {
    protected void send(String data) {
        if (data.length() > 0) {
            System.out.println("[+] data sent: " + data);
            System.out.println("[+] data size: " + data.length());
        }
        else
            System.out.println("[-] no data to send!");
    }

    protected void receive(String data) {
        if (data.length() > 0) {
            System.out.println("[+] data received: " + data);
            System.out.println("[+] data size: " + data.length());
        }
        else
            System.out.println("[-] no data received!");
    }
}

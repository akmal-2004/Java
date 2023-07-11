package lessons.homework;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Integer.toBinaryString(2));
        Encode_triple device = new Encode_triple();
        device.encodeSend("akmal");
        device.receiveDecode("000111111000000000000111000111111000111000111111000111111000111111000111000111111000000000000111000111111000111111000000");
    }
}

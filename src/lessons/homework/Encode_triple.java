package lessons.homework;

public class Encode_triple extends Sender {
    private String toBinary (String data) {
        String result = "";
        for (int i = 0; i < data.length(); i ++) {
            String binary = Integer.toBinaryString((int)data.charAt(i));
            while (binary.length() < 8) binary = "0" + binary;
            result += binary;
        }
        return result;
    }

    public void encodeSend(String data) {
        String result = "";
        data = toBinary(data);
        for (int i = 0; i < data.length(); i ++) {
            result += data.charAt(i);
            result += data.charAt(i);
            result += data.charAt(i);
        }
        send(result);
    }

    private String toASCII(String data) {
        String result = "";
        for (int i = 0; i < data.length() - 7; i += 8) {
            String ascii = String.valueOf(data.charAt(i)) + String.valueOf(data.charAt(i + 1)) + String.valueOf(data.charAt(i + 2)) +
                    String.valueOf(data.charAt(i + 3)) + String.valueOf(data.charAt(i + 4)) + String.valueOf(data.charAt(i + 5)) +
                    String.valueOf(data.charAt(i + 6)) + String.valueOf(data.charAt(i + 7));
            result += (char) Integer.parseInt(ascii, 2);
        }
        return result;
    }

    public void receiveDecode(String data) {
        String decoded = "";
        for (int i = 0; i < data.length() - 2; i += 3) {
            if (data.charAt(i) == data.charAt(i + 1) && data.charAt(i) == '1' ||
                    data.charAt(i + 1) == data.charAt(i + 2) && data.charAt(i + 1) == '1' ||
                    data.charAt(i) == data.charAt(i + 2) && data.charAt(i) == '1')
                decoded += "1";
            else
                decoded += "0";
        }
        receive(toASCII(decoded));
    }
}

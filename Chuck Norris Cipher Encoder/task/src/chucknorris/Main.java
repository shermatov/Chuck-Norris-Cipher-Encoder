package chucknorris;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static String getBinaryString(int i) {
        StringBuilder res = new StringBuilder();
        for (int n = i; n > 0; n /= 2) {
            if (n % 2 == 0)
                res.insert(0, "0");
            else
                res.insert(0, "1");
        }
        while (res.length() < 7)
            res.insert(0, "0");
        return res.toString();
    }
    public static String getBinaryString(String s) {
        StringBuilder binary = new StringBuilder();
        for (char c : s.toCharArray()) {
            binary.append(getBinaryString(c));
        }
        return binary.toString();
    }

    public static int lengthOfSeries(String s, int position) {
        char digit = s.charAt(position);
        for (int i = position + 1; i < s.length(); i++) {
            if (s.charAt(i) != digit) {
                return i - position;
            }
        }
        return s.length() - position;
    }

    public static String sequenceOfChars(char c, int length) {
        return String.valueOf(c).repeat(Math.max(0, length));
    }

    public static String getChuckNorrisUnaryCode(String s) {
        String binaryString = getBinaryString(s);
        StringBuilder ret = new StringBuilder();
        int i = 0;
        while (i < binaryString.length()) {
            int length = lengthOfSeries(binaryString, i);
            char c = binaryString.charAt(i);
            if (c == '1')
                ret.append("0 ");
            else
                ret.append("00 ");
            ret.append(sequenceOfChars('0', length));
            ret.append(' ');
            i += length;
        }

        return ret.toString().trim();
    }

    public static String getBinaryFromChuck(String chuck) {
        StringBuilder ret = new StringBuilder();
        String[] chunks = chuck.split(" ");
        for (int i = 0; i < chunks.length; i += 2) {
            if (chunks[i].length() != 1 && chunks[i].length() != 2)
                throw new IllegalArgumentException();
            char digit = chunks[i].length() == 1 ? '1' : '0';
            ret.append(sequenceOfChars(digit, chunks[i+1].length()));
        }
        return ret.toString();
    }

    public static String getStringFromChuck(String chuck) {
        if (!chuck.matches("^[0\\s]*$")) {
            throw new IllegalArgumentException();
        }
        StringBuilder ret = new StringBuilder();
        String binary = getBinaryFromChuck(chuck);
        int i = 0;
        while (i < binary.length()) {
            String block = binary.substring(i, i+7);
            ret.append((char) Integer.parseInt(block, 2));
            i += 7;
        }
        return ret.toString();
    }

    public static void processDecode() {
        System.out.println("Input encoded string:");
        String line = scanner.nextLine();
        try {
            String decoded = getStringFromChuck(line);
            System.out.println("Decoded string:");
            System.out.println(decoded);
        } catch (Exception e) {
            System.out.println("Encoded string is not valid.");
        }
    }

    public static void processEncode() {
        System.out.println("Input string:");
        String line = scanner.nextLine();
        System.out.println("Encoded string:");
        System.out.println(getChuckNorrisUnaryCode(line));
    }

    public static void main(String[] args) {
        System.out.println("Please input operation (encode/decode/exit):");
        String action = scanner.nextLine();
        while (!Objects.equals(action, "exit")) {
            switch (action) {
                case "encode" -> processEncode();
                case "decode" -> processDecode();
                case "exit"   -> {
                    System.out.println("Bye!");
                    return;
                }
                default -> System.out.println("There is no '" + action + "' operation");
            }
            System.out.println("\nPlease input operation (encode/decode/exit):");
            action = scanner.nextLine();
        }
    }
}
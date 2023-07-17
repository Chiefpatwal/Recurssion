import java.util.ArrayList;
import java.util.List;

public class Phonepad {
    public static void main(String[] args) {
        pad("", "23");
        System.out.println(padret("","23"));

    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        if (digit == 7) {
            for (int i = (digit - 2) * 3; i <= (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                pad(p + ch, up.substring(1));
            }
        }
        if (digit == 8) {
            for (int i = ((digit - 2) * 3) + 1; i <= (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                pad(p + ch, up.substring(1));
            }
        }
        if (digit == 9) {
            for (int i = ((digit - 2) * 3) + 1; i <= ((digit - 1) * 3) + 1; i++) {
                char ch = (char) ('a' + i);
                pad(p + ch, up.substring(1));
            }
        }
        if (digit > 1 && digit < 7) {
            for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                pad(p + ch, up.substring(1));
            }

        }
        if (digit == 1) {
            pad(p, up.substring(1));
        }

    }

    static ArrayList<String> padret(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        if (digit == 7) {
            for (int i = (digit - 2) * 3; i <= (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(padret(p + ch, up.substring(1)));
            }
        }
        if (digit == 8) {
            for (int i = ((digit - 2) * 3) + 1; i <= (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(padret(p + ch, up.substring(1)));
            }
        }
        if (digit == 9) {
            for (int i = ((digit - 2) * 3) + 1; i <= ((digit - 1) * 3) + 1; i++) {
                char ch = (char) ('a' + i);
                list.addAll(padret(p + ch, up.substring(1)));
            }
        }
        if (digit > 1 && digit < 7) {
            for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(padret(p + ch, up.substring(1)));

            }
        }
        if (digit == 1) {
                list.addAll(padret(p, up.substring(1)));
            }

        return list;
    }
}

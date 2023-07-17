public class removinga {
    public static void main(String[] args) {
        String org = "thequickfoxjumpedovertheriver";
        System.out.println(remove4(org));


    }

    static void remove(String alt, String org) {
        if (org.isEmpty()) {
            System.out.println(alt);
            return;
        }
        char ch = org.charAt(0);
        if (ch == 'a') {
            remove(alt, org.substring(1));
        } else {
            remove(alt + ch, org.substring(1));
        }

    }

    static String remove1(String org) {
        if (org.isEmpty()) {
            return "";
        }
        char ch = org.charAt(0);
        if (org.startsWith("app") && org.startsWith("apple")) {
            return remove1(org.substring(3));
        } else {
            return org.charAt(0) + remove1(org.substring(1));
        }

    }

    static String remove3(String org) {
        if (org.isEmpty()) {
            return "";
        }

        if (org.startsWith("a")) {
            return remove3(org.substring(1));
        } else {
            return org.charAt(0) + remove3(org.substring(1));

        }
    }
    static String remove4(String org) {
        if (org.isEmpty()) {
            return "";
        }

        if (org.startsWith("a") || org.startsWith("e") || org.startsWith("i") || org.startsWith("o") || org.startsWith("u")) {
            return remove4(org.substring(1));
        } else {
            return org.charAt(0) + remove4(org.substring(1));
//            removing vowels from string

        }
    }
}
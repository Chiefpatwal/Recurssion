import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        System.out.println(listingarr("", "abc"));
    }

    static void subseq(String copi, String org) {
        if (org.isEmpty()) {
            System.out.println(copi);
            return;
        }
        char ch = org.charAt(0);
//there is only two ways to pass the character one is either take it or just ignore the concludes to the desired possibility total possible combinations
        subseq(copi, org.substring(1));
        // the calling order make the storing of the element in the string so ,therefore be cautious whenever calling
        subseq(copi + ch, org.substring(1));
    }

    static ArrayList<String> listing(String anew, String org) {
        if (org.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(anew);
            return list;

        }
        char ch = org.charAt(0);

        ArrayList<String> left = listing(anew + ch, org.substring(1));
        ArrayList<String> right = listing(anew, org.substring(1));
        left.addAll(right);
        return left;
    }

    static void subseqascii(String copi, String org) {
        if (org.isEmpty()) {
            System.out.println(copi);
            return;
        }
        char ch = org.charAt(0);
        subseqascii(copi + ch, org.substring(1));
//there is only two ways to pass the character one is either take it or just ignore the concludes to the desired possibility total possible combinations
        subseqascii(copi, org.substring(1));
        // the calling order make the storing of the element in the string so ,therefore be cautious whenever calling

        subseqascii(copi + (ch + 0), org.substring(1));

    }

    static ArrayList<String> listingarr(String anew, String org) {
        if (org.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(anew);
            return list;

        }
        char ch = org.charAt(0);

        ArrayList<String> left = listingarr(anew + ch, org.substring(1));
        ArrayList<String> right = listingarr(anew, org.substring(1));
        ArrayList<String> middle = listingarr(anew + (ch + 0), org.substring(1));
        left.addAll(right);
        left.addAll(middle);
        return left;
    }
}


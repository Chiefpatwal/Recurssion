public class reversenumber {
    public static void main(String[] args) {
        int number = 731;
        System.out.println(rev(number));
    }

    static int rev(int number){
        if (number == 0) {
            return 0;
        }

        int digit = number % 10;
        int reversedNumber = rev(number / 10);
        int result = (reversedNumber * 10) + digit;

        return result;
    }
}


public class oneton {
    public static void main(String[] args) {
        int n=10;
        onetone(n);
    }
    static void onetone(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        onetone(n-1);
//        System.out.println(n);
    }
}

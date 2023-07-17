public class factorial {
    public static void main(String[] args) {
        int term = 6;
        System.out.println(fact(term));
    }
    static int fact(int n){
        if(n==0 ||n==1){
            return 1;
        }
        return n *fact(--n);
    }
}

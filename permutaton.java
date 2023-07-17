public class permutaton {
    public static void main(String[] args) {
        String org="abcd";
        String copi="";
        permutations(copi,org);
    }
    static void permutations(String copi,String org){
        if(org.isEmpty()){
            System.out.println(copi);
            return;

        }
        char ch =org.charAt(0);
        for(int i=0;i<=copi.length();i++){
            String a=copi.substring(0,i);
            String b=copi.substring(i,copi.length());
            permutations(a+ch+b,org.substring(1));


        }
    }
}

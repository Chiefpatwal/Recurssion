public class DiceMaker {
    public static void main(String[] args) {
        dice("",5);

    }
    static void dice(String co,int num){
        if(num==0){
            System.out.println(co);
            return;
        }
        for(int i=1;i<6&&i<=num;i++){
            dice(co+i,num-i);

        }
    }
}

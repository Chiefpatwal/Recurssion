import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        int c=0;
        int r=arr.length;
        int max=0;
        selection(arr,c,r,max);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr,int c,int r,int max){
        if (r == 0) {
            return;
        }
        if (r > c) {
//            if the max is from the other than max itself than selection sort in terms of max of c
            if(arr[c]>arr[max]){
                selection(arr,c+1,r,c);
//                otherwise the max is max
            }else{
                selection(arr,c+1,r,max);
            }

            } else {
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;

            selection(arr ,r- 1, 0,0);
//i gave the three no set in the error
        }

    }
}

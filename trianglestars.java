import java.util.Arrays;

public class trianglestars {
    public static void main(String[] args) {
        int c = 0;
        int[] arr={1,3,2,1,2,89,6,5};
        int r = arr.length-1;
        bubblesort(arr,r, c);
        System.out.println(Arrays.toString(arr));
//        pattern2(r, c);
    }

    static void pattern(int r, int c) {
        if (r == 0) {
            return;
        }
        if (r > c) {

            pattern(r, c + 1);
            System.out.print("*");
        } else {
            pattern(r - 1, 0);
            System.out.println("space");
        }
    }

    static void bubblesort(int[] arr,int r, int c) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubblesort(arr, r,c + 1);

        } else {
            bubblesort(arr ,r- 1, 0);
//debug whe

        }
    }
}


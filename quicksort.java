import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quick(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }

        int upper = s;
        int lower = e;
        int mid = upper + (lower - upper) / 2;
        int pivot = arr[mid];
        while (upper <= lower) {
            while (arr[upper] < pivot) {
                upper++;
            }
            while (arr[lower] > pivot) {
                lower--;
            }
            if (upper <= lower) {
                int temp = arr[upper];
                arr[upper] = arr[lower];
                arr[lower] = temp;
                upper++;
                lower--;
            }
        }
        quick(arr, s, lower);//the division is now between the 0 to pivot and pivot index to last since pivot is in its place! 
        //after loop lower will be the last element before pivot and will uperr first or second after pivot
        quick(arr, upper, e);
    }
}

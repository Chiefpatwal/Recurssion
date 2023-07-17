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
        quick(arr, s, lower);
        quick(arr, upper, e);
    }
}

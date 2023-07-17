import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int[] arr = {3,1,2,6,5,2};
        int[] result = sort_m(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] sort_m(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        left = sort_m(left);
        right = sort_m(right);
        return merge(left,right);

    }

    static int[] merge(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] result = new int[arr1.length + arr2.length];

        int len1 = arr1.length;
        int len2 = arr2.length;
        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
                k++;
            } else {
                result[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (j < len2) {
            result[k] = arr2[j];
            j++;
            k++;
        }
        while (i < len1) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        return result;
    }
}
//intially i took a spertate two arrays one and two i did recurssion in it through sort_m method and then merge them through the merge method
//in the merge methods i find the merge of these two arrays two in these method find the smaller of the element and then as did it in orfge=

//Returns:copy of the range

//a new array containing the specified range from the original array, truncated or padded with zeros to obtain the required length

//however the finding part of the sort as was not the correct and though is not returning the right arrays
//instead of finding it in teh= main part i did it in recursion part and through left and right arrays
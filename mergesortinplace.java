import java.util.Arrays;

public class mergesortinplace {
    public static void main(String[] args) {
        int[] arr={3,5,1,2,4};
        mergesortin(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergesortin(int[] arr,int s,int e){
        if(e-s==1){
            return;
        }
        int mid=s+(e-s)/2;
        mergesortin(arr,s,mid);
        mergesortin(arr,mid,e);
        merge(arr,s,mid,e);
    }
    static void merge(int[] arr,int s,int m,int e){
    int[] res=new int[e-s];
    int i=s;
    int j=m;
    int k=0;
    while(i<m &&j<e ) {
        if (arr[i] < arr[j]) {
            res[k] = arr[i];
            i++;
        } else {
            res[k] = arr[j];
            j++;
        }
        k++;
    }

        while (j < e) {
            res[k] = arr[j];
            j++;
            k++;
        }
        while (i < m )
        {
            res[k] = arr[i];
            i++;
            k++;
        }
        System.arraycopy(res, 0, arr, s + 0, res.length);


    }

}

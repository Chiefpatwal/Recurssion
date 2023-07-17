import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>> ans=subsetduplicate(arr);
        System.out.println(ans);


    }
    static List<List<Integer>> subsetarr(int[] arr){
        List<List<Integer>> crust= new ArrayList<>();
//        adding a new empty list
        crust.add(new ArrayList<>());
        for(int num :arr){
            int n=crust.size();
            for(int i=0;i<n;i++){
                List<Integer> core=new ArrayList<>(crust.get(i));
                core.add(num);
                crust.add(core);
            }
        }
        return crust;

    }
    static List<List<Integer>> subsetduplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> crust= new ArrayList<>();

//        adding a new empty list
        crust.add(new ArrayList<>());
        int s=0;
        int e=0;
        for(int i=0;i<arr.length;i++){
            s=0;
            if(i>0&&arr[i]==arr[i-1]){
                s=e+1;
            }
            e=crust.size()-1;
            int n=crust.size();
            for(int j=s;j<n;j++){
                List<Integer> core=new ArrayList<>(crust.get(j));
                core.add(arr[i]);
                crust.add(core);
            }
        }
        return crust;

    }
}

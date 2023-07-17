public class binarysearch {
    public static void main(String[] args) {
        int[] arr={1,5,9,10,15,18};
        int target=110;
        System.out.println(binarysearch(arr,target,0,arr.length-1));
    }
    static int binarysearch(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            return binarysearch(arr,target,mid+1,end);
        }else{
            return binarysearch(arr,target,start,mid-1);
        }
    }
}

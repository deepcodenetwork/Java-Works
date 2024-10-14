public class recurIsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr));
    }
    static boolean isSorted(int[] arr){
        return helper(0,arr);
    }
    static boolean helper(int i,int[] arr){
        if(i==arr.length-1){return true;}
        if(arr[i]<=arr[i+1]){return helper(i+1,arr);}
        return false;
    }
}

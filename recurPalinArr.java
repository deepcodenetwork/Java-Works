public class recurPalinArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,3, 2, 1};             //Or can take String and do using str.charAt()
        System.out.println(palindrome(arr));
    }
    static boolean palindrome(int[] arr){
        return palin(arr,0,arr.length-1);
    }
    static boolean palin(int[] arr,int s,int e){
        if(e-s<=0){return true;}
        if(arr[s]==arr[e]){return palin(arr,s+1,e-1);}
        else {return false;}
    }
}

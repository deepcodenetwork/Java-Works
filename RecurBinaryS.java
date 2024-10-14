public class RecurBinaryS {
    public static void main(String[] args) {
        int tar=56;
        int[] arr={34,45,47,55,68,78,89};
        System.out.println(bS(arr,tar));
    }
    static int bS(int[] arr,int tar){return bSearch(0,arr.length-1,arr,tar);}
    
    static int bSearch(int s,int e,int[] arr,int tar){
        if(s>e){return -1;}
        
        int m=s+(e-s)/2;
        if(tar==arr[m]){return m;}
        if(tar>arr[m]){return bSearch(m+1,e,arr,tar);}
        return bSearch(s,m-1,arr,tar);
    }
}
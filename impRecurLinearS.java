// 1)
// Very IMP ans below
//Saving results of ocurrance in ArrayList without giving in parameter
//ArrayList made inside the recursive function
import java.util.ArrayList;

public class impRecurLinearS {
    public static void main(String[] args) {
        int[] arr = { 34, 29, 11, 43, 11, 55 };
        int tar = 11;
        System.out.println(lin(arr, tar));
    }
    static ArrayList<Integer> lin(int[] arr, int tar) {
        return helper(arr, tar, 0);
    }
    static ArrayList<Integer> helper(int[] arr, int tar, int i) {
        ArrayList<Integer> al = new ArrayList<Integer>();         //new func call made new arraylist
        if (i == arr.length) {return al;}
        if (tar == arr[i]) {al.add(i);}
                                                                       //Or if not want to add if list is empty for optimisation then do following
        al.addAll(helper(arr, tar, i + 1));                            //if(!al.isEmpty()){al.addAll(helper(arr, tar, i + 1));}
                                                                       //else{return helper(arr, tar, i + 1);}

        return al;
    }
}

// 2)
//Saving results of ocurrance in ArrayList using parameter
//ArrayList made outside the recursive function
/*
import java.util.ArrayList;

public class recurLinearS {
    public static void main(String[] args) {
        int[] arr = { 34, 29, 11, 43, 11, 55 };
        int tar = 11;
        System.out.println(lin(arr, tar));
    }

    static ArrayList<Integer> lin(int[] arr, int tar) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        return helper(arr, tar, 0, al);
    }

    static ArrayList<Integer> helper(int[] arr, int tar, int i, ArrayList<Integer> al) {
        if (i == arr.length) {
            return al;
        }
        if (tar == arr[i]) {
            al.add(i);
        }
        return helper(arr, tar, i + 1, al);
    }
}
 */

// 3)
/*
 * Linear Search
 * public class recurLinearS {
 * public static void main(String[] args) {
 * int[] arr = {34, 29, 11, 43, 55};
 * int tar= 11;
 * System.out.println(lin(arr,tar));
 * }
 * static int lin(int[] arr,int tar){
 * return helper(arr,tar,0);
 * }
 * static int helper(int[] arr,int tar,int i){
 * if(i==arr.length){return -1;}
 * if(tar==arr[i]){return i;}
 * return helper(arr,tar,i+1);
 * }
 * }
 */
// Imp     both (  1)using and 2)without using ) pivot are imp
// 2) is more efficient
public class impRecurRotatedBS {

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        // 1)by finding pivot
        System.out.println(Bsearch1(arr, 7));
        // 2)by not finding pivot
        System.out.println(Bsearch2(arr, 7)); //
    }

    // 1)
    static int Bsearch1(int[] arr, int tar) {
        int pivot = 4; // find pivot and pass value. Here 4,acc to Q
        return search1(arr, tar, pivot);
    }

    static int search1(int[] arr, int tar, int p) { // Imp function
        if (tar > arr[arr.length - 1]) {
            if (p > 0) {
                int a = bSearch(0, p - 1, arr, tar);
                if (a != -1) {
                    return a;
                }
            }
        } else {
            return bSearch(p, arr.length - 1, arr, tar);
        }
        return -1;
    }

    static int bSearch(int s, int e, int[] arr, int tar) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;
        if (tar == arr[m]) {
            return m;
        }
        if (tar > arr[m]) {
            return bSearch(m + 1, e, arr, tar);
        }
        return bSearch(s, m - 1, arr, tar);
    }

    // 2)
    static int Bsearch2(int[] arr, int tar) {
        return search2(arr, tar, 0, arr.length - 1);
    }

    static int search2(int[] arr, int tar, int s, int e) { // Imp function
        if (s > e) {
            return -1;
        }
        int m = s + (e - s / 2);

        if (tar == arr[m]) {
            return m;
        }
        if (arr[m] >= arr[s]) {
            if (tar <= arr[m]) {
                return search2(arr, tar, s, m - 1);
            } else {
                return search2(arr, tar, m + 1, e);
            }
        }

        if (tar >= arr[m] && tar <= arr[e]) {
            return search2(arr, tar, m + 1, e);
        } // This is under if(arr[m]<=arr[e]){}
        else {
            return search2(arr, tar, s, m - 1);
        }
    }
}

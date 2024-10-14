public class recurFacto {
    public static void main(String[] args) {
        int n=9;
        System.out.println(facto(n));
    }
    static int facto(int n){
        if(n<=1){return 1;}
        return n*facto(n-1);
    }
}

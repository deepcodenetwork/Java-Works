public class recurRevNum {
    public static void main(String[] args) {
        int n=12345;
        System.out.println(reverse(n));
    }
    static int reverse(int n){
        int len=String.valueOf(n).length();
        return rev(n,5);
    }
    static int rev(int n,int len){
        if(n<=0){return 0;}
        return (n%10)* (int)Math.pow(10,len-1) + rev(n/10,len-1);
    }
}

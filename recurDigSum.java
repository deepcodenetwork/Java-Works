public class recurDigSum {
    public static void main(String[] args) {
        int n=12345;
        System.out.println(digSum(n));
    }
    static int digSum(int n){
        if(n<=0){return 0;}
        return (n%10)+ digSum(n/10);
    }
}

public class RecurFibo {
    public static void main(String[] args) {
        int nth=10;
        System.out.println(fibo(nth-1)); 
    }
    static int fibo(int n){
        if(n<2){return n;}
        return fibo(n-1)+fibo(n-2);
    }
}

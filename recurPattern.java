public class recurPattern {
    public static void main(String[] args) {
        pattern1(4,0);
        System.out.println("");

        pattern2_1(4,0);                   //good
        System.out.println("\n");
        //OR
        pattern2_2(0,0);                   //dont't use
    }
    static void pattern1(int r,int c){
        if(r<=0){return;}
        if(c<r){
            System.out.print("*");
            pattern1(r,c+1);
        }
        else{
            System.out.println("");
            pattern1(r-1,0);
        }
    }
    static void pattern2_1(int r,int c){
        if(r<=0){return;}
        if(c<r){
            pattern2_1(r,c+1);
            System.out.print("*");
        }
        else{
            pattern2_1(r-1,0);
            System.out.println("");
        }
    }
    //OR
    static void pattern2_2(int r,int c){
        if(r>=4){return;}
        if(c<=r){
            System.out.print("*");
            pattern2_2(r,c+1);
        }
        else{
            System.out.println("");
            pattern2_2(r+1,0);
        }
    }
}
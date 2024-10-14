class recurRemoveA{
    public static void main(String[] args) {
        String str = "In Any Feild,Haste makes Waste";
        System.out.println(removeA(str));
    }
    static String removeA(String str){
        //return remA(str,"",0);   // normal 1 nStr in parameter
        //return remA1(str,"",0);  // normal 2 nStr in parameter
        return remA2(str,0);     // nStr declared inside & remove one parameter
    }
    static String remA(String str,String nStr,int i){
        if(i>str.length()-1){return nStr;}
        char n=str.charAt(i);
        if(n!='a' && n!='A'){nStr+=n;}
        return remA(str,nStr,i+1);
    }
    static String remA1(String str,String nStr,int i){
        if(i>str.length()-1){return "";}
        char n=str.charAt(i);
        if(n!='a' && n!='A'){return nStr+n+remA1(str,nStr,i+1);}
        return nStr+remA1(str,nStr,i+1);
    }
    static String remA2(String str,int i){
        String nStr="";
        if(i>str.length()-1){return "";}
        char n=str.charAt(i);
        if(n!='a' && n!='A'){return nStr+n+remA2(str,i+1);}
        else{return nStr+remA2(str,i+1);}
    }
}
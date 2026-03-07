package Recursion;

public class PeintNo {
    static void printnumber(int n,int limit){
        if(n>limit){
            return;
        }
        System.out.println(n);
        printnumber(n+1,limit);
    }
    public static void main(String[] args) {
        printnumber(1,7);
    }
    
}

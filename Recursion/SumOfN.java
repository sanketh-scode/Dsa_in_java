package Recursion;

public class SumOfN {
    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        return n+Sum(n-1);
    }
    public static void main(String[] args) {
      System.out.println("Sum of N number is: "+Sum(5));
    }
    
}

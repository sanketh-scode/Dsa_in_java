package Recursion;

public class SumOfN {
    public static void Sum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println("Sum: "+sum);
            return;
        }
        sum+=i;
        Sum(i+1, n, sum);
    }
    public static void main(String[] args) {
      Sum(1,5,0);
    }
    
}

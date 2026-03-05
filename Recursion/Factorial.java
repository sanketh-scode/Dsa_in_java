package Recursion;

public class Factorial {
    public static int Fact(int n){
        if(n < 0){
    System.out.println("Invalid input");
        } 
        if(n==1||n==0){
            return 1;
        }
        return n*Fact(n-1);

    }
    public static void main(String[] args) {
        int n=9;
        System.out.println("Factorial of number " +n+ " is: "+Fact(n));
    }
    
}

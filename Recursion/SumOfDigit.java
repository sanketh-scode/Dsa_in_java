package Recursion;
public class SumOfDigit {
    static int adddigit(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+adddigit(n/10);

    }
    public static void main(String[] args) {
        System.out.println(adddigit(123));
    }
    
}

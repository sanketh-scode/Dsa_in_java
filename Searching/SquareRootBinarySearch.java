package Searching;

public class SquareRootBinarySearch {
    static int squareRoot(int n){
        int start=1;
        int end=n;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid<n){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        return end;
    }
    public static void main(String[] args) {
        int n=16;
        System.out.println("sqare root of number "+n+" is: "+squareRoot(n));
    }
    
}

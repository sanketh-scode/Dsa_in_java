//program for print number from 1 to n
package Recursion;
class PrintNum{
    static void printnumber(int i,int n){
        if(i>n){        //if we want to print n to i then the base case is if(i==0)
            return;
        }
        System.out.println(i);
        printnumber(i+1, n);//if we want to print n to i then the recursive case is printnumber(i-1)
    }
    public static void main(String[] args) {
        printnumber(1, 5);//if we want to print n to i then here we use printnumber(i=5,n=5)
}
}
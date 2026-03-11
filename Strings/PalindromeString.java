package Strings;

public class PalindromeString {
    static boolean palindrome(String s){
        int start=0;
        int end=s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="amma";
        boolean result=palindrome(s);
        if(result){
            System.out.println("given string is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
    
}

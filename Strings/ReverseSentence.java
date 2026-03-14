package Strings;
public class ReverseSentence {
    static void reverse(String s){
        StringBuilder sb=new StringBuilder();
        String arr[]=s.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]+" ");

        }
        System.out.println("reverse String is: "+sb);
    }
    public static void main(String[] args) {
        String s="hello i am sanketh";
        reverse(s);
    }
}

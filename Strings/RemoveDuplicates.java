package Strings;
public class RemoveDuplicates {
    static void removeDuplicates(String s){
        StringBuilder sb= new StringBuilder();
        boolean []visited=new boolean[256];
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!visited[ch]){
                sb.append(ch);
                visited[ch]=true;
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String s="programminglanguage";
        removeDuplicates(s);
    }    
}

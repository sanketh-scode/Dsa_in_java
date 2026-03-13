package Strings;
public class AnagramCheck {
    static boolean anagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int freq[]=new int[26];
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            freq[ch-'a']++;   
        }   
          for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            freq[ch-'a']--;      
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
        
        

    }
    public static void main(String[] args) {
        String s1="hmllo";
        String s2="ollhe";
        boolean result=anagram(s1, s2);
        if(result){
            System.out.println("Strings are anagram");
        }  
        else{
            System.out.println("Strings are not anagram");
        }
    }
    
}

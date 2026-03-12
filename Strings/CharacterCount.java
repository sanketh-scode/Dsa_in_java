package Strings;

public class CharacterCount {
    static void characterCount(String s){
        for(int i=0;i<s.length();i++){
            int count=0;
            boolean alreadycount=false;
            for(int k=0;k<i;k++){
                if(s.charAt(i)==s.charAt(k)){
                    alreadycount=true;
                    break;
                }
            }
            if(alreadycount){
                continue;
            }
            for(int j=0;j<s.length();j++){           
            if(s.charAt(i)==s.charAt(j)){
                count++;
               
            }
        }
         System.out.println(s.charAt(i)+"--->"+count);


    }
    
} 
public static void main(String[] args) {
    String s="hello";
    characterCount(s);
}
}

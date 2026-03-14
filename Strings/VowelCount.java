package Strings;
public class VowelCount {
    static void vowelCount(String s){
        int count=0;
        String vowels="aeiou";
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<vowels.length();j++)
            if(s.charAt(i)==vowels.charAt(j))
                count++;
        }
        System.out.println("Vowel count ="+count);
    }
    public static void main(String[] args) {
        String s="AeioU";
        vowelCount(s);

    }
}

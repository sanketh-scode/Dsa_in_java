package HashMap;
import java.util.HashMap;

public class FirstNonRep {
    public static void main(String[] args) {
        String s="swssi";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
//             for(char key : map.keySet()){
//                 if(map.get(key)==1){
//     System.out.println(key + " -> " + map.get(key));
//     break;
//                 }
// }
for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);
    if(map.get(ch)==1){
        System.out.println(ch + " -> " + map.get(ch));
        break;
    }
}
        }
        
    }
    


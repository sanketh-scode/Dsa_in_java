package HashMap;
import java.util.HashMap;
public class Frequencyofelement {
    public static void main(String[] args) {
       int arr[]={1,2,2,2,3,1,3,3};
       HashMap<Integer,Integer> e=new HashMap<>();
    
       for(int num:arr){
        if(e.containsKey(num))
        e.put(num,e.get(num)+1);
    else{
        e.put(num,1 );
    }
       }
       System.out.println(e);

    }
    
}

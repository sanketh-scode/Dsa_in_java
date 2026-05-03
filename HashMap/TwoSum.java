
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int num[]={1,2,3,4,5};
        int targate=7;
        for(int i=0;i<num.length;i++){
            int deff=targate-num[i];
            if(map.containsKey(deff)){
                System.out.println("{"+map.get(deff)+","+i+"}");
            }
            else{
                map.put(num[i],i);
            }
        }
    }
    
}

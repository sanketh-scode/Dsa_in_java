
import java.util.HashSet;
import java.util.ArrayList;

public class Duplicate {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();
        int arr[]={1,2,2,2,2,4,3,3};
        for (int num:arr){
            if(set.contains(num) && !list.contains(num)){
                list.add(num);
            }
            else{
                set.add(num);
            }
        }
        System.out.println("the duplicate element is "+list);
    }
    
}

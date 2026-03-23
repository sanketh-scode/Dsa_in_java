package Stack;

import java.util.ArrayList;

public class StackBasic {
   static ArrayList<Integer> stack=new ArrayList<>();
    public static boolean isEmpty(){
       return stack.size()==0;

    }
    static void push(int data){
        stack.add(data);
    }
    static int pop(){
        if(isEmpty()){
            return -1;
        }
       int top=  stack.get(stack.size()-1);
         stack.remove(stack.size()-1);
         return top;
    }

    static int peek(){
         if(isEmpty()){
            return -1;
        }
       int peek=stack.get(stack.size()-1);
       return peek;
    }
public static void main(String[] args) {
    push(10);
    push(19);
    push(1);
    while(!isEmpty()){
    System.out.println("peek element is "+peek());
    pop();
    }


}
    
}

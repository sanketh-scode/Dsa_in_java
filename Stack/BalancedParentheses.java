package Stack;

import java.util.Stack;

public class BalancedParentheses {
    static boolean checkvalid(String s){
    Stack<Character> stack=new Stack<>();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='('||ch=='{'||ch=='['){
            stack.push(ch);
        }
        else if(ch==')'||ch=='}'||ch==']'){
            if(stack.isEmpty()){
                return false;
            }
            char top=stack.peek();
            if((ch==')' &&top!='(')||( ch=='}' &&top!='{')|| (ch==']' &&top!='[')){   
            return false;
            }
            stack.pop();
        }
        else{
            continue;
        }
    }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s="a+b-c*(a+b)-}";
        boolean check=checkvalid(s);
        if(check){
            System.out.println("true");
        }else
        {
            System.out.println("false");
        }
    }

    
}

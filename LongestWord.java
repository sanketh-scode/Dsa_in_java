public class LongestWord {
    static String longest(String s){
        String arr[]=s.split(" ");
        String biggest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>biggest.length()){
                biggest=arr[i];
            }

        }
        return biggest;
    }
    public static void main(String[] args) {
        String s="hello my name is sanketh";
        System.out.println("LONGEST WORD IS: "+longest(s));

    }
    
}

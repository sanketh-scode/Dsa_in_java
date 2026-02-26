public class CountEvenorOdd {
    static int[] EvenorOdd(int arr[]){
        int n=arr.length;
        int Ceven=0;
        int Codd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                Ceven++;
            }else{
                Codd++;
            }

        }
        return new int[] {Ceven,Codd};
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,1,7,8,6};
        int ans[]=EvenorOdd(arr);
        System.out.println(ans[0]+" "+ans[1]);
    }
    
}

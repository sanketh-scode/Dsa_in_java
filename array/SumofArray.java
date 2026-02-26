public class SumofArray {
    static int sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,2,3};
        System.out.println("sum of the array element is: "+sum(arr));
    }
    
}

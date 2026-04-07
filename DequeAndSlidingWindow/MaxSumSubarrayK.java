package DequeAndSlidingWindow;

public class MaxSumSubarrayK {
    static int maxSum(int arr[],int k,int n){
        if(n<=k){
            System.out.println("Not a proper input for this problem");
            return -1;
        }
        //finding first k subarra
        int max_sum=0;
        for(int i=0;i<k;i++){
            max_sum+=arr[i];
        }
        //calculate maxsum in array by moving window
        int currentsum=max_sum;
        for(int i=k;i<n;i++){
             currentsum+=arr[i]-arr[i-k];
            max_sum=Math.max(currentsum,max_sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int arr[]={5,2,-1,0,3};
        int n=arr.length;
        int k=3;
        int result=maxSum(arr, k, n);
        System.out.println("maximum sum for "+ k+"th sub array is"+result);
    }
    
}

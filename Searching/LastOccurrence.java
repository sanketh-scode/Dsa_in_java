package Searching;

public class LastOccurrence {
    static int lastOccurrence(int arr[],int x){
        int start=0;
        int end=arr.length-1;
        int last=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(x==arr[mid]){
                last=mid;
                start=mid+1;
            }
            else if(x>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,6,7};
        int x=5;
        System.out.println("last occurrence of "+x+" is "+lastOccurrence(arr, x));
    }
    
}

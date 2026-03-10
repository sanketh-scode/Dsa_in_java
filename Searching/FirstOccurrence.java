 package Searching;

public class  FirstOccurrence {
    static int firstOccurrence(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int first=-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(x==arr[mid]){
                first=mid;
                high=mid-1;
            }
            else if(x>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

            
        }
        return first;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,2,2,2,3,4,5};
        int x=2;
        System.out.println("first occurrence is: "+firstOccurrence(arr, x));

    }
}

package Searching;

public class SearchInsertPosition {
    static int searchInsertPosition(int arr[],int x){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(x==arr[mid]){
                return mid;
            }
             if(x>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};
        int x=4;
      System.out.println("Insert position of " + x + " is " + searchInsertPosition(arr, x));
    }
    

    
}

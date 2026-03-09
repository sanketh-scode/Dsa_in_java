package Searching;

public class BinarySearchRecursive {
    static int search(int arr[],int low,int high,int x){
        if(high>=low){
        int mid=low+(high-low)/2;

        if(arr[mid]==x){
            return mid;
        }
        if(arr[mid]<x){
           return search(arr, mid+1, high, x);
        }else{
            return search(arr, low, mid-1, x);
        }
    }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int x=5;
        int result=search(arr, 0, arr.length-1, x);
        if(result==-1){
            System.out.println("searching element is not found");

        }else{
            System.out.println("searching element "+x+" is found at position "+result);
        }
    }
}
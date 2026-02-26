public class ReverseArray{
    public static void reverse(int arr[]){
        int l=0;
        int r=arr.length-1;
        
        while (r>l) {
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
            
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,4,6,7};
        reverse(arr);
        System.out.println("revesed array elements are: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
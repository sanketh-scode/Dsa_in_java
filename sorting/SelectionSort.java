package sorting;

public class SelectionSort {
    public static void sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int smalest=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[smalest]){
                    smalest=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smalest];
            arr[smalest]=temp;
        }
        System.out.println("sorted elements are ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={4,2,8,6,1,0};
        sort(arr);
    }
    
}

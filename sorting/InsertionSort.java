package sorting;
class InsertionSort{
    static void sort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int current=arr[i];
            int j=i-1;
            while (j>=0 && current>arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){

            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,3,7,2};
        sort(arr);
    }
}
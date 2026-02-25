public class LinearSearch {
    public static int search(int arr[],int n,int ele){
        for(int i=0;i<n;i++){
            if(arr[i]==ele){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={2,7,54,4,21,8,56};
        int ele=4;
       int result=search(arr, arr.length, ele);
        if(result==-1)
        System.out.println("searching element is not found:");
    else{
        System.out.println("searching elemnt is found at position:"+result);
    }

    }
}

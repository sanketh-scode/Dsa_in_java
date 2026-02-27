public class Largest {
    public static int largest(int arr[][]){
        int row=arr.length;
        int col=arr[0].length;
        int large=arr[0][0];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]>large){
                    large=arr[i][j];
                }
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{2,3,4},{10,11,5}};
        System.out.println("Largest Element in the Array is: "+largest(arr));
    }

    
}

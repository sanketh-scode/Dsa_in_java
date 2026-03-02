public class RowSum{
    static void Rowsum(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        int sum;
     for(int i=0;i<m;i++){
        sum=0;
        for(int j=0;j<n;j++){
            sum+=arr[i][j];
        }
        System.out.println(sum);
     } 
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},{4,5,6,7},{8,9,2,3},{1,5,2,4}};
        Rowsum(arr);
    }

}
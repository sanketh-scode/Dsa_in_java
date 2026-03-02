public class ColumSum {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{4,5,6,7},{5,6,3,2}};
        int m=arr.length;
        int n=arr[0].length;
        int sum;
        for(int j=0;j<n;j++){
            sum=0;
            for(int i=0;i<m;i++){
                sum+=arr[i][j];
            }
            System.out.println(sum);
        }
    }
    
}

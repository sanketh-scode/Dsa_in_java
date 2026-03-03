public class Boundary {
     static void BoundaryTraversal(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        int sum=0;
        if(m != n){
            System.out.println("Not a square matrix");
            return;
        }
       for(int j=0;j<n;j++){
        System.out.print(arr[0][j]+" ");
       }
       for(int i=1;i<m;i++){
        System.out.print(arr[i][n-1]+" ");
       }
       for(int j=n-2;j>=0;j--){
        System.out.print(arr[m-1][j]+" ");
       }
       for(int i=m-2;i>=1;i--){
        System.out.print(arr[i][0]+" ");
       }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        BoundaryTraversal(arr);
    }
    
}

    

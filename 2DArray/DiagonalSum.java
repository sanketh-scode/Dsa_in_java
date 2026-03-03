class DiagonalSum{
    static void Diagonalsum(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        int sum=0;
        if(m != n){
            System.out.println("Not a square matrix");
            return;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("Diagonal sum= "+sum);
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        Diagonalsum(arr);
    }
}
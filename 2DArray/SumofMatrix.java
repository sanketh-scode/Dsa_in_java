
import java.util.*;
 class SumofMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
        System.out.print("Enter the number of rows: ");
        int row=sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter the elements of matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }

        }
        int sum=0;

    for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum+=arr[i][j];
                
            }
           
        }
        System.out.println("Sum of Matrix Elemnt is : "+sum);
        sc.close();



    }
    
    
}

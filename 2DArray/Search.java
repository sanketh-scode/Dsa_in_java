public class Search {
    public static int[] search(int arr[][],int x){
        int row=arr.length;
        int col=arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==x){
                 return new int[]{i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,7,5},{8,0,9}};
        int found[]=search(arr, 4);
        if(found!=null){
            System.out.println("Element found at position: ("+found[0]+","+found[1]+")");
        }
        else{
            System.out.println("Element not found");
        }
    }
    
    
}

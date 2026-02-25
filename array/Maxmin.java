public class Maxmin {
    public void Max_Min(int arr[],int n){
        int max=arr[0];
        int min=arr[0];
        int current=0;
        for(int i=0;i<n;i++){
            current=arr[i];
            if(current>max){
                max=current;
            }else if(current<min){
                min=current;
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
    public static void main(String[] args) {
        Maxmin m=new Maxmin();
        int arr[]={2,4,8,6,7};
        m.Max_Min(arr, arr.length);
 

    }
}

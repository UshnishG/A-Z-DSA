//time complexity : O(n^2)
public class bubblesortcode {
    public static void bubblesort(int arr[]){
        for(int turn=0;turn<arr.length-1; turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }    
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,3,5,4,6,1,2,9,8};
        bubblesort(arr);
        printarr(arr);
        
    }
    
}

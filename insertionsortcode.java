public class insertionsortcode {

    public static void insertionsort(int arr[]){
       int n = arr.length;
       for (int i = 1; i < n; i++) {
           int curr = arr[i];
           int prev = i - 1;
           while (prev >= 0 && arr[prev] > curr) {
               arr[prev + 1] = arr[prev];
               prev--;
           }
           arr[prev + 1] = curr;
       }
    }
    
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,1};
        insertionsort(arr);
        printarr(arr);
        
    }
}

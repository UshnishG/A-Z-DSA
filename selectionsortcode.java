public class selectionsortcode {

    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minimumposition = i;
            for(int j = i+1;j<arr.length-1;j++){
                if(arr[minimumposition]<arr[j]){
                    minimumposition=j;
                }
            }
            int temp = arr[minimumposition];
            arr[minimumposition] = arr[i];
            arr[i] = temp;
        }

    }
    
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,4,6,1,2,9,8};
        selectionsort(arr);
        printarr(arr);
        
    }
}

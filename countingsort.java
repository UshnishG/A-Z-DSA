public class countingsort {

    public static void counting1sort(int arr[]){
       int n = arr.length;
       int largest = Integer.MIN_VALUE;
       for (int i = 1; i < n; i++) {
            largest = Math.max(largest,arr[i]);
       }
       int count[] = new int[largest+1];
       for(int i=0;i<n;i++){
        count[arr[i]]++;
       }
       int j=0;
       for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
       }
    }
    
    public static void printarr(int count[]){
        for(int i=0;i<count.length;i++){
            System.out.print(count[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,1};
        counting1sort(arr);
        printarr(arr);
        
    }
}

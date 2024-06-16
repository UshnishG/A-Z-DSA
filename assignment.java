public class assignment {
    public static boolean duplicate(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,1};
        System.out.println("ANs is: " + duplicate(arr));
    }
}
//Time Complexity: O(n)
public class linearsearch {
    public static int linearsearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[]={2,3,4,10,40,50,60,70,80,90,100,120,130,140,150,160,170,180,190,200};
        int key=100;
        int result=linearsearch(arr,key);
        if(result==-1){
            System.out.println("Element is not present in array");
        }
        else{
            System.out.println("Element is present at index: "+result);
        }
    }
    
}

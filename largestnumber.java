//Time Complexity: O(n)
public class largestnumber{
    public static int largest(int num[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max = num[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int num[] = {2,3,4,10,40,50,60,70,80,90,100,120,130,140,150,160,170,180,190,200};
        int result = largest(num);
        System.out.println("Largest number in the array is: "+result);
    }
}
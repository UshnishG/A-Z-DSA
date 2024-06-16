public class subarray {
    public static void printsubarray(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(num[k]+" ");
                }
                System.out.println();
            }
        }
        System.out.println("Finished Printing all the subarrays.");
    }
//Time complexity: O(n)   KADANES ALGORITHM
    public static void kadanes(int num[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            currsum = currsum + num[i];
            if(currsum<0){
                currsum = 0;
            }
            maxsum = Math.max(maxsum,currsum);
     }
        System.out.println(maxsum);
    }
    
//Time complexity: O(n^2)   PREFIX SUM APPROACH
    public static void prefixarray(int num[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefixsum[] = new int[num.length];
        
        prefixsum[0] = num[0];
        for(int i = 1; i < prefixsum.length; i++) {
            prefixsum[i] = prefixsum[i - 1] + num[i];
        }
        
        for(int i = 0; i < num.length; i++) {
            for(int j = i; j < num.length; j++) {
                if (i == 0) {
                    currsum = prefixsum[j];
                } else {
                    currsum = prefixsum[j] - prefixsum[i - 1];
                }
                if(currsum > maxsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println(maxsum);
    }
    
//Time complexity: O(n^3)   BRUTE FORCE
    public static void bruteforce(int num[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                currsum = 0;
                for(int k=i;k<=j;k++){
                    currsum = currsum + num[k];
                }
                if(currsum>maxsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println(maxsum);
    }

    public static void main(String args[]){
        int num[] = {1,-2,6,-1,3};
        //printsubarray(num);
        kadanes(num);           //Time complexity: O(n)
        prefixarray(num);       //Time complexity: O(n^2)
        bruteforce(num);        //Time complexity: O(n^3)
    }
}

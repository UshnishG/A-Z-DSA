import java.util.Scanner;
//Time Complexity : O(n)
public class trapppingrainwater {

    public static int trappedrainwater(int arr[], int width){
        int n = arr.length;
        //find left max boundary
        int leftmax[]=new int[n];
        leftmax[0] = arr[0];
        for(int i=1;i<n;i++)
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        
        //find right max boundary
        int rightmax[] = new int[n];
        rightmax[n-1] = arr[n-1];
        for(int i = n-2; i>=0;i--)
            rightmax[i] = Math.max(arr[i], rightmax[i+1]);

        //loop
        int trap=0;
        for(int i=0;i<n;i++){
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            trap+=(waterlevel-arr[i])*width;
        }
        return trap; 
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the size of the array: ");
                int size = scanner.nextInt();
                System.out.print("Enter Width of bars: ");
                int width = scanner.nextInt();
                int[] arr = new int[size];
                System.out.println("Enter the elements of the array:");
                for (int i = 0; i < size; i++) {
                    arr[i] = scanner.nextInt();
                }
                System.out.println("Trapped Water is : "+ trappedrainwater(arr, width));
            }
    




        }




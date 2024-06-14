public class revarray {
    public static void reverse(int num[]){
        int first = 0, last = num.length -1;
        while(first<last){
            int temp = num[last];
            num[last]= num[first];
            num[first]=temp;

            first++;
            last--; 
        }
    }
    public static void main(String args[]){
        int num[] = {2,3,4,10,40,50,60,70,80,90,100,120,130,140,150,160,170,180,190,200};
        reverse(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    
}

import java.util.*;
public class palindrome{
    public static void pal(String name){
        String revName = "";
        for(int i=name.length()-1;i>=0;i--){
            revName = revName + name.charAt(i);
            System.out.println(revName);
        }
        System.out.println(revName);
        if(revName.equals(name)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Non Palindrome");
        }
    }
    public static void main(String args[]){
        String name = "racecar";
        pal(name);
    }
}
import java.util.*;
public class PalindromeNumbers {
    public static int palindrome(int n){
        String binary=(Integer.toString(n));
        int start=binary.charAt(0);
        int end=binary.charAt(binary.length()-1);
        while(start<end){
            if(start==end){
                start++;
                end--;
            }
            else{
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(palindrome(n));
    }
    
}

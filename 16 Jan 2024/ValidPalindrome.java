import java.util.*;
public class ValidPalindrome{
    public static void main(String[] args){
        String str=" ";
        System.out.println(palindrome(str));
    }
    public static boolean palindrome(String str){
        int start=0;
        int end=str.length()-1;
        while(start<=end){
            char x=str.charAt(start);
            char y=str.charAt(end);
            if(!Character.isLetterOrDigit(x)){
                start++;
                continue;
            }
            if(!Character.isLetterOrDigit(y)){
                end--;
                continue;
            }
            if(Character.toLowerCase(x)!=Character.toLowerCase(y))
                return false;
            start++;
            end--;
        }
        return true;

    }
}
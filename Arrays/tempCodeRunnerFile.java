import java.util.*;
public class LargestOddNumberInString{
    public static String largest(String str){
        String s="";
       for(int i=str.length()-1;i>=0;i--){
           if(Integer.valueOf(str.charAt(i))%2!=0){
           s=str.substring(0,i+1);
           break;
           

       }
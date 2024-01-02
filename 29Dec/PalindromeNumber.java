import java.util.*;

class PalindromeNumber{
public static void main(String[] args){
    int n=121;
    System.out.println(pal(n));

}
public static boolean pal(int n){
    int temp=n;
    int sum=0;
    while(n!=0){
        int rem=n%10;
        sum=(sum*10)+rem;
        n=n/10;

    }
    return (temp==sum);
   }
}
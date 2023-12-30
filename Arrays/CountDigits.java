import java.util.*;
public class CountDigits {
    public static int count(int n){
        int c=0;
        int temp=n;
        while(temp>0){
            if(n%(temp%10)==0)
            c++;
            temp=temp/10;
        }


        return c;
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(count(n));
    }
}

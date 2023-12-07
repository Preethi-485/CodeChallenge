import java.util.*;
public class ClumpsyFactorial{
    public static int fact(int n){
        if(n==4)
        return 7;
        else if(n==1||n==0)
        return 1;
        else if(n==2)
        return 2;
        else if(n==3)
        return 6;
        else if(n%4==1 || n%4==2)
        return n+2;
        else if(n%4==3)
        return n-1;
        else
        return n+1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
    }

}

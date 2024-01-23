import java.util.*;

public class PrintNto1UsingRecursion {
    public static void main(String[] args) {
        int n=5;
        solve(n,1);
    }
    public static void solve(int a,int s){
        if(a<s)
        return ;
        else{
            System.out.println(a);
           solve(a-1,s);
        }
    }
    
}



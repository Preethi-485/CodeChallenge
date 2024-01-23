import java.util.*;
public class Print1toNRecursion {
    public static void main(String[] args) {
        int n=5;
        solve(1,n);
    }
    public static void solve(int a,int s){
        if(a>s)
        return ;
        else{
            System.out.println(a);
           solve(a+1,s);
        }
    }
    
}

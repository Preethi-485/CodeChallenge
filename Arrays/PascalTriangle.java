import java.util.*;
public class PascalTriangle{
    public static List<List<Integer>> pascal(int n){
       List<List<Integer>> res=new ArrayList<List<Integer>>();
       for(int i=1;i<=n;i++){
           res.add(row(i));
       }
       return res;
    }
    public static List<Integer> row(int n){
        int val=1;
        List<Integer> r=new ArrayList<>();
        r.add(1);
        for(int i=1;i<n;i++){
            val=val*(n-i);
            val=val/i;
            r.add((int)val);
        }
        return r;

    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println(pascal(n));
    }
}
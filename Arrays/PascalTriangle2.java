import java.util.*;
public class PascalTriangle2{
    
    public static List<Integer> pascal2(int n){
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++){
            res.add(pascal1(i+1));
          //  System.out.println(res);
        }
       // List<Integer> l=
       
        return res.get(res.size()-1);
       // return l.get(l.size()-1);

    }
    public static List<Integer> pascal1(int n){
        int val=1;
        List<Integer> l=new ArrayList<>();
        l.add(1);
        for(int i=1;i<n;i++){
            val=val*(n-i);
            val/=i;
            l.add(val);
        }
        return l;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(pascal2(n+1));


    }

}
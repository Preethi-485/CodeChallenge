import java.util.*;
public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int n=5;
        int m=3;
        int n1[]={1,2,3,4,5};
        int n2[]={1,2,3};
        System.out.println(doUnion(n1,n,n2,m));
    }
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<n;i++)
        h.add(a[i]);
        for(int val:b)
        h.add(val);
        return h.size();
    }
}
import java.util.*;
class kthElementOfSortedArrays{
    public static void main(String[] args){
        int n1[]={2, 3, 6, 7, 9};
        int n2[]= {1, 4, 8, 10};
        int a1=n1.length;
        int a2=n2.length;
        int k=5;
        System.out.println(kthElement(n1,n2,a1,a2,k));

    }
    public static int kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
        int res[]=new int[n+m];
        int i=0;
        for(int val:arr1)
        res[i++]=val;
        for(int val:arr2)
        res[i++]=val;
        Arrays.sort(res);
        return res[k-1];
    }
}
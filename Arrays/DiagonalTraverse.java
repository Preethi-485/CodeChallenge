import java.util.*;
import java.util.ArrayList; 

public class DiagonalTraverse{
    public static int[] traverse(int mat[][],int r,int c){
        int arr[]=new int[r*c];
        HashMap<Integer,List<Integer>> h=new HashMap<>();
        for(int i=0;i<=(r+c-2);i++){
            h.put(i,new ArrayList<>());
        }
        for(int k=0;k<=(r+c-2);k++){
            List<Integer> l=h.get(k);

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               
                if(i+j==(k))
                l.add(mat[i][j]);
              

            }

        }
       // System.out.println(l);
    }
      /* */
       for(int i=0;i<=(r+c-2);i++){
           if((i)%2==0)
           Collections.reverse(h.get(i));



        }
      /*   for(int i=0;i<=(r+c-2);i++){
            System.out.println(h.get(i));
 
 
 
         }*/
         int val=0;
         for(int i=0;i<=r+c-2;i++){
            List<Integer> l=h.get(i);
              
            for(int j=0;j<l.size();j++){
                arr[val]=l.get(j);
                val++;
              //  System.out.printf("%d ",l.get(j));

            }
          //  System.out.printf("\n");
        }
        /* int i=0;
         while(i<r*c){
             for(int k=0;k<=(r+c-2);k++){
            // List<Integer> res=h.get(i);
             for(int j=0;j<(h.get(i)).size();j++){
                 arr[i]=(h.get(i)).get(j);
                 i++;
             }
             }

         }*/
        /* for(int i=0;i<r*c;i++)
         System.out.printf("%d ",arr[i]);*/
         return arr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //int mat[][]=new int[4][4];
        int r=4;
        int c=4;
        int mat[][]={{00,01,02,03},{10,11,12,13},{20,21,22,23},{30,31,32,33}};
      //  mat={[00,01,02,03]}
      /*for(int i=0;i<mat.length;i++){
          for(int j=0;j<mat[i].length;j++)
          System.out.printf("%d ",mat[i][j]);
          System.out.printf("\n");

      }*/
      System.out.println(traverse(mat,r,c));
    }
}
import java.util.*;
public class MatrixSwap{
    
    public static void main(String[] args){
        int m=3;
        int n=4;
        int mat[][]={{1,2,3},{4,5,6},{7,8,9},{3,7,8}};
        mat=swap(n,m,mat);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.printf("%d ",mat[i][j]);
            }
            System.out.printf("\n");
        }



    }
    public static int[][] swap(int n,int m,int mat[][]){
        int start=0;
        int end=n-1;
        while(start<end){
            for(int j=0;j<m;j++){
                int temp=mat[start][j];
                mat[start][j]=mat[end][j];
                mat[end][j]=temp;
            }
            start++;
            end--;
        }
        return mat;
    }
}
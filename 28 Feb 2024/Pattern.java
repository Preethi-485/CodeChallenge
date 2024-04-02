import java.util.*;
public class Pattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        pat(mat,n);
    }
    public static void pat(int mat[][],int n){
        int starti=0;
        int startj=0;
        int endi=n-1;
        int endj=n-1;
        while(startj<endj){
        
        while(starti<endi){
            System.out.printf("i : %d%d \n",starti,endi);


            starti++;
            endi--;
        }
        System.out.printf("j: %d%d \n",startj,endj);

        startj++;
        endj--;

    }
    }

public static void matrix(int mat[][],int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.printf("%d ",mat[i][j]);
        }
        System.out.printf("\n");
    }
}
}
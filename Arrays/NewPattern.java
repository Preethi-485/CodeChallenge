import java.util.*;
public class NewPattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int mat[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=0;

            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(j==0 && i!=0)
                mat[i][j]=-1;
                                                                                                                             
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf("%d ",mat[i][j]);

            }
            System.out.printf("\n");
        }
    }
}
import java.util.*;
public class SetMatrixZero{
    public static int[][] setmat(int mat[][],int r,int c){
        List<Integer> row=new ArrayList<>();
        List<Integer> col=new ArrayList<>();

            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(mat[i][j]==0){
                    row.add(i);
                    col.add(j);
                    }

                }
            }for(int k=0;k<row.size();k++){
                int r1=row.get(k);
                int c1=col.get(k);
                
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(i==r1)
                    mat[r1][j]=0;
                    if(j==c1)
                    mat[i][c1]=0;

                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf("%d ",mat[i][j]);
            }
        System.out.printf("\n");
    }
            System.out.println(row);
            System.out.println(col);

        return mat;
    }
    public static void main(String[] args){
        int mat[][]={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int r=3;
        int c=4;
        setmat(mat,r,c);
    }
}

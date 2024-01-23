import java.util.*;
class MatrixPrint{
    public static void main(String[] args){
        int n=4;
        int m=5;
        char mat[][]=new char[n+1][m+1];
        char res[][]=rec(0,n-1,0,m-1,mat);
        ArrayList<ArrayList<Character>> l=new ArrayList<ArrayList<Character>>();
        for(int i=0;i<n;i++){
            ArrayList<Character> r=new ArrayList<Character>();
            for(int j=0;j<m;j++){
                r.add(res[i][j]);
            }
            l.add(r);
        }
System.out.println(l);
    }
    //char[][] matrix=new char[]
    public static char[][] rec(int rowStart,int rowEnd,int colStart,int colEnd,char[][] mat){
        if(rowStart>rowEnd)
        return mat;
        else{
        for(int i=rowStart;i<=rowEnd;i++){
            for(int j=colStart;j<=colEnd;j++){
                if(i==rowStart||i==rowEnd||j==colStart||j==colEnd)
                mat[i][j]='X';
                else
                mat[i][j]='O';
            }
        }
        return rec(rowStart+2, rowEnd-2, colStart+2, colEnd-2, mat);}


    } 
}
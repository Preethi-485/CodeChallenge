import java.util.*;
public class SpiralMatrix2{
    public static List<Integer> spiral(List<Integer> l,int mat[][],int r,int c,int lefti,int leftj,int righti,int rightj,int bottomi,int bottomj,int lasti,int lastj,int topi,int topj){
       //System.out.printf("%d ",mat[topi][topj]);
      /* if(mat[lefti][leftj]!=-1&&mat[topi][topj]==1){
        System.out.println(mat[lefti][leftj]);
        return;}*/




        if(mat[topi][topj]==-1||mat[lefti][leftj]==-1)
        return l;
        


        //left to right loop
        for(int i=leftj;i<=rightj;i++){
            l.add(mat[lefti][i]);
          //  System.out.printf("%d ",mat[lefti][i]);
            mat[lefti][i]=-1;
        }
        //right to bottom loop
        for(int i=righti+1;i<=bottomi;i++){
            l.add(mat[i][rightj]);
           // System.out.printf("%d ",mat[i][rightj]);
            mat[i][rightj]=-1;
        }
        //bottom to last loop
        for(int i=bottomj-1;i>=lastj;i--){
            l.add(mat[bottomi][i]);
            mat[bottomi][i]=-1;
        }
        //last to top loop
        for(int i=lasti-1;i>=topi;i--){
            l.add(mat[i][lastj]);
            mat[i][lastj]=-1;
        }

       
        spiral(l,mat,r,c,lefti+1,leftj+1,righti+1,rightj-1,bottomi-1,bottomj-1,lasti-1,lastj+1,topi+1,topj+1);
        return l;
    }
    public static void main(String[] args){
        int r=3;
        int c=4;
        int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> l=new ArrayList<>();

        spiral(l,mat,r,c,0,0,0,c-1,r-1,c-1,r-1,0,1,0);
    }
}